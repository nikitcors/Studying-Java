package lvl8.lesson1.N6;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) throws IOException {
        Map<Object, String> map =new HashMap<Object, String>();
        for (int i = 0; i < 10; i++){
            int name = i;
            map.put(name,"Барсик");
        }
        Iterator<Map.Entry<Object,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Object,String> pair = iterator.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}