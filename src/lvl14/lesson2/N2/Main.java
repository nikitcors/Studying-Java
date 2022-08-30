package lvl14.lesson2.N2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String,Cat> cats = new HashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader InStr = new BufferedReader(new InputStreamReader(System.in));
        //Map<String,Cat> cats = new HashMap<>();
        String currentCatName = "";
        do{
            currentCatName = InStr.readLine();
            if (!currentCatName.equals("")) {
                cats.put(currentCatName, new Cat(currentCatName));
                System.out.println(Main.getCatByKey(currentCatName).toString());
            }

        }while(currentCatName != "\n");
    }

    static Cat getCatByKey(String name) {
        return  cats.get(name) ;
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}

