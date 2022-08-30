package lvl16.hw.N1;


import sun.awt.windows.ThemeReader;

public class Main {
    static int count = 5;

    public static void main(String[] args) {
        NameOfDifferentThreads tt = new NameOfDifferentThreads();
        tt.start();
        for (int i = 0; i < count; i++) {
            tt.printMsg();
        }
    }

    public static class NameOfDifferentThreads extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg()   {
            Thread t = Thread.currentThread();//null;//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("name=" + name);
            try {
                sleep(1);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
            //add sleep here - добавь sleep тут
        }
    }
}
