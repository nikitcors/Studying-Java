package lvl13.hw.N7;


import sun.java2d.pipe.SpanShapeRenderer;

public class Main {
    public static void main(String[] args) {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject <T> implements SimpleObject<String> {

        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }

}
