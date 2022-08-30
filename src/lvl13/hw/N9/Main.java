package lvl13.hw.N9;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public abstract static class Fox implements Animal{
        public String getName(){
            return "Fox";
        }
    }
}
