package lvl12.lesson2.N3;


public class Main {

    public static void main(String[] args)  {
        print((int)5);
        print(new Integer(5));
    }

    static void print (int i){
        System.out.println(i);
    }

    static void print (Integer I){
        System.out.println(I);
    }

    static void print (String I){
        System.out.println(I);
    }

    static void print (char I){
        System.out.println(I);
    }

    static void print (double I){
        System.out.println(I);
    }
}
