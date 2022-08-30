package lvl10.hw.N9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        List<String> inList = new ArrayList<>();
        Map<String,Integer> outDictuary = new HashMap<>();
        for (int i =  0; i < 20; i++){
            inList.add(inStr.readLine().toLowerCase());
        }

        outDictuary = createCount(inList);
        System.out.println(outDictuary);
    }

    static Map<String,Integer> createCount(List<String> inList){
        Map<String,Integer> outDictuary = new HashMap<>();
        for (String Elem:
                inList) {
            if (outDictuary.containsKey(Elem)){
                outDictuary.put(Elem, outDictuary.get(Elem) + 1);
            }
            else{
                outDictuary.put(Elem, 1);
            }
        }
        return outDictuary;
    }
}
