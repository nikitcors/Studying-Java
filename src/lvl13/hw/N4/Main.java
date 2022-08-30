package lvl13.hw.N4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader inFileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter outStream;
        try {
            outStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inFileName.readLine())));

            for (int i = 0; i < ("Мама мыла раму").toCharArray().length; i++) {
                outStream.write(( int)("Мама мыла раму").charAt(i));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        outStream.close();
        inFileName.close();

    }
}
