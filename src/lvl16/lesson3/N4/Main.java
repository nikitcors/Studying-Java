package lvl16.lesson3.N4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static volatile List<String> list = new ArrayList<String>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            /*if (countFrom > (list.size() - 1)) countFrom = list.size() - 1;
            for (int i = countFrom; i > 0; i--) {
                System.out.println(list.get(i));
                Thread.sleep(500);*/
            countFrom -=1;
            System.out.println(list.get(countFrom));
            Thread.sleep(500);

        }
    }
}

