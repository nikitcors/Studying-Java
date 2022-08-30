package lvl15.hw.N1;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String currentStr = "";

            while (true){
                try {
                BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
                currentStr = inStr.readLine();
                if (currentStr.equals("exit")){break;};
                if (currentStr.contains(".")){print(Double.parseDouble(currentStr));}
                else {if ((Integer.parseInt(currentStr) > 0) && ((Integer.parseInt(currentStr) < 128))){print(Short.parseShort(currentStr));}
                else {if ((Integer.parseInt(currentStr) > 128)) {print((int)(Integer.parseInt(currentStr)));}
                }}
                //inStr.close();
            }


            catch (Exception e){
                print(currentStr);
            }

            }
    }
    public static void print (short inNumb){
        System.out.println(inNumb);
    }
    public static void print (Integer inNumb){
        System.out.println(inNumb);
    }

    public static void print (double inNumb){
        System.out.println(inNumb);
    }
    public static void print (String inNumb){
        System.out.println(inNumb);
    }





}
