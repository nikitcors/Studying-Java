package lvl14.hw.N12;


public class Main {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance(1);
        System.out.println(singelton.getI());
        singelton = Singelton.getInstance(1);
        System.out.println(singelton.getI());
        singelton = Singelton.getInstance(1);
        System.out.println(singelton.getI());

    }
}
