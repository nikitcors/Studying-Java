package lvl16.lesson3.N3;

public class Main {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            if ((seconds == 0) && (minutes == 0) && (hours == 0))  System.out.println("В г. Лондон сейчас полночь!");
            else System.out.printf("В г. %s сейчас %d:%d:%d! \n",cityName,hours,minutes,seconds);
            Thread.sleep(100);
            seconds++;
            if (seconds > 59){
                seconds = 0;
                minutes++;
                if ((minutes > 59)) {
                    minutes = 0;
                    hours++;
                    if (hours > 23) {
                        hours =  0;

                    }
                }
            }



        }
    }

}

