package net.kiel.tddbe;

/**
 * Created by kiel on 2015. 11. 19..
 */
public class Money implements Expression {
    protected int amount;
    protected Currency currency;

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
    static Money dollar(int amount) {
        return new Money(amount, Currency.USD);
    }

    static Money franc(int amount) {
        return new Money(amount, Currency.CHF);
    }

    public Money times(int multiply) {
        return new Money(amount * multiply, currency);
    }

    public Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }

    public Currency currency() {
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

    public enum Currency {
        USD("USD"),
        CHF("CHF");

        private String value;
        Currency(String value) {
            this.value = value;
        }


    }
}
