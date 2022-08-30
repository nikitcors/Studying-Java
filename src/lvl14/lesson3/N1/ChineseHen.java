package lvl14.lesson3.N1;

import java.util.Formatter;

public class ChineseHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 1000;
    }

    String getDescription(){
        Formatter outStr = new Formatter();
        return outStr.format("%s Моя страна Китай. Я несу %d яиц в месяц",
                super.getDescription(), getCountOfEggsPerMonth() ).toString();
    }
}
