package lvl8.lesson1.N2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> map =new HashMap<String, String>();
        map.put("арбуз","ягода");
        map.put("банан","трава");
        map.put("вишня","ягода");
        map.put("груша","фрукт");
        map.put("дыня","овощь");
        map.put("ежевика","куст");
        map.put("жень-шень","корень");
        map.put("земляника","ягода");
        map.put("ирис","цветок");
        map.put("картофель","клубень");

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
