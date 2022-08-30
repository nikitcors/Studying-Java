package lvl15.lesson5.N4;



public class Main {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        if (A == 0)
            throw new RuntimeException();
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

