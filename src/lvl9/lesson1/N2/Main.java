package lvl9.lesson1.N2;

import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[stackTraceElements.length - 1].getMethodName());
        method1();
    }

    public static void method1(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getMethodName());
        method2();
    }

    public static void method2(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getMethodName());
        method3();
    }

    public static void method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getMethodName());
        method4();
    }

    public static void method4(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getMethodName());
        method5();
    }

    public static void method5(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getMethodName());
    }
}
