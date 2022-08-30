package lvl14.lesson3.N1;


public class Main {
    public static void main(String[] args)  {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen.getDescription());
        hen = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen.getDescription());
        hen = HenFactory.getHen(Country.CHINA);
        System.out.println(hen.getDescription());
        hen = HenFactory.getHen(Country.IRAN);
        System.out.println(hen.getDescription());
    }
}
