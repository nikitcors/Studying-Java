package lvl16.hw.N6;


public class Main {

    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountDownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountDownRunnable implements Runnable {
        private int countIndexDown = Main.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexDown = 0;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown += 1;
                    if (countIndexDown == 5) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }

}
