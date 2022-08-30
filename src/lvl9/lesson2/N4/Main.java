package lvl9.lesson2.N4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Ловим исключение границ списка");
        }
    }

}
