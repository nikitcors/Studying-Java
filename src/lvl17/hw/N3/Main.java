package lvl17.hw.N3;


import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args)   {

    }
    public static class Apteka implements Runnable{
        public boolean isStopped() {
            return isStopped;
        }

        public void setStopped() {
            isStopped = true;
        }

        boolean isStopped = false;

        public static String getRandomDrug(){
            Random random = new Random();
            int drug = random.nextInt(Drug.values().length);
            return Drug.values()[drug].name();
        }

        public static int getRandomCount(){
            Random random = new Random();
            return random.nextInt(1000);
        }

        public String drugsController(){
            try {
                sleep(300);
            } catch (InterruptedException e) {
                //
                e.getMessage();
            }
            return String.format("Приобретено: %s, в количестве %d", getRandomDrug(), getRandomCount());
        }

        @Override
        public void run() {

        }
    }

    public static class Person implements Runnable{
        public boolean isStopped() {
            return isStopped;
        }

        public void setStopped() {
            isStopped = true;
        }

        boolean isStopped = false;

        @Override
        public void run() {

        }

        public synchronized static String getRandomDrug(){
            Random random = new Random();
            int drug = random.nextInt(Drug.values().length);
            return Drug.values()[drug].name();
        }

        public synchronized static int getRandomCount(){
            Random random = new Random();
            return random.nextInt(1000);
        }

        public String drugsController(){
            try {
                sleep(300);
            } catch (InterruptedException e) {
                //
                e.getMessage();
            }
            return String.format("Продано: %s, в количестве %d", getRandomDrug(), getRandomCount());
        }
    }
}
