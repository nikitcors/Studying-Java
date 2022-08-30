package lvl5hw4;
import java.io .*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Calendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        System.out.println("" + calendar.get(Calendar.DAY_OF_WEEK) + " "
                + calendar.get(Calendar.WEEK_OF_MONTH) + " "
                + calendar.get(Calendar.YEAR));
    }
}