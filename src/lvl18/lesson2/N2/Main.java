package lvl18.lesson2.N2;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inFile = new FileInputStream(inStr.readLine());
        int countOfCommas = 0;

        while (inFile.available() >0){
            char inChar = (char)inFile.read();
            if (inChar == ',') countOfCommas++;
        }
        inFile.close();
        System.out.println(countOfCommas);
    }
}

