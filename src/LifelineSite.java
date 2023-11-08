public class LifelineSite extends Site {
    public LifelineSite(int units, double rate) {
        super(units, rate);
    }
    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
    @Override
    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * TAX_RATE * 0.2;
    }
}
