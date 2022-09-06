package lvl21.hw.N1;

import java.util.ArrayList;

public class Hippodrome {
    ArrayList<Horse> horses = new ArrayList<>();
    public ArrayList<Horse> getHorses() {
        return horses;
    }
    public static Hippodrome game = new Hippodrome();

    public void run() throws InterruptedException {
        for(int i = 0; i<100; i++){
          move();
          print();
          Thread.sleep(200);
        }
    }

    public void move(){
        for (Horse currentHorse:
             horses) {
            currentHorse.move();
        }
    }

    public void print(){
        for (Horse currentHorse:
                horses) {
            currentHorse.print();
        }
        System.out.println();
        System.out.println();
    }

    public Horse getWinner(){
        Horse winnerHorse = new Horse();
        for (Horse currentHorse:
                horses) {
            if (currentHorse.getDistance() > winnerHorse.getDistance()){
                winnerHorse = currentHorse;
            }
        }
        return winnerHorse;
    }
    public void printWinner(){
        System.out.println(String.format("Winner is %s", getWinner().name));
    }

    public static void main(String[] args) throws InterruptedException {
        Hippodrome currentHippodrome = game;
        for (int i = 0; i < 3; i++){
            Horse currentHorse = new Horse();
            currentHorse.setName("Лава" + i);
            currentHorse.setDistance(0.0);
            currentHorse.setSpeed(3.0);
            currentHippodrome.horses.add(currentHorse);
        }
        currentHippodrome.run();
        currentHippodrome.printWinner();
    }
}
