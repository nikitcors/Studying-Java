package lvl22.lesson2.N2;


public class Main {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "Java", "курс", "мне", "нравится"));
    }
    public static String getFormattedString() {
        return "%3$S %4$s %2$s %1$s";
    }
}

