package lvl14.lesson3.N1;

public class HenFactory {

    static Hen getHen(String country){
        Hen henCurrent = null;
        henCurrent =  country.equals(Country.RUSSIA) ? new RussianHen() : henCurrent;
        henCurrent =  (country.equals(Country.CHINA) && (henCurrent == null)) ? new ChineseHen() : henCurrent;
        henCurrent =  (country.equals(Country.IRAN) && (henCurrent == null)) ? new IranianHen() : henCurrent;
        henCurrent =  (country.equals(Country.BELARUS) && (henCurrent == null)) ? new BelarusianHen() : henCurrent;
        return henCurrent;

    }
}
