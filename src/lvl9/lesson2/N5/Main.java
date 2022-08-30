package lvl9.lesson2.N5;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (NullPointerException e){
            System.out.println("Стараемся ловить исключение тут");
        }
    }

}
