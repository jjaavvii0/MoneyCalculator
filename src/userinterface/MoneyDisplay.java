/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import model.Money;

/**
 *
 * @author usuario
 */
public class MoneyDisplay{
    private final Money money;

    public MoneyDisplay(Money money) {
        this.money = money;
    }
    public void displayMoney(){
        System.out.println(money.getAmount()+money.getCurrency().getName());
    }
    
}
