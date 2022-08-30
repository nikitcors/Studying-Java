package lvl9.lesson3.N5;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        processExceptions();
    }

    public static void processExceptions( ) {
        try {
            method1();
            method2();
            method3();

        }catch (RuntimeException i){
            printStack(i);
        }
    }

    public static void printStack(Exception throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public static void method1() {
        throw new NullPointerException();
    }

    public static void method2() {
        throw new IndexOutOfBoundsException();
    }

    public static void method3() {
        throw new NumberFormatException();
    }
}
