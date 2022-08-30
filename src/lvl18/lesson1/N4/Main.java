package lvl18.lesson1.N4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> Bytes = new HashMap<>();
        FileInputStream inFile = new FileInputStream(inStr.readLine());

        while (inFile.available() > 0){
            int currentBytes = inFile.read();
            Bytes.put(currentBytes, (Bytes.containsValue(currentBytes) ? Bytes.get(currentBytes) + 1 : 1 ));
        }

        Bytes = Main.sortByValue(Bytes);
        int Max = 0;
        for(Map.Entry<Integer, Integer> item : Bytes.entrySet()){
            Max = item.getKey();
            break;
        }
        System.out.println(Max);
        System.out.println(Bytes);
        inFile.close();
    }

    private static Map<Integer, Integer> sortByValue(Map<Integer, Integer> unsortMap) {

        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }




        return sortedMap;
    }

}
