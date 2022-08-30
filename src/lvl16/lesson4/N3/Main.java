package lvl16.lesson4.N3;

public class Main {

    public static void main(String[] args)  {
        TestThread TestThread = new TestThread();
        Thread tr = new Thread(TestThread);
        tr.start();
        tr.interrupt();
    }

    public static class TestThread extends Thread{
        @Override
        public void run() {
            super.run();
            try {
                sleep(10000);
            } catch (InterruptedException e) {
               // throw new RuntimeException(e);
            }
        }
    }
}

