package lvl12.lesson4.N4;



public class Main {
    public static void main(String[] args)  {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public static class Airplane implements Fly {

        @Override
        public void fly() {

        }
    }

    public static class Human implements Run {

        @Override
        public void run() {

        }
    }

    public static class Duck implements Run,Fly {

        @Override
        public void run() {

        }
        @Override
        public void fly() {

        }

    }

    public static class Penguin implements Run {


        @Override
        public void run() {

        }
    }

}

