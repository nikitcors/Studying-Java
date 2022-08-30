package lvl13.lesson1.N3;


public class Main {
    public static void main(String[] args) {
        print(new Cola());
        print(new Beer());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Cola implements Drink{

        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }

    public static class Beer implements Drink{

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
}

