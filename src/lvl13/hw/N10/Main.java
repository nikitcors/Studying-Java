package lvl13.hw.N10;

import java.awt.*;

public class Main {
    public static void main(String[] args)   {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

    }

    public static class BigFox extends Fox {

        @Override
        public Color getColor() {
            return null;
        }
    }
}
