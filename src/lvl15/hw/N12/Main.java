package lvl15.hw.N12;


public class Main {
    public static void main(String[] args) {
        DrinkMaker tea = new TeaMaker();
        DrinkMaker latte = new LatteMaker();
        tea.makeDrink();
        latte.makeDrink();
    }
}
