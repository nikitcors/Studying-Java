package lvl7.lesson3.N5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> InStrs = new ArrayList<String>();
        Collections.addAll(InStrs, "Рара", "Лала", "Рара","Лала","Лара", "Вава" , "Мама");
        InStrs = Main.doubleValues (InStrs);
        for (String OutStr : InStrs)
        {
            System.out.println("Текущий элент: " + OutStr);
        }
    }

    static ArrayList<String> doubleValues (ArrayList<String> InStrs){
        for (int i = 0; i < InStrs.size(); i++){
             InStrs.add(i,InStrs.get(i)); i++;
        }
        return InStrs;
    }


}
