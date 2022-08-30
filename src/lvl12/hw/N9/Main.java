package lvl12.hw.N9;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
    public static interface Businessman {
        public void workHard();
    }

    public static class Human {


        public void workHard() {

        }
    }

    public static class CTO extends Human implements Businessman {

    }
}
