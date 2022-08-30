package lvl16.lesson1.N3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);
    public static void main(String[] args) {

        list.add(new Thread(new TestTreaf()));
        list.add(new Thread(new TestTreaf()));
        list.add(new Thread(new TestTreaf()));
        list.add(new Thread(new TestTreaf()));
        list.add(new Thread(new TestTreaf()));
    }

    public static class TestTreaf implements Runnable{
        @Override
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}

