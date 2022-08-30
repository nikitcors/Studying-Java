package lvl14.hw.N11;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
        try {
            Integer.parseInt("");

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            List<Integer> NullList = null;
            NullList.add(1);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String S = null;
            char[] arrayS = S.toCharArray();
            arrayS[1] = '0';

        } catch (Exception e) {
            exceptions.add(e);
        }
        InputStream inStream = null;
        try {
            inStream = new FileInputStream("");

            while (inStream.available() > 0)
            {
                int data = inStream.read(); //читаем один байт из потока для чтения

            }

            inStream.close(); //закрываем потоки

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            float i = Float.NaN;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String str = null;
            str.trim();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object x = new Integer(0);
            System.out.println((String)x);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object o[] = new String[5];
            o[2] = new Integer(200);

        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
