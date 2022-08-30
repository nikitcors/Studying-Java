package lvl15.hw.N4;

public class Moon  implements Planet {
    private static Moon INSTANCE;

    private Moon() {}

    public static Moon getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Moon();
        }
        return INSTANCE;
    }
}

