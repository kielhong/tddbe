package net.kiel.tddbe;

/**
 * Created by kiel on 2015. 11. 19..
 */
public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public Money times(int multiply) {
        return new Money(amount * multiply, currency);
    }
    public String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money)object;

        return (amount == money.amount) && (currency().equals(money.currency()));
    }

    @Override
    public String toString() {
        return amount + "," + currency;
    }
}
