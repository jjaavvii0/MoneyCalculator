
package control;

import model.CurrencySet;
import persistency.ExchangeRateLoader;
import process.Exchanger;
import userinterface.Swing.ExchangeDialog;
import userinterface.Swing.MoneyDisplay;


public class ExchangeOperation {
    CurrencySet currencySet;
    private final MoneyDisplay moneyDisplay;
    private final ExchangeDialog exchangeDialog;

    public ExchangeOperation(CurrencySet currencySet, MoneyDisplay moneyDisplay, ExchangeDialog exchangeDialog) {
        this.currencySet = currencySet;
        this.moneyDisplay = moneyDisplay;
        this.exchangeDialog = exchangeDialog;
    }
    
    public void execute(){
        ExchangeRateLoader rateLoader=new ExchangeRateLoader(exchangeDialog.getExchange(),currencySet);
        Exchanger exchanger=new Exchanger(rateLoader.load());
        moneyDisplay.display(exchanger.exchange());
    }
}
