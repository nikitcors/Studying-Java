package lvl16.hw.N12;

import javax.imageio.metadata.IIOMetadataNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static void main(String[] args) {
        for (Thread th : threads)
            th.start();
    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while(true){

            }
        }
    }
    public static class Thread2 extends Thread{
        @Override
        public void run() {
            try{
                throw new InterruptedException("Тут я");
            }catch (InterruptedException e){

            }
        }
    }
    public static class Thread3 extends Thread{
        @Override
        public void run() {
            try {
                System.out.println("Ура!");
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public static class Thread4 extends Thread implements Message {
        @Override
        public void run() {
            //super.run();
            while (!Thread.currentThread().isInterrupted())
            showWarning();
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }
    public static class Thread5 extends Thread{
        @Override
        public void run() {
            int Summ = 0;
            BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
            String currentStr = "";
            while (!currentStr.equals("N")){
                try {
                    currentStr = inStr.readLine();
                    Summ += Integer.parseInt(currentStr);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                catch (IllegalArgumentException e){
                    continue;
                }
            }
            System.out.println(Summ);
        }
    }
}
