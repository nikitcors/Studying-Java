package lvl18.lesson2.N5;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, DownloadException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inFile = new FileInputStream(inStr.readLine());
        inStr.close();
        //inFile.re

        try {
            if (inFile.available() < 1000) throw new DownloadException();
        } catch (DownloadException e){
            System.out.println("Упс");
        }

        inFile.close();

    }

}
