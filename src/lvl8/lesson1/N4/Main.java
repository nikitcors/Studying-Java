package lvl8.lesson1.N4;

import lvl8.lesson1.N3.Cat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> map =new HashMap<String, String>();
        for (int i = 0; i < 10; i++){
            String name = "Барсик" + String.valueOf(i);
            map.put(name,"Барсик");
        }
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            System.out.println(pair.getKey() );
        }
    }
}
