package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void shouldFindMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMaxLarge() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1_000_000, 5_000_000, 8_000_000, 4_000_000, 1_000_000_000, 3_000_000, 18_000_000, 6_000_000, 11_000_000, 13_000_000, 12_000_000};
        long expected = 1_000_000_000;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMaxEquals() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMaxRepeat() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        long expected = 1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}