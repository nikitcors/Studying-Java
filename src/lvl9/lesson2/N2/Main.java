package lvl9.lesson2.N2;


public class Main {
    public static void main(String[] args)  {
         try{
             String s = null;
             String m = s.toLowerCase();
         }
         catch (NullPointerException e){
             System.out.println("Ловим исключение с слыкой null");
         }
    }
}

