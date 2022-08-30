package lvl15.lesson5.N2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int i;
    static int y;
    static {

        BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
        try {
            i = Integer.parseInt(InStr.readLine());
            y = Integer.parseInt(InStr.readLine());
            InStr.close();
        }catch (IOException E){

        }

    }
    public static void main(String[] args)  {
        System.out.println("" + i + " " + y);
    }
}
