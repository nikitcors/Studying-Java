package lvl8.hw.N3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String,String> InStr = new HashMap<String,String>();
        for (int i = 0; i < 10; i++){
            System.out.println("Введите имя");
            BufferedReader NameBuf = new BufferedReader(new InputStreamReader(System.in));
            String Name = NameBuf.readLine();
            System.out.println("Введите фамилию");
            BufferedReader SecNameBuf = new BufferedReader(new InputStreamReader(System.in));
            String SecName = SecNameBuf.readLine();
            InStr.put(SecName,Name);
        }

        System.out.println("Введите для поиска");
        BufferedReader NameBuf = new BufferedReader(new InputStreamReader(System.in));
        String Name = NameBuf.readLine();
        System.out.println("Введите фамилию поиска");
        BufferedReader SecNameBuf = new BufferedReader(new InputStreamReader(System.in));
        String SecName = SecNameBuf.readLine();

        Integer FindClone = 0;
        for (Map.Entry<String, String> OutStr:
                InStr.entrySet()) {
            if ((OutStr.getValue().equals(Name)) || (OutStr.getKey().equals(SecName))) {
                FindClone++;
            }
        }
        System.out.println(FindClone);
    }
}
