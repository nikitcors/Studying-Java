package lvl15.lesson5.N5;

public class Main {
    public static Cat cat;

    static {
        cat = new Cat ();
        cat.name = "Barsik";
        System.out.println(cat.name);
    }

    public static class Cat {
        public String name;

    }

    public static void main(String[] args) {

    }

}
