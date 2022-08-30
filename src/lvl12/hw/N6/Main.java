package lvl12.hw.N6;


public class Main {

    public static void main(String[] args) {


    }

    public interface Fly{
        void fly();
    }

    public interface Climb{
        void climb();
    }

    public interface Run{
        void run();
    }
    public static class Cat implements Climb,Run{

        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public static class Dog implements Run {

        @Override
        public void run() {

        }
    }

    public static class Tiger extends Cat {

    }

    public static class Duck implements Fly, Run {


        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
