package lvl17.lesson2.N5;


public class Main {
    public static void main(String[] args) {

    }

    public static class IMF {
        private static IMF iMF = null;



        private IMF() {
        }

        public static IMF getInstance(){
            synchronized (IMF.class) {

                if (iMF == null) iMF = new IMF();

                return iMF;
            }

        }

    }

}
