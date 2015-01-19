package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {
    private final ExchangeRate exchangeRate;

    public Exchanger(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    public Money exchange() {
        return new Money(exchangeRate.getValue()*exchangeRate.getRate(),exchangeRate.getOut());
    }
    
}
