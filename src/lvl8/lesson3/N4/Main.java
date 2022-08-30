package lvl8.lesson3.N4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String,Date> InStr = new HashMap<String,Date>();
        InStr.put("Петя Пупиков",new Date(1212355555555L));
        InStr.put("Маша Пупикова",new Date(116112121212L));
        InStr.put("Саша Мупиков",new Date(1212121212L));
        InStr.put("Слава Пупиков",new Date(1212121212121121212L));
        InStr.put("Игнат Агат",new Date());

        System.out.println(InStr);

        Set<String> KeysForDelete = new HashSet<String>();
        Iterator<Map.Entry<String, Date>> iteratorMap = InStr.entrySet().iterator();

        while (iteratorMap.hasNext()){
            Map.Entry<String, Date> pair = iteratorMap.next();
            Date currentDate = pair.getValue();
            if ((currentDate.getMonth() > 4) && (currentDate.getMonth() < 8)){
                KeysForDelete.add(pair.getKey());
            }
        }

        Iterator<String> iteratorSet = KeysForDelete.iterator();
        while (iteratorSet.hasNext()){
            InStr.remove(iteratorSet.next());
        }
        System.out.println(InStr);
    }
}

