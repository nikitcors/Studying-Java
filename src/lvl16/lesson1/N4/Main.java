package lvl16.lesson1.N4;

public class Main {
    public static void main(String[] args) {
        SpecialThread specialThread = new SpecialThread();
        Thread thread = new Thread(specialThread);
        thread.start();
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element.getMethodName());
        }
    }

    public static class SpecialThread implements Runnable{
        @Override
        public void run() {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for (StackTraceElement element:
                    stackTraceElements) {
                System.out.println(element.getMethodName());
            }
        }
    }
}
