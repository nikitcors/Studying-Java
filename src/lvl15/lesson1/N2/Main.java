package lvl15.lesson1.N2;

public class Main {
    public static class Goose extends SmallAnimal{
        public String getSize(){
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal{
        public String getSize(){
            return "Дракон большой, " + super.getSize();
        }
    }
    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
