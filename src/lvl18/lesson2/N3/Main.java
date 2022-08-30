package lvl18.lesson2.N3;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inFile = new FileInputStream(inStr.readLine());

        byte[] secondByte = new byte[(int)Math. ceil (inFile.available() / 2)];
        byte[] firstByte = new byte[inFile.available() - secondByte.length];
        FileOutputStream outFile1 = new FileOutputStream(inStr.readLine());
        FileOutputStream outFile2 = new FileOutputStream(inStr.readLine());
        int current = 0;
        while (inFile.available() > 0){


            outFile1.write(firstByte);

            inFile.read(secondByte);
            inFile.read(firstByte);
            outFile2.write(secondByte);
        }

        inStr.close();
        outFile1.close();
        outFile1.close();
        inFile.close();
    }
}
