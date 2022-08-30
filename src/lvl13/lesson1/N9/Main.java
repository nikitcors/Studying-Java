package lvl13.lesson1.N9;




public class Main {
    public static void main(String[] args) {

    }

    interface Movable {
        Double  speed();
    }

    interface Runable extends Movable{
        Double  speed(Runable runable);
    }
}
