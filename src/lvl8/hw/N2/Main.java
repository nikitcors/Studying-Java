package lvl8.hw.N2;

import java.io.IOException;
import java.util.*;

import static lvl8.hw.N2.Main.Cat.createCats;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String,String> pets = join(Cat.createCats(),Dog.createDogs());
        printPets(pets);
        removeCats(pets);
        printPets(pets);
    }

    static Map<String,String> join(HashSet<String> cats,  HashSet<String> dogs){
        Map<String,String> pets = new HashMap<String,String>();

        Iterator<String> iterator = cats.iterator();
        while (iterator.hasNext()){
            String CurrentCat = iterator.next();
            pets.put(CurrentCat,"кошка");
        }

        iterator = dogs.iterator();
        while (iterator.hasNext()){
            String CurrentDog = iterator.next();
            pets.put(CurrentDog,"Собака");
        }

        return pets;
    }

    static Map<String,String> removeCats (Map<String,String> pets){
        Set<String> cats = new HashSet<String>();

        Iterator<Map.Entry<String,String>> iterator = pets.entrySet().iterator();
        while(iterator.hasNext()){
          Map.Entry<String,String> pair =  iterator.next();
          if (pair.getValue().contains("кошка")){
              cats.add(pair.getKey());
          }
        }
        for (String catKey:
             cats) {
            pets.remove(catKey);
        }
        return pets;
    }

    static void printPets(Map<String,String> pets){
        Iterator <Map.Entry<String,String>> iterator = pets.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            System.out.println(pair.getKey() + "-" + pair.getValue());
        }
    }

    public static class Cat {
        public static HashSet<String> createCats(){
            HashSet<String> cats = new HashSet<String>();
            cats.add("Барсик");
            cats.add("Марсик");
            cats.add("Нота") ;
            cats.add("Яшка") ;
            return cats;
        }
        public static void printCats( Set<String> cats){
            Iterator<String> iterator = cats.iterator();
            while (iterator.hasNext()){
                String CurrentCat = iterator.next();
                System.out.println(CurrentCat);
            }
        }
    }

    public static class Dog {
        public static HashSet<String> createDogs(){
            HashSet<String> dogs = new HashSet<String>();
            dogs.add("Тузик");
            dogs.add("Грелка");
            dogs.add("Порвет") ;

            return dogs;
        }

        public static void printDogs( Set<String> dogs){
            Iterator<String> iterator = dogs.iterator();
            while (iterator.hasNext()){
                String CurrentDog = iterator.next();
                System.out.println(CurrentDog);
            }
        }
    }

}
