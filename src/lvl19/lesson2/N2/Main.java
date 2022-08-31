package lvl19.lesson2.N2;


import com.sun.deploy.util.StringUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inStr = new Scanner(System.in);
        String fileNameFirst = inStr.nextLine();
        //String fileNameSecond = inStr.nextLine();

        FileReader inFile = new FileReader(fileNameFirst);
        String Words = "";

        while (inFile.ready()){
            char sybol = (char) inFile.read();
            Words += sybol;
        }
        String World = Words.replaceAll("world", "");
        int count = Words.length() - Words.replaceAll("world", "").length();
        inFile.close();
        System.out.println(count/5);
    }
}

