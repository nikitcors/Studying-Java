package lvl13.lesson2.N5;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

    }

    interface Movable {
        void Move();
    }

    interface Eaten{
        void eaten();
    }

    interface Eat{
        void eat();
    }

    static class Dog implements Eat, Movable{

        @Override
        public void Move() {

        }

        @Override
        public void eat() {

        }
    }

    static class Cat implements Eat, Movable,Eaten{

        @Override
        public void Move() {

        }

        @Override
        public void eaten() {

        }

        @Override
        public void eat() {

        }
    }

    static class Mouse implements Movable, Eaten{

        @Override
        public void Move() {

        }

        @Override
        public void eaten() {

        }
    }

}
