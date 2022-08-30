package lvl7.lesson3.N3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> InStrs = new ArrayList<String>();
        Collections.addAll(InStrs,"мама","мыла","раму");
        for (int i = 1; i <= InStrs.size(); i += 2)
        {
            InStrs.add(i,"именно");
        }

        for (String OutStr : InStrs)
        {
            System.out.println("Текущий элент: " + OutStr);
        }
    }

}
