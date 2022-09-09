package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldNotOfferToBuyIfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);


    }

    @Test
    public void shouldOfferToBuyUpToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldOfferToBuyUpToTwoThousands() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int amount = 1100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}
