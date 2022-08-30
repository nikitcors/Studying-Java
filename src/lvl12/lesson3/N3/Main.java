package lvl12.lesson3.N3;

public class Main {

    public static void main(String[] args)  {
    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal{
        public String getName(){
            return "Я корова!";
        }
    }
}

