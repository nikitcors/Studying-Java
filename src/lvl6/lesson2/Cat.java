package lvl6.lesson2;

public class Cat {
    static int catCount;

    public Cat(){
        Cat.catCount++;
    }

    public static int getCatCount (){
        return catCount;
    }

    public static void setCatCount(int catCount){
        Cat.catCount = catCount;
    }
}
