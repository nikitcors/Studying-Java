package lvl16.lesson1.N1;




public class Main {
    public static void main(String[] args)  {
        TestThread tr1 = new TestThread();
        Thread tr = new Thread(tr1);
        tr.start();
    }

    public static class TestThread implements Runnable{
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
