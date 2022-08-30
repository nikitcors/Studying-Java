package lvl14.hw.N9;

public abstract class Money {
    private double amount;
    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract String getCurrencyName();
}
