package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumAllMonthTest() {
        StatsService service = new StatsService();

        int expected = 180;
        int arr[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.summAllMonth(arr);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void middleCostOfAllMonthTest() {
        StatsService service = new StatsService();

        int expected = 15;
        int arr[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.middleCostOfAllMonth(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonth() {
        StatsService service = new StatsService();

        int expected = 9;
        int arr[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minMonth(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonth() {
        StatsService service = new StatsService();

        int expected = 6;
        int arr[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxMonth(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLowMonth() {
        StatsService service = new StatsService();

        int expected = 5;
        int arr[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.countLowMonth(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countHighMonth() {
        StatsService service = new StatsService();

        int expected = 5;
        int arr[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.countHighMonth(arr);

        Assertions.assertEquals(expected, actual);
    }
}
