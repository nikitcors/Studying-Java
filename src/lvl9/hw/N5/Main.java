package lvl9.hw.N5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
        Set<String> VowelsCol = new HashSet<>();
        Collections.addAll(VowelsCol,"а", "у", "о", "ы", "и", "э", "я", "ю", "ё", "е");
        Set<String> ConsonantsCol = new HashSet<>();
        Collections.addAll(ConsonantsCol, "Б", "В", "Г", "Д", "Ж", "З", "Й", "К", "Л", "М", "Н", "П", "Р", "С", "Т", "Ф", "Х", "Ц", "Ч", "Ш", "Щ");
        String VowelsOut = "";
        String ConsonantsOut = "";

        String WorkStr = InStr.readLine();

        for (char Symbol:
                WorkStr.toCharArray()) {
            if (VowelsCol.contains(String.valueOf(Symbol).toLowerCase(Locale.ROOT)) || VowelsCol.contains(String.valueOf(Symbol).toUpperCase(Locale.ROOT))) {
                VowelsOut +=  String.valueOf(Symbol) +  " ";
            }

            if (ConsonantsCol.contains(String.valueOf(Symbol).toLowerCase(Locale.ROOT)) || ConsonantsCol.contains(String.valueOf(Symbol).toUpperCase(Locale.ROOT))) {
                ConsonantsOut += String.valueOf(Symbol) + " ";
            }
        }

        System.out.println(VowelsOut);
        System.out.println(ConsonantsOut);
    }
}
