package lvl12.hw.N1;



public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();

        System.out.println(cat.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
        public String getName() {
            return "Я - кот";
        }
    }
}
