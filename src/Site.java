public abstract class Site {
    public static final double TAX_RATE = 0.10;

    protected int _units;
    protected double _rate;

    public Site(int units, double rate) {
        _units = units;
        _rate = rate;
    }

    public abstract double getBaseAmount();

    public abstract double getTaxAmount();
}
