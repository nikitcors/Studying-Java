package lvl14.lesson3.N1;

import java.util.Formatter;

public class IranianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 50;
    }

    String getDescription(){
        Formatter outStr = new Formatter();
        return outStr.format("%s Моя страна Иран. Я несу %d яиц в месяц",
                super.getDescription(), getCountOfEggsPerMonth() ).toString();
    }
}
