public class LifelineSite extends Site {
    public LifelineSite(int units, double rate) {
        super(units, rate);
    }
    @Override
    public double getBaseAmount() {
        return units * rate * 0.5;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * TAX_RATE * 0.2;
    }
}