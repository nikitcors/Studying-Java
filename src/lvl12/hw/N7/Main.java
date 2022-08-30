package lvl12.hw.N7;



public class Main {
    public static void main(String[] args) {
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
    public static class Duck implements Fly, Swim, Run{

        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public static class Penguin implements Swim, Run{

        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public static class Toad implements Swim{

        @Override
        public void swim() {

        }
    }

}
