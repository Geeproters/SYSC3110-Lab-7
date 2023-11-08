public abstract class Site {
    public static final double TAX_RATE = 0.10;

    protected int units;
    protected double rate;

    public Site(int units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getBaseAmount();

    public abstract double getTaxAmount();
}
