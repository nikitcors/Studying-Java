package lvl9.hw.N8;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<ArrayList<Integer>> OutSet = new HashSet<>();
        OutSet.add(new ArrayList<Integer>() {
            {
                add(5);
                add(5);
                add(5);
                add(5);
                add(5);
            }
        });
        OutSet.add(new ArrayList<Integer>() {
            {
                add(2);
                add(2);
            }
        });
        OutSet.add(new ArrayList<Integer>() {
            {
                add(4);
                add(4);
                add(4);
                add(4);
            }
        });
        OutSet.add(new ArrayList<Integer>() {
            {
                add(7);
                add(7);
                add(7);
                add(7);
                add(7);
                add(7);
                add(7);
            }
        });
        OutSet.add(new ArrayList<Integer>());

        System.out.println(OutSet);


    }
}
