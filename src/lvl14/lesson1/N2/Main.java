package lvl14.lesson1.N2;
/*
Bingo-2!
Исправь строчку ‘Cat cat = new Cat();‘ так, чтобы программа вывела «Bingo!«.
*/

public class Main {
    public static void main(String[] args) {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof Movable;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface Movable {
    }

    static class Cat implements Movable {
    }

    static class TomCat extends Cat {

    }

}
