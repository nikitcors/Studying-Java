package lvl12.lesson3.N5;

public class Main {
    public static void main (String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName(){
            return "Я - Кошка!";
        }

        public Pet getChild(){
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        public String getName(){
            return "Я - Собака!";
        }

        public Pet getChild(){
            return new Dog();
        }
    }

}
