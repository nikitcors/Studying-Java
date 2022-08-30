package lvl14.hw.N1;



public class Main {
    public static void main(String[] args) {

    }

    public static void println(Bridge bridge){
       System.out.println(bridge.getCarsCount());
    }
    interface Bridge{
        int getCarsCount();
    }

    static class WaterBridge implements Bridge{

        @Override
        public int getCarsCount() {
            return 10;
        }
    }

    static class SuspensionBridge implements Bridge{

        @Override
        public int getCarsCount() {
            return 20;
        }
    }

}
