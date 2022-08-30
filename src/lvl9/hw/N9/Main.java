package lvl9.hw.N9;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Cat,String> CatsName = new HashMap<>();
        CatsName.put(new Cat("Барсик"), "Кот");
        CatsName.put(new Cat("Марсик"), "Кот");
        CatsName.put(new Cat("Нота"), "Кот");
        CatsName.put(new Cat("Яшка"), "Кот");
        CatsName.put(new Cat("Марфа"), "Кот");
        CatsName.put(new Cat("Анфиса"), "Кот");
        CatsName.put(new Cat("Мартин"), "Кот");
        CatsName.put(new Cat("Лео"), "Кот");
        CatsName.put(new Cat("Тигр"), "Кот");
        CatsName.put(new Cat("Не Тигр"), "Кот");

        Iterator<Map.Entry<Cat,String>> iterator = CatsName.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Cat,String> pair = iterator.next();
            Cat CurrentCat = pair.getKey();
            String SrtCat = pair.getValue();
            System.out.println(CurrentCat.Name + " - " + SrtCat);
        }

    }

    public static class Cat{
        public String Name;
        public Cat(String Name){
            this.Name = Name;
        }
    }
}
