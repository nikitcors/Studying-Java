package lvl9.lesson2.N1;



public class Main {
    public static void main(String[] args) {
        try{
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ловим исключение");
        }
    }
}
