package lvl15.lesson2.N2;


public class Main {
    public static void main(String[] args)  {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) { //1
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) { //2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, char[] value){}
    public static void printMatrix(long m, int n, String value){}
    public static void printMatrix(int m, long n, String value){}
    public static void printMatrix(long m, long n, String value){}
    public static void printMatrix(Integer m, int n, String value){}
    public static void printMatrix(int m, Integer n, String value){}
    public static void printMatrix(Integer m, Integer n, String value){}
    public static void printMatrix(int m, int n, StringBuilder value){}
}

