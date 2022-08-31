package lvl19.lesson2.N3;


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
        String Words = "";
        //char[]
        while (inFile.ready()){
            char sybol = (char) inFile.read();
            Words += sybol;
            /*try{
                int numb = Integer.parseInt(Words);
                Words += " ";
                outFile.write(Words);
            }catch (NumberFormatException e){

            }
            Words = "";*/
        }
        inFile.close();

        for (String symbol:
                Words.split(" ")) {
            try{
                int numb = Integer.parseInt(symbol);
                outFile.write(symbol + " ");
            }catch (NumberFormatException e){

            }
        }

        outFile.close();

    }
}
