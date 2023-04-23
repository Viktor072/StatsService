package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void findAmountOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getAmount(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void findAverageOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getAverage(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMonthMax(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMonthMin(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityUnderAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findQuantityUnderAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityOverAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findQuantityOverAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

}

