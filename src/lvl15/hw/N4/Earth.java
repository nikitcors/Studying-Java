package lvl15.hw.N4;


public class Earth implements Planet   {
    private static Earth INSTANCE;

    private Earth() {}

    public static Earth getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Earth();
        }
        return INSTANCE;
    }
}
