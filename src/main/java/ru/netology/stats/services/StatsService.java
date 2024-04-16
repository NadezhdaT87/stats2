package ru.netology.stats.services;

import java.time.Month;

public class StatsService {
    public long calculateSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long findAverage(long[] sales) {

        return calculateSumSales(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSales(int[] sales) {
        int minMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minSumMonthSales(long[] sales) {
        int sumMinMonth = 0;
        long average = findAverage(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                sumMinMonth += 1;
            }
        }
        return sumMinMonth;
    }

    public int maxMonthSales(long[] sales) {
        int sumMaxMonth = 0;
        long average = findAverage(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= average) {
                sumMaxMonth += 1;
            }
        }

        return sumMaxMonth;
    }
}

