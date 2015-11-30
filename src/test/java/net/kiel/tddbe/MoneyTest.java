package net.kiel.tddbe;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

/**
 * Created by kiel on 2015. 11. 19..
 */
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);

        assertThat(Money.dollar(10), is(five.times(2)));
        assertThat(Money.dollar(15), is(five.times(3)));
    }

    @Test
    public void testEquality() {
        assertThat(Money.dollar(5), is(Money.dollar(5)));
        assertThat(Money.dollar(5), is(not(Money.dollar(6))));
        assertThat(Money.franc(5), is(not(Money.dollar(5))));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);

        assertThat(Money.franc(10), is(five.times(2)));
        assertThat(Money.franc(15), is(five.times(3)));
    }

    @Test
    public void testCurrency() {
        assertThat(Money.Currency.USD, is(Dollar.dollar(1).currency()));
        assertThat(Money.Currency.CHF, is(Money.franc(1).currency()));
    }

    @Test
    public void testPlus() {
        assertThat(Money.dollar(5).plus(Money.dollar(5)), is(Money.dollar(10)));
        assertThat(Money.franc(6).plus(Money.franc(7)), is(Money.franc(13)));
//        assertThat(Money.dollar(5).plus(Money.franc(5)), is(Money.dollar(15)));
    }
}
