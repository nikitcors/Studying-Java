package lvl6.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws IOException {
        System.out.println("Введите строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int readInt() throws IOException {
        System.out.println("Введите целое число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public static double readDoube() throws IOException {
        System.out.println("Введите число c плавающей точкой");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public static boolean readBoolean() throws IOException {
        System.out.println("Введите true или  false");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(reader.readLine());
    }
}
