
package application;

import userinterface.Swing.Frame;
import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import persistency.CurrencySetLoader;

public class MoneyCalculator {

    public static void main(String[] args) {
        final CurrencySetLoader currencySetLoader=new CurrencySetLoader();
        final Frame frame=new Frame(currencySetLoader.load().toArray());
        frame.register(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ExchangeOperation operation=new ExchangeOperation(currencySetLoader.load(),frame.getExchangeDisplay(),frame.getExchangeDialog());
                operation.execute();
            }
        });
    }
    
}
