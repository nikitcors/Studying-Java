package lvl20.lesson1.N4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File your_file_name = new File("C:\\1.txt");//File.createTempFile("your_file_name", null);
        OutputStream outputStream = new FileOutputStream(your_file_name);
        InputStream inputStream = new FileInputStream(your_file_name);

        ClassWithStatic classWithStatic = new ClassWithStatic();
        classWithStatic.i = 3;
        classWithStatic.j = 4;
        classWithStatic.save(outputStream);
        outputStream.flush();

        ClassWithStatic loadedObject = new ClassWithStatic();
        loadedObject.staticString = "something";
        loadedObject.i = 6;
        loadedObject.j = 7;

        loadedObject.load(inputStream);
        //check here that classWithStatic object equals to loadedObject object - проверьте тут, что classWithStatic и loadedObject равны
        if (classWithStatic.equals(loadedObject)) System.out.println("Yes");
        outputStream.close();
        inputStream.close();

        System.out.println(ClassWithStatic.staticString);
        System.out.println(loadedObject.i);
        System.out.println(loadedObject.j);
    }

    public static class ClassWithStatic {
        public static String staticString = "it's test static string";
        public int i;
        public int j;
        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);

            writer.println(ClassWithStatic.staticString);
            writer.println(i);
            writer.println(j);
            writer.close();
        }
        public void load(InputStream inputStream) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            ClassWithStatic.staticString = reader.readLine();
            i = Integer.parseInt(reader.readLine());
            j = Integer.parseInt(reader.readLine());
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
