package lvl16.lesson1.N2;

public class Main {
    public static void main(String[] args) {
        TestThread tr = new TestThread();
    }

    public static class TestThread extends Thread{
        static {
            System.out.println("it's static block inside TestThread");
        }
    }

}
