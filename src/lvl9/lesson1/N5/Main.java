package lvl9.lesson1.N5;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        method1();
    }

    public static int method1(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            System.out.println(stackTraceElements.length);
            return stackTraceElements.length;
    }
}
