package lvl13.lesson1.N2;

public class Main {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {

        @Override
        public boolean isAlcoholic() {
            return false;
        }

        @Override
        public String toString (){
            return isAlcoholic() ? "да" : "нет";
        }
    }
}
