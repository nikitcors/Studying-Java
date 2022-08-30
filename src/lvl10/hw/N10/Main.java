package lvl10.hw.N10;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> collectionNumb = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            collectionNumb.add(Integer.parseInt(InStr.readLine() + ""));
        }
        System.out.println(safeGetElement(collectionNumb, 5, 2));
        System.out.println(safeGetElement(collectionNumb, 20, 2));
    }

    static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue){
       try{
          return list.get(index);
       }
       catch(IndexOutOfBoundsException e){
          return  defaultValue;
       }
    }
}
