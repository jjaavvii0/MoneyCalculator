package model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.RowFilter.Entry;

public class CurrencySet {
    private final HashMap<String,Currency> currencySet;

    public CurrencySet(HashMap<String,Currency> currencySet) {
        this.currencySet = currencySet;
    }
    public Currency getCurrency(String key){
        return currencySet.get(key);
    }
    public Currency[] toArray(){
        int i=0;
        Currency[] currency = new Currency[currencySet.size()];
        for (Map.Entry<String, Currency> col : currencySet.entrySet()) {
            currency[i]=col.getValue();
            i++;
        }
        return currency;
    }
    
}
