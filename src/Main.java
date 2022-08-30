import java.util.Scanner;
import javax.swing.*;
import java.io.File;
import pakeges.*;


public class Main {
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //напишите тут ваш код
        Cat tomCat = new Cat ("Tom",50,12);
        Dog Dog = new Dog("DogFromCartoon", 100,30);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        int contOfTeeth;

        public Dog(String name, int height, int contOfTeeth)
        {
            this.name = name;
            this.height = height;
            this.contOfTeeth = contOfTeeth;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int speed;

        public Cat(String name, int height, int speed)
        {
            this.name = name;
            this.height = height;
            this.speed = speed;
        }
    }

    //добавьте тут ваши классы
}