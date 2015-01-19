package userinterface.Swing;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Money;
public class MoneyDisplay extends JPanel {
    private final JLabel label = new JLabel("-");
    public MoneyDisplay () {
        super();
        this.add(label);
        this.setBorder(BorderFactory.createTitledBorder("Exchange Display"));
    }
    public void display(Money money) {
        label.setText(" The result is : "+money.getAmount()+" "+money.getCurrency().getSymbol());
    }
}