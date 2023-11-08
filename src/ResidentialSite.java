public class ResidentialSite extends Site {
    public ResidentialSite(int units, double rate) {
        super(units, rate);
    }
    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
    @Override
    public double getBaseAmount() {
        return _units * _rate;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * TAX_RATE;
    }
}
