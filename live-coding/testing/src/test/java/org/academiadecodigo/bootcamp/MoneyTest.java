package org.academiadecodigo.bootcamp;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.converters.Nullable;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest {

    private static final String VALID_CURRENCY = "EUR";
    private static final int VALID_AMOUNT = 10;

    @Test
    @Parameters({"10, EUR",
            "100, USD",
            "55, YEN",
            "250, BRL"})
    public void constructorShouldSetAmountAndCurrency(int amount, String currency) {

        Money money = new Money(amount, currency);

        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters({"-10", "-50", "-420"})
    public void constructorMustThrowIAEWhenAnInvalidAmountIsGiven(int invalidAmount) {
        new Money(invalidAmount, VALID_CURRENCY);
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters({"", "null"})
    public void constructorMustThrowIAEWhenAnInvalidCurrencyIsGiven(@Nullable String invalidCurrency) {
        new Money(VALID_AMOUNT, invalidCurrency);
    }

}
