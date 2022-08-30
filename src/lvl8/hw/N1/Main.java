package lvl8.hw.N1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Cat> InInts = Cat.createCats();
        InInts.remove(Cat.getCat(InInts,"Барсик"));
        Cat.printCats(InInts);
    }

    public static class Cat {
        String name;
        public Cat(String name){
            this.name = name;
        }
        public static HashSet<Cat> createCats(){
            HashSet<Cat> cats = new HashSet<Cat>();
            cats.add(new Cat("Барсик"));
            cats.add(new Cat("Марсик"));
            cats.add(new Cat("Нота"));

            return cats;
        }

        public static Cat getCat(Set<Cat> cats, String nameCat){
            Iterator<Cat> iterator = cats.iterator();
            while (iterator.hasNext()){
                Cat CurrentCat = iterator.next();
                if (CurrentCat.name.contains(nameCat)) return CurrentCat;
            }
            return new Cat(nameCat);
        }

        public static void printCats( Set<Cat> cats){
            Iterator<Cat> iterator = cats.iterator();
            while (iterator.hasNext()){
                Cat CurrentCat = iterator.next();
                System.out.println(CurrentCat.name);
            }
        }
    }
}
