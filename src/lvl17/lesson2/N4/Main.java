package lvl17.lesson2.N4;


public class Main {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getInstance();
        OurPresident ourPresident = OurPresident.getInstance();
        System.out.println(expectedPresident == ourPresident );
    }

    public static class OurPresident{
        private static OurPresident president = null;

        static {
            synchronized(OurPresident.class){
                president = getInstance();
            }

        }

        private OurPresident() {
        }

        public static OurPresident getInstance(){
            if (president == null) president = new OurPresident();
            return president;
        }
    }

}
