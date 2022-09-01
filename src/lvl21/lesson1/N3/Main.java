package lvl21.lesson1.N3;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Main {
        public static Map<String, String> properties = new HashMap<>();
        public static Properties prop = new Properties();
        public static String filName = "C://1.properties";

        public void fillInPropertiesMap() throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            filName = reader.readLine();
            reader.close();
            InputStream inStream = new FileInputStream(Main.filName);
            load(inStream);
            inStream.close();
        }
        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            //BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            prop.clear();
            prop.load(inputStream);
            for (Map.Entry<Object, Object> pair :
                    prop.entrySet()) {
                String key = pair.getKey().toString();
                String value = pair.getValue().toString();
                properties.put(key, value);
            }

        }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        //PrintWriter  writer = new PrintWriter (outputStream);
        Properties prop = new Properties();
        for (Map.Entry<String, String> pair :
                properties.entrySet()){
            prop.put(pair.getKey(),pair.getValue());
        }
        prop.store(outputStream,"");
    }


        public static void main(String[] args) throws Exception {
        Main solution = new Main();
            solution.fillInPropertiesMap ();

            FileOutputStream fileOutputStream = new FileOutputStream(Main.filName);
            solution.save(fileOutputStream);
            fileOutputStream.close();
        }

}

