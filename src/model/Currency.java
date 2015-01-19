
package model;

public class Currency {
    private final String name;
    private final String symbol;
    private final int code;

    public Currency(String name, String symbol, int code) {
        this.name = name;
        this.symbol = symbol;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getCode() {
        return code;
    }
    public String toString(){
        return name;
    }
    
}
