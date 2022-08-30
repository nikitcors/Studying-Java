package lvl10.hw.N4;



public class Main {
    public static void main(String[] args) {
        char[] OutArray = "Я не хочу изучать Java, я хочу большую зарплату".toCharArray();
        for(int i = 0; i < 40; i++){
            int j = i;
            if (OutArray[j] != ' ') System.out.print(OutArray[j]);
            for (j = i+1; j<OutArray.length - 1; j++){
                System.out.print(OutArray[j]);
            }
            System.out.println();
        }
    }
}
