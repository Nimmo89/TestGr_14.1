package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void remain500() {
        int expected = 500;
        int actual = service.remain(1500);
        assertEquals (actual, expected);
    }

    @Test
    public void remain1000() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals (actual, expected);
    }
}