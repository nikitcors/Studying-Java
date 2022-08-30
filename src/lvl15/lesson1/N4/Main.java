package lvl15.lesson1.N4;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }
    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }
        public abstract Book getBook();

        public abstract String getTitle();
        private String getOutputByBookType() {
            String resultStr = "";
            resultStr = (this instanceof MarkTwainBook)? "agathaChristieOutput" : resultStr;
            resultStr = (this instanceof AgathaChristieBook)? "agathaChristieOutput" : resultStr;
            return resultStr;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }



    public static class MarkTwainBook extends Book{

        String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book{

        String title;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}
