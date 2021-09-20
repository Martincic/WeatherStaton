
public enum TemperatureDegree {
    CELSIUS (-27315), KELVIN (0);

    private final int factor;
    private int test;

    TemperatureDegree(int factor) {
        this.factor = factor;
    }

    public double get(int reading) {
        return (factor+reading)/100.0;
    }
}
