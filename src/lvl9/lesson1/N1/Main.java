package lvl9.lesson1.N1;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for ( StackTraceElement element: stackTraceElements){
            System.out.println(element.getMethodName());
        }
        method1();
    }

    public static void method1(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for ( StackTraceElement element: stackTraceElements){
            System.out.println(element.getMethodName());
        }
        method2();
    }

    public static void method2(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for ( StackTraceElement element: stackTraceElements){
            System.out.println(element.getMethodName());
        }
        method3();
    }

    public static void method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for ( StackTraceElement element: stackTraceElements){
            System.out.println(element.getMethodName());
        }
        method4();
    }

    public static void method4(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for ( StackTraceElement element: stackTraceElements){
            System.out.println(element.getMethodName());
        }
        method5();
    }

    public static void method5(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for ( StackTraceElement element: stackTraceElements){
            System.out.println(element.getMethodName());
        }
    }
}
