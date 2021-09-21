package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void remain500() {
        int expected = 500;
        int actual = service.remain(1500);
        assertEquals(expected, actual);
    }

    @Test
    public void remain1000() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}