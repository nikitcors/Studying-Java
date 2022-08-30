package lvl14.hw.N12;

public class Singelton {
    private static Singelton singelton = null;
    private int i;
    private Singelton(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    private Singelton() {

    }
    private Singelton init(int i){
        //this = new Singelton(i);
        this.i = i;
        return this;
    }
    public static Singelton getInstance(int i){
        if (singelton == null){
            singelton = new Singelton(i);
            return  singelton;
        }
        return singelton;
       // return singelton = (singelton == null) ? init(i) : singelton;
    }
}
