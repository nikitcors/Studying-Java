package lvl19.lesson2.N1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inStr = new Scanner(System.in);
        String fileNameFirst = inStr.nextLine();
        String fileNameSecond = inStr.nextLine();

        FileReader inFile = new FileReader(fileNameFirst);
        FileWriter outFile = new FileWriter(fileNameSecond);
        boolean oddCount = false;
        while (inFile.ready()){
            if (oddCount) {outFile.write(inFile.read()); oddCount = false;}
            else{oddCount = true; }
        }
        inFile.close();
        outFile.close();

    }
}
