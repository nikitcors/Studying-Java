package lvl10.hw.N8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }
    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList = new ArrayList[3];

        ArrayList <String> firstList = new ArrayList<>();
        ArrayList <String> secondList = new ArrayList<>();
        ArrayList <String> thridList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            firstList.add(i + "");
            secondList.add(i+15 + "");
            thridList.add(i + 45 + "");
        }
        arrayOfStringList[0] = firstList;
        arrayOfStringList[1] = secondList;
        arrayOfStringList[2] = thridList;

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> List:
                arrayOfStringList) {
            for (String Elem:
                    List) {
                System.out.println(Elem);
            }
        }
    }
}
