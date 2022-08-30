package lvl7.lesson3.N2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> InStrs = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
            InStrs.add(InStr.readLine());
        }

        InStrs.remove(2);

        for (int i = InStrs.size() - 1; i >= 0; i--)
        {
            System.out.println("Текущий элент: " + InStrs.get(i));
        }
    }

}
