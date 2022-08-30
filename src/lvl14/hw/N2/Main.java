package lvl14.hw.N2;

public class Main {
    public static void main(String[] args)   {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    static Drink getDeliciousDrink (){
        return new Wine();
    }
    static Wine getBubblyWine (){
        return new BubblyWine();
    }
    static Wine getWine (){
        return new Wine();
    }

}
