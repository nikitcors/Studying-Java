package lvl8.lesson3.N1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<String> InInts = new HashSet<String>();
        for (int i = 0; i < 20; i++){
            InInts.add("Л № " + String.valueOf(i));
        }

        for (String OutStr:
                InInts) {
            System.out.println(OutStr);
        }
        
    }
}
