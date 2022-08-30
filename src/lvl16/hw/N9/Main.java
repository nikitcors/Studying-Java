package lvl16.hw.N9;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws InterruptedException {
        Read3Strings read3Strings1 = new Read3Strings();
        Read3Strings read3Strings2 = new Read3Strings();
        Read3Strings read3Strings3 = new Read3Strings();
        read3Strings1.start();
        read3Strings1.join();
        read3Strings2.start();
        read3Strings2.join();
        read3Strings3.start();
        read3Strings3.join();
        System.out.println(read3Strings1);
        System.out.println(read3Strings2);
        System.out.println(read3Strings3);
    }

    public static class Read3Strings extends Thread{
        String str = "";
        @Override
        public void run() {

            for (int i = 0; i < 3; i++){
                try {
                    str += Main.inStr.readLine() + " ";
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        @Override
        public String toString() {
            return str;
        }
    }
}
