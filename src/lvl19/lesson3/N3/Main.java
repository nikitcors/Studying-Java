package lvl19.lesson3.N3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args)  {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        printSomething();
        System.setOut(consoleStream);

        String result = outputStream.toString().replaceAll("[a-zA-Z]","");
        result = result.replaceAll("\\D","");

        System.out.println(result);
    }

    static void printSomething(){
        System.out.println("A 89dc Ябоб 09в");
    }
}

