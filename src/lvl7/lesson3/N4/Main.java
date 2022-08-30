package lvl7.lesson3.N4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> InStrs = new ArrayList<String>();
        Collections.addAll(InStrs, "Рара", "Лала", "Рара","Лала","Лара", "Вава" , "Мама");
        InStrs = Main.fix(InStrs);
        for (String OutStr : InStrs)
        {
            System.out.println("Текущий элент: " + OutStr);
        }
    }

    static ArrayList<String> fix(ArrayList<String> InStrs){
       for (int i = 0; i < InStrs.size(); i++){
           String OutStr = InStrs.get(i);
           OutStr = OutStr.toLowerCase(Locale.ROOT);
           if (OutStr.contains("р") && OutStr.contains("л")) { continue;}
           if (OutStr.contains("р")) { InStrs.remove(i); i--;}
           if (OutStr.contains("л")) { InStrs.add(i,InStrs.get(i)); i++;}
       }
       return InStrs;
    }

}
