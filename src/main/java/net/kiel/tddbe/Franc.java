package net.kiel.tddbe;

/**
 * Created by kiel on 2015. 11. 19..
 */
public class Franc extends Money {

    public Franc(int amount, Currency currency) {
        super(amount, currency);
    }

    static Money franc(int amount) {
        return new Money(amount, Currency.CHF);
    }
}

