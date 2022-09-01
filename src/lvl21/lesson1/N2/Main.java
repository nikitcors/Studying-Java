package lvl21.lesson1.N2;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            //File your_file_name = File.createTempFile("your_file_name", null);
            File your_file_name = new File("C:\\1.txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaC javaC = new JavaC();
            //initialize users field for the javaC object here - инициализируйте поле users для объекта javaRush тут
            User usr = new User();
            usr.setFirstName("Ivan");
            usr.setLastName("Ivanov");
            usr.setBirthDate(new GregorianCalendar(1980, 11, 25).getTime());
            usr.setCountry(User.Country.RUSSIA);
            usr.setMale(true);

            javaC.users.add(usr);

            javaC.save(outputStream);
            outputStream.flush();

            JavaC loadedObject = new JavaC();
            loadedObject.load(inputStream);
            //check here that javaC object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if(javaC.equals(loadedObject)) System.out.println(true + "");
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
            System.out.println(e.getMessage());
        }
    }

    public static class JavaC {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);

            String isUsersPresent = !users.isEmpty() ? "Yes" : "No";
            writer.println(isUsersPresent);

            if (!users.isEmpty()){
                for (User currentUser:
                     users) {
                    writer.println(String.format("User: %s %s %s %s %s",
                            currentUser.getFirstName(),currentUser.getLastName(),
                            "" + currentUser.getBirthDate().getTime(),
                            currentUser.isMale() + "",
                            currentUser.getCountry().name()));
                }
            }
            writer.flush();
        }


        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            users = new ArrayList<>();
            String isUserPreasent = reader.readLine();
            if (isUserPreasent.equals("Yes")){
                String currentUser = reader.readLine();
                while (currentUser != null){
                    User currenUserObj = new User();
                    String[] currentUserArr = currentUser.split(" ");
                    currenUserObj.setFirstName(currentUserArr[1]);
                    currenUserObj.setLastName(currentUserArr[2]);
                    currenUserObj.setBirthDate(new Date(Long.parseLong(currentUserArr[3])));
                    currenUserObj.setMale(Boolean.parseBoolean(currentUserArr[4] ));
                    currenUserObj.setCountry(User.Country.valueOf(currentUserArr[5]));
                    currentUser = reader.readLine();
                    users.add(currenUserObj);
                }
            }
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaC javaC = (JavaC) o;

            return users != null ? users.equals(javaC.users) : javaC.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }

}
