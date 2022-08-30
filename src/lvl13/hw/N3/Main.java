package lvl13.hw.N3;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inFileName = new BufferedReader(new InputStreamReader(System.in));
        InputStream isStream;
        try {
            isStream = new FileInputStream(inFileName.readLine());
            while (isStream.available() > 0){
                System.out.print((char)(isStream.read()));

            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        isStream.close();

    }
}
