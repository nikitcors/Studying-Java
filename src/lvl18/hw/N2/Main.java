package lvl18.hw.N2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inFile = new FileInputStream (inStr.readLine());
        FileOutputStream outFile = new FileOutputStream(inStr.readLine());

        while (inFile.available() > 0){
            outFile.write(inFile.read());
        }

        inFile = new FileInputStream (inStr.readLine());
        while (inFile.available() > 0){
            outFile.write(inFile.read());
        }

        inStr.close();
        inFile.close();
        outFile.close();

    }

}
