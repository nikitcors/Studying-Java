package lvl9.hw.N1;



public class Main {
    public static void main(String[] args) {
        divisionByZero();
        System.out.println("1232");
    }
    public static void divisionByZero(){
        try
        {
            int i = 1/0;
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
}
