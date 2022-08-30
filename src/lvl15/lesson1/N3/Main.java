package lvl15.lesson1.N3;


public class Main {
    public static void main(String[] args) {
        new Main.LuxuriousCar().printlnDesire();
        new Main.CheapCar().printlnDesire();
        new Main.Ferrari().printlnDesire();
        new Main.Lanos().printlnDesire();
    }
    public static class LuxuriousCar{
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }
    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }
    public static class CheapCar{
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }
        public static class Lanos extends CheapCar {
            public void printlnDesire() {
                System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
            }

    }


    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}

