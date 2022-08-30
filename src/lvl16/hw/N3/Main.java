package lvl16.hw.N3;


public class Main {

    static volatile int countCreatedThreads;
    static int count = 15;
    public static void main(String[] args)   {
        System.out.println(new GenerateThread(count + ""));
    }
    public static class GenerateThread extends Thread {

        public GenerateThread(String name) {
            super(name);
            this.start();
        }

        @Override
        public void run() {
            super.run();
            count--;
            if (count > 0) {System.out.println(new GenerateThread(count + ""));}

        }

        @Override
        public String toString() {
            return this.getName() + " created" ;
        }
    }
}
