package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void shouldOfferToBuyUpToTwoThousands() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int amount = 1100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldOfferToBuyGoodsOnOneRuble() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int amount = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
    @Test
    public void shouldOfferToBuyWithZero() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}
