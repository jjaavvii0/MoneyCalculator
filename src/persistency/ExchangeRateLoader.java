package persistency;

import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;

/**
 *
 * @author usuario
 */
public class ExchangeRateLoader {
    private final Exchange exchange;
    private final CurrencySet currencySet;
    private int rate;
    public ExchangeRateLoader(Exchange exchange, CurrencySet currencySet) {
        this.exchange=exchange;
        this.currencySet=currencySet;    
    }

   private double rate(Currency currency, Currency currency2){
        switch (currency.toString()){
            case "Euro": if (currency2.toString()=="Dollar") return 1.156;
                else if(currency2.toString()=="Pound") return 0.76;
            case "Dollar": if (currency2.toString()=="Euro") return 0.86;
                else if(currency2.toString()=="Pound") return 0.66;
            case "Pound": if (currency2.toString()=="Dollar") return 1.5;
                else if(currency2.toString()=="Euro") return 1.3;
            default: return 0;
        }
    }
    public ExchangeRate load() {
        
        return new ExchangeRate(exchange.getMoney().getCurrency(),exchange.getCurrency(),exchange.getMoney().getAmount(), (float) this.rate(exchange.getMoney().getCurrency(),exchange.getCurrency()));
    }
    
}
