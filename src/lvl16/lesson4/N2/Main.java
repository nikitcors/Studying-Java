package lvl16.lesson4.N2;


public class Main {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            int startSeconds = countSeconds;
            //System.out.print();
            while (!Thread.currentThread().isInterrupted()){
                if (countSeconds != 0){System.out.print(countSeconds + " ");}
                countSeconds--;
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    if (startSeconds > 3){
                        System.out.print("Прервано!");
                        return;
                    }
                    else {
                        System.out.print("Марш!");
                        //throw new RuntimeException(e);
                        return;
                    }
                }

            }
            System.out.print("Марш!");
            return;
        }
    }

}
