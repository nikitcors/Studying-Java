package lvl9.hw.N3;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        ArrayList<Integer> OutNumber =  new ArrayList<>();
        while (true) {
            try {
                Scanner TextIn = new Scanner(System.in);
                int InNumber = TextIn.nextInt();
                OutNumber.add(InNumber);
            } catch (InputMismatchException e) {
                System.out.println(OutNumber);
                break;
            }
        }

    }
}
