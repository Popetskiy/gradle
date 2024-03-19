package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {

    CashBackService service = new CashBackService();

    @Test
    public void shouldCorrectAmount() {
         assertEquals(service.remain(2800), 200);

    }

    @Test
    public void shouldAmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldBuyExtraIfTheAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

}