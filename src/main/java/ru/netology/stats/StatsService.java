package ru.netology.stats;

public class StatsService {
    public int summAllMonth(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double middleCostOfAllMonth(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double middleCost = sum / arr.length;
        return middleCost;
    }

    public int minMonth(int[] arr) {
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[sum] > arr[i]) {
                sum = i;
            }
        }
        return sum + 1;
    }

    public int maxMonth(int[] arr) {
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[sum] < arr[i]) {
                sum = i;
            }
        }
        return sum + 1;
    } // отсутствует спецификация для одинаковых результатов.

    public int countLowMonth(int[] arr) {
        int count = 0;
        double middle = middleCostOfAllMonth(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= middle) continue;
            count++;
        }
        return count;
    }

    public int countHighMonth(int[] arr) {
        int count = 0;
        double middle = middleCostOfAllMonth(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= middle) continue;
            count++;
        }
        return count;
    }

}


