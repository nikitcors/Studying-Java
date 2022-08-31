package lvl21.lesson1.N1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {

            File your_file_name = new File("C:\\1.txt");//File.createTempFile("d:\\5.txt", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if (ivanov.equals(somePerson))
                System.out.println(true);

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

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);

            writer.println(this.name );

            String isAssets = !assets.isEmpty() ? "yes" : "no";
            writer.println(isAssets);
            if (!assets.isEmpty()){
                for (Asset asset :
                        assets) {
                    writer.println(String.format("%s : стоит %s ", asset.getName(), Double.toString(asset.getPrice())));
                }
            }

            writer.close();

        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            this.name = reader.readLine();

            String assetsPresent = reader.readLine();
            if (assetsPresent.equals("yes")){
                String currentAssets = reader.readLine();
                while((currentAssets != null) ){
                    if ( !currentAssets.contains("стоит")) break;
                    Asset asset = new Asset(currentAssets.split(" ")[0]);
                    asset.setPrice(Double.parseDouble(currentAssets.split(" ")[3]));
                    assets.add(asset);
                    currentAssets = reader.readLine();
                }
            }
            reader.close();

        }
    }
}
