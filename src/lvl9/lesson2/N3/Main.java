package lvl9.lesson2.N3;


public class Main {
    public static void main(String[] args) {
        try{
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Ловим исключение границ массива");
        }
    }
}
