package lvl21.lesson1.N3;


public class Main {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
        return c;
    }

    public static void main(String[] args) {
        System.out.println(calculate (true,true,true, true));
        System.out.println(calculate (true,true,true, false));

        System.out.println(calculate (true,true,false, false));
        System.out.println(calculate (true,true,false, true));

        System.out.println(calculate (true,false,false, true));
        System.out.println(calculate (true,false,true, true));
        System.out.println(calculate (false,false,false, true));
        System.out.println(calculate (true,false,true, false));

        System.out.println(calculate (false,true,false, true));
        System.out.println(calculate (true,false,true, true));
    }
}

