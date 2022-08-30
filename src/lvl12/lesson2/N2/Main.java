package lvl12.lesson2.N2;


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
}

