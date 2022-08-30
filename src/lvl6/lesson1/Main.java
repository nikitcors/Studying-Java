package lvl6.lesson1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i=1; i <= 500; i++)
        {
            Cat cat = new Cat();
            Dog dog = new Dog();
            Thread.sleep(100);
        }
        System.out.println(Cat.CountCat);
    }
}
