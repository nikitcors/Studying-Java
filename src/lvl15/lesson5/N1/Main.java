package lvl15.lesson5.N1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Double,String> labels = new HashMap<>();
    static{
        labels.put(100D,"Red");
        labels.put(101D,"Yellow");
        labels.put(102D,"Green");
        labels.put(103D,"Blue");
        labels.put(104D,"Orange");
    }
    public static void main(String[] args)  {
        System.out.println(labels);
    }
}
