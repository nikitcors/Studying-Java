package lvl21.lesson1.N5;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File your_file_name = new File("C:\\1.txt");//File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            System.out.println(ivanov.equals(somePerson));

            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            //if (name == null ? !name.equals(human.name) : human.name == null) return false;
            //return assets != null ? assets.equals(human.assets) : human.assets == null;
            if (name == null || !name.equals(human.name)) return false;
            if (assets == null || !assets.equals(human.assets)) return false;
            return true;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) {
            PrintWriter writer = new PrintWriter(outputStream);

            writer.println(name);

            writer.println( (!assets.isEmpty() ? "Yes" : "No"));
            for (Asset currentAsset:
                    assets) {
                writer.println(currentAsset.getName());
                writer.println(currentAsset.getPrice());
            }
            //writer.println("--");
            writer.close();
        }

        public void load(InputStream inputStream) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            this.name = reader.readLine();
            assets = new ArrayList<>();
            if (reader.readLine().equals("Yes")) {
                String currentAsset = reader.readLine();
                while (currentAsset != null){
                    Asset asset =new Asset(currentAsset);
                    asset.setPrice(Double.parseDouble(reader.readLine()));
                    currentAsset = reader.readLine();
                    this.assets.add(asset);
                }
            }
            reader.close();
        }
    }
}
