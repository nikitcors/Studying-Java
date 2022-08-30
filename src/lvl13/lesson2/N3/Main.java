package lvl13.lesson2.N3;


import java.awt.*;

public class Main {
    public static void main(String[] args) {

    }
    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {

        public String getName(){
            return "Fox";
        }
    }
}
