package lvl9.lesson1.N4;

import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        method1();
    }

    public static void method1(){
        method2();
    }

    public static void method2(){
        method3();
    }

    public static void method3(){
        method4();
    }

    public static void method4(){
        method5();
    }

    public static void method5(){
        method6();
    }
    public static void method6(){
        method7();
    }
    public static void method7(){
        method8();
    }
    public static void method8(){
        method9();
    }
    public static void method9(){
        method10();
    }
    public static void method10(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for ( StackTraceElement element: stackTraceElements){
            System.out.println(element.getMethodName());
        }
    }
}
