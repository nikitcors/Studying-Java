package lvl6.lesson1;

public class Cat {

    static int CountCat = 0;
    public Cat(){
        CountCat++;
    }
    protected void finalize() throws Throwable{
        System.out.println("Еще одна кошечка уничтожена(");
        CountCat--;
    }
}
