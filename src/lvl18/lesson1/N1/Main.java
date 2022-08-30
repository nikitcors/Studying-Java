package lvl18.lesson1.N1;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inFile = new FileInputStream(inStr.readLine());
        int max = 0;

        while (inFile.available() > 0){
            int data = inFile.read();
            if (data > max){
                max = data;
            }
        }

        System.out.println(max);
        inFile.close();
    }

}
