package net.kiel.tddbe;

/**
 * Created by kiel on 2015. 11. 19..
 */
public class Dollar extends Money {
    public Dollar(int amount, Currency currency) {
        super(amount, currency);
    }

    static Money dollar(int amount) {
        return new Money(amount, Currency.USD);
    }
}
