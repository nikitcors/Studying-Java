package lvl7.lesson1.N4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++)
        {
            BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
            arrayInt[i] = Integer.parseInt(InStr.readLine());
        }
        for (int i = arrayInt.length - 1; i >= 0 ; i--)
        {
            System.out.println(arrayInt[i]);
        }
        //System.out.println(max(arrayInt));
    }

}
