package lvl7.lesson1.N1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
       int[] arrayInt = new int[20];
       for (int i = 0; i < arrayInt.length; i++)
       {
           BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
           arrayInt[i] = Integer.parseInt(InStr.readLine());
       }
       System.out.println(max(arrayInt));
    }

    static int max(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}
