package lvl21.lesson1.N1;

public class Main {
    public static void main(String[] args)  {
        print(getNetAddress(192,255));
        print(getNetAddress(168,255));
        print(getNetAddress(1,254));
        print(getNetAddress(2,0));
    }

    static int getNetAddress(int IP, int mask){
       return (IP &  mask);
    }

    static void print (int adress){
        System.out.println(Integer.toString(adress, 2));
    }
}
