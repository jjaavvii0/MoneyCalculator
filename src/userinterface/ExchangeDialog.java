package userinterface;

import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog {
    private final CurrencySet currencySet;
    private final Money money;

    public ExchangeDialog(CurrencySet currencySet) {
        this.currencySet = currencySet;
        this.money = new Money(100,currencySet.getCurrency("EUR"));
    }

    public Exchange getExchange() {
        return new Exchange(money,currencySet.getCurrency("EUR"));
    }
    
}
