package lvl18.hw.N4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = inStr.readLine();
        String secondFile = inStr.readLine();
        FileInputStream inFileFerst = new FileInputStream (firstFile);
        FileInputStream inFileSecond = new FileInputStream (secondFile);
        byte[] inByte = new byte[inFileFerst.available() ];
        byte[] inByteSec = new byte[inFileSecond.available() ];

        if (inFileFerst.available() > 0) inFileFerst.read(inByte);
        if (inFileSecond.available() > 0) inFileSecond.read(inByteSec);

        byte[] ResultByte = new byte[inByte.length +  inByteSec.length];

        for (int i = 0; i < inByteSec.length-1; i ++){
            ResultByte[i] = inByteSec[i];
        }

        for (int i = inByteSec.length; i < ResultByte.length - 1; i ++){
            ResultByte[i] = inByte[i - inByteSec.length];
        }

        inFileFerst.close();
        inFileSecond.close();

        FileOutputStream outFile = new FileOutputStream(secondFile);
        outFile.write(ResultByte);


        inStr.close();
        outFile.close();
    }
}
