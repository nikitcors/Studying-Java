package lvl8.lesson1.N3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Cat> map =new HashMap<String, Cat>();
        for (int i = 0; i < 10; i++){
            Cat cat = new Cat();
            cat.name = "Барсик" + String.valueOf(i);
            map.put(cat.name,cat);
        }
        Iterator<Map.Entry<String,Cat>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Cat> pair = iterator.next();
            System.out.println(pair.getKey() + " - " + pair.getValue().name);
        }
    }
}

