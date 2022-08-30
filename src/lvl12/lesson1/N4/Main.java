package lvl12.lesson1.N4;

public class Main {
    public static void main(String[] args)  {
        GetTypte(new Cat());
        GetTypte(new Bird());
        GetTypte(new Lamp());
        GetTypte(new Cat());
        GetTypte(new Dog());
    }

    static void GetTypte(Object o){
        if (o instanceof Dog) {
            System.out.println("Собака");
        }
        if (o instanceof Cat) {
            System.out.println("Кошка");
        }
        if (o instanceof Bird) {
            System.out.println("Птица");
        }
        if (o instanceof Lamp) {
            System.out.println("Лама");
        }
    }

    public static class Cat
    {
    }
    public static class Dog
    {
    }
    public static class Bird
    {
    }
    public static class Lamp
    {
    }

}
