package lvl10.hw.N5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
        Map<Character,Integer> OutCollection = new HashMap<>();
        OutCollection.put('а',0);
        OutCollection.put('б',0);
        OutCollection.put('в',0);
        OutCollection.put('г',0);
        OutCollection.put('д',0);
        OutCollection.put('е',0);
        OutCollection.put('ё',0);
        OutCollection.put('ж',0);
        OutCollection.put('з',0);
        OutCollection.put('и',0);
        OutCollection.put('й',0);
        OutCollection.put('к',0);
        OutCollection.put('л',0);
        OutCollection.put('м',0);
        OutCollection.put('н',0);
        OutCollection.put('о',0);
        OutCollection.put('п',0);
        OutCollection.put('р',0);
        OutCollection.put('с',0);
        OutCollection.put('т',0);
        OutCollection.put('у',0);
        OutCollection.put('ф',0);
        OutCollection.put('х',0);
        OutCollection.put('ц',0);
        OutCollection.put('ч',0);
        OutCollection.put('ш',0);
        OutCollection.put('щ',0);
        OutCollection.put('ъ',0);
        OutCollection.put('ы',0);
        OutCollection.put('ь',0);
        OutCollection.put('э',0);
        OutCollection.put('ю',0);
        OutCollection.put('я',0);

        for (int i = 0; i < 10; i++){
            char[] InPhrase = InStr.readLine().toLowerCase().toCharArray();
            for (int j = 0; j< InPhrase.length; j++){
                if (OutCollection.containsKey(InPhrase[j])){
                    OutCollection.put(InPhrase[j],OutCollection.get(InPhrase[j]) + 1);
                }
            }
        }

        Iterator<Map.Entry<Character,Integer>> iterator = OutCollection.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry pair = iterator.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
