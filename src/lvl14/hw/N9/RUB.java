package lvl14.hw.N9;

public class RUB extends Money
{
    public RUB(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
