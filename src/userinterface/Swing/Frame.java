package userinterface.Swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Currency;
public class Frame extends JFrame {
    private final Currency[] currencies;
    private ActionListener actionListener;
    private ExchangeDialog exchangeDialog;
    private MoneyDisplay exchangeDisplay;
    public Frame (Currency [] currencies) {
        this.currencies = currencies;
        setTitle("Money Calculator");
        setMinimumSize(new Dimension(300, 350));
        setLocation(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createWidgets();
        setVisible(true);
    }
    public MoneyDisplay getExchangeDisplay() {
        return exchangeDisplay;
    }
    public void register(ActionListener actionListener) {
        this.actionListener = actionListener;
    }
    public ExchangeDialog getExchangeDialog() {
        return exchangeDialog;
    }
    private void createWidgets() {
        this.add(createCalculateButton(), BorderLayout.SOUTH);
        this.add(createExchangeDisplay(), BorderLayout.CENTER);
        this.add(createExchangeDialogPanel(), BorderLayout.NORTH);
    }
    private Component createExchangeDialogPanel() {
        ExchangeDialog panel = new ExchangeDialog(currencies);
        this.exchangeDialog = panel;
        return panel;
    }
    private Component createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionListener.actionPerformed(e);
        }
        });
    return button;
    }
    private Component createExchangeDisplay() {
        exchangeDisplay = new MoneyDisplay();
        return exchangeDisplay;
    }
}