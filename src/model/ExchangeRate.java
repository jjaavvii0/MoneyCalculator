
package model;


public class ExchangeRate {
    private final Currency in;
    private final Currency out;
    private final double value;
    private final float rate;

    public ExchangeRate(Currency in, Currency out, double value, float rate) {
        this.in = in;
        this.out = out;
        this.value = value;
        this.rate = rate;
    }

    public Currency getIn() {
        return in;
    }

    public Currency getOut() {
        return out;
    }

    public double getValue() {
        return value;
    }
    
    public float getRate() {
        return rate;
    }
}
