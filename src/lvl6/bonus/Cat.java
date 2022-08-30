package lvl6.bonus;
import java.util.ArrayList;
public class Cat {
    public static int catCount = 0;
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    String name;
    public Cat(){
        name = "" + Cat.catCount;
        Cat.catCount++;
        Cat.cats.add(this);
    }

    public static void printCats(){
        for (Cat cat:
             cats) {
            System.out.println(cat.name);
        }
    }
}
