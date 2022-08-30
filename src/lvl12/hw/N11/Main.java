package lvl12.hw.N11;


public class Main {
    public static void main(String[] args) {

    }
    public static interface Fly {
        public void fly();
    }

    public static class Horse {


    }

    public static class Pegas extends Horse implements Fly {

        @Override
        public void fly() {

        }
    }
}
