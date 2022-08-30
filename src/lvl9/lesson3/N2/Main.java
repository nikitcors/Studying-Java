package lvl9.lesson3.N2;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Integer> InInts = new HashSet<Integer>();
        Collections.addAll(InInts,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 );
        Set<Integer> DeleteInts = new HashSet<Integer>();
        Iterator<Integer> iterator = InInts.iterator();
        while (iterator.hasNext()){
            Integer I = iterator.next();
            if (I > 10){
                DeleteInts.add(I);
            }
        }
        InInts.removeAll(DeleteInts);
        for (Integer OutStr:
                InInts) {
            System.out.println(OutStr);
        }

    }
}
