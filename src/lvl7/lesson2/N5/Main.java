package lvl7.lesson2.N5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> InStrs = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
            InStrs.add(InStr.readLine());
        }
        for (int i = 0; i < 13; i ++){
            String LasStr = InStrs.get(InStrs.size() - 1);
            InStrs.remove(InStrs.size() - 1);
            InStrs.add(0,LasStr);
            for (String OutStr : InStrs) {
                System.out.println("Текущий элент: " + OutStr);
            }
        }

    }
}
