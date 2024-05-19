package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatService service = new StatService();

    @Test
    public void testSumSales() {

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAvgSales() {

        long expected = (8 + 13 + 15 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.sumSales(sales) / sales.length;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {

        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {

        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLesThanAvgSales() {

        long expected = 5;
        long actual = service.lesThanAvgSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAboveThanAvgSales() {

        long expected = 5;
        long actual = service.aboveThanAvgSales(sales);
        Assertions.assertEquals(expected, actual);

    }
}