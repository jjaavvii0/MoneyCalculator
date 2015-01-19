package persistency;

import java.util.HashMap;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {
    private final HashMap<String,Currency> currencySet;

    public CurrencySetLoader() {
        currencySet= new HashMap<>();
    }
    public CurrencySet load(){
        currencySet.put("EUR",new Currency("Euro","EUR",1));
        currencySet.put("USA",new Currency("Dollar","USA",2));
        currencySet.put("LIB",new Currency("Pound","LIB",3));
        return new CurrencySet(currencySet);
    }
}