package lvl14.lesson3.N1;

import java.text.Format;
import java.util.Formatter;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    String getDescription(){
        Formatter outStr = new Formatter();
        return outStr.format("%s Моя страна Россия. Я несу %d яиц в месяц",
                super.getDescription(), getCountOfEggsPerMonth() ).toString();
    }
}
