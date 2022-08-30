package lvl7.lesson3.N1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> InInts = new ArrayList<Integer>();
        ArrayList<Integer> Div2 = new ArrayList<Integer>();
        ArrayList<Integer> Div3 = new ArrayList<Integer>();
        ArrayList<Integer> OtherInt = new ArrayList<Integer>();

       for (int i = 0; i < 20; i++)
       {
           BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
           InInts.add(Integer.parseInt(InStr.readLine()));
           if (InInts.get(i) % 2 == 0) Div2.add(InInts.get(i));
           if (InInts.get(i) % 3 == 0) Div3.add(InInts.get(i));
           if ((InInts.get(i) % 2 != 0) && (InInts.get(i) % 3 != 0)) OtherInt.add(InInts.get(i));
       }

        Main.printList(Div3);
        Main.printList(Div2);
        Main.printList(OtherInt);

    }

    static void printList(ArrayList<Integer> InStrs){
        System.out.println("Следущий массив: ");
        for (Integer OutStr:
             InStrs) {
            System.out.println(OutStr);
        }
    }
}
