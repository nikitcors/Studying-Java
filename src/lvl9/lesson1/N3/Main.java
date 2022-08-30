package lvl9.lesson1.N3;

import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[stackTraceElements.length - 1].getLineNumber());
        method1();
    }

    public static void method1(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getLineNumber());
        method2();
    }

    public static void method2(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getLineNumber());
        method3();
    }

    public static void method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getLineNumber());
        method4();
    }

    public static void method4(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getLineNumber());
        method5();
    }

    public static void method5(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName() + " - " + stackTraceElements[2].getLineNumber());
    }
}

