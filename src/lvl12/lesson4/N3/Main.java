package lvl12.lesson4.N3;

public class Main {

    public static void main(String[] args)  {
    }

    public interface Fly {
        void fly();
    }

    public interface Move {
        void move();
    }

    public interface Eat {
        void eat();
    }

    public static class Dog implements Move,Eat{
        @Override
        public void move(){

        }
        @Override
        public void eat(){

        }
    }

    public static class Car implements Move {
        @Override
        public void move() {

        }
    }

    public static class Duck implements Fly,Eat{
        @Override
        public void fly(){

        }
        @Override
        public void eat(){

        }
    }

    public static class Airplane implements Move,Fly{
        @Override
        public void move(){

        }
        @Override
        public void fly(){

        }
    }
}

