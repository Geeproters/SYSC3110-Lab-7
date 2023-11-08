public class ResidentialSite extends Site {
    public ResidentialSite(int units, double rate) {
        super(units, rate);
    }
    @Override
    public double getBaseAmount() {
        return units * rate;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * TAX_RATE;
    }
}