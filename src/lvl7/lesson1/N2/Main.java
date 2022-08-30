package lvl7.lesson1.N2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
       String[] arrayStr = new String[10];
       String OutStr = "";
       for (int i = 0; i < arrayStr.length - 2; i++)
       {
           BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
           //arrayInt[i] = String.valueOf(Integer.parseInt(InStr.readLine())));  //Для веревода из Int в String
           arrayStr[i] = InStr.readLine();

       }
        for (int i = 0; i < arrayStr.length ; i++)
        {
            OutStr += arrayStr[i];
        }
       System.out.println(OutStr);
    }

}
