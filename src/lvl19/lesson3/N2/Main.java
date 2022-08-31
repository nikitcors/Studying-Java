package lvl19.lesson3.N2;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args)  {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        printSomething();

        String outStr = outputStream.toString().replace("te", "??");
        System.setOut(consoleStream);

        System.out.println(outStr);
    }

    static void printSomething(){ System.out.println("tete XA-XA!!!");}
}
