package lvl7.lesson2.N2;

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

        String MaxLenStr = InStrs.get(0);
        ArrayList<String> OutStrs = new ArrayList<String>();

        for (String Str : InStrs){
            if (MaxLenStr.length() < Str.length()){
                MaxLenStr =  Str;
                OutStrs = new ArrayList<String>();
                OutStrs.add(Str);
            } else if (MaxLenStr.length() == Str.length()) {
                OutStrs.add(Str);
            }
        }

        for (String OutStr : OutStrs)
        {
            System.out.println("Текущий элент: " + OutStr);
        }
    }

}
