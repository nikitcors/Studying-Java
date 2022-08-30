package lvl8.hw.N6;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String,String> InStr = new HashMap<String,String>();
        InStr.put("Пупиков","Петя");
        InStr.put("Рупиков","Не Петя");
        InStr.put("Зупиков","Петя");
        InStr.put("Лупиков","ПетяОн");
        InStr.put("Игнат","Петя");
        InStr.put("Автомат","Петя");
        InStr.put("Волк","Не Петя");
        InStr.put("Не волк","остается");
        InStr.put("Walk","Тоже остается");
        InStr.put("Gtnh","Петя");

        System.out.println(InStr);

        Set<String> KeysForDelete = new HashSet<String>();
        Iterator<Map.Entry<String, String>> iteratorMap = InStr.entrySet().iterator();
        List<String>DabbleName = new ArrayList<>(InStr.values());
        while (iteratorMap.hasNext()){
            Map.Entry<String, String> pair = iteratorMap.next();
            String currentName = pair.getValue();
            DabbleName.remove(currentName);
            if ((DabbleName.contains(currentName)) ){
                KeysForDelete.add(pair.getKey());
            }
            DabbleName.add(currentName);
        }

        Iterator<String> iteratorSet = KeysForDelete.iterator();
        while (iteratorSet.hasNext()){
            InStr.remove(iteratorSet.next());
        }
        System.out.println(InStr);
    }
}
