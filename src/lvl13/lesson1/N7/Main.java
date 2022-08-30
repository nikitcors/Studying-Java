package lvl13.lesson1.N7;




public class Main {
    public static void main(String[] args) {

    }
    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>{

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }


}
