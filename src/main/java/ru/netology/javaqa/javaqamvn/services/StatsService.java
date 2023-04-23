package ru.netology.javaqa.javaqamvn.services;

public class StatsService {
    public static void main(String[] args) {
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int amount = getAmount(sales);
        System.out.println("Сумма всех продаж " + amount);

        int average = getAverage(sales);
        System.out.println("Средняя сумма продаж " + average);

        int monthMax = findMonthMax(sales);
        System.out.println(monthMax + " Месяц максимальных продаж");

        int monthMin = findMonthMin(sales);
        System.out.println(monthMin + " Месяц минимальных продаж");

        int monthUnderAverage = findQuantityUnderAverage(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего " + monthUnderAverage);

        int monthOverAverage = findQuantityOverAverage(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего " + monthOverAverage);

    }
    // Сумма всех продаж
    public static int getAmount(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }

    // Среднее арифметическое всех продаж
    public static int getAverage(int[] sales) {

        return getAmount(sales) / sales.length;

    }

    //Месяц максимальных продаж (последний месяц, соответствующий условиям)
    public static int findMonthMax(int[] sales) {
        int max = sales[0];
        int number = 0;
        int numberMax = 0;
        for (int sale : sales) {
            number++;
            if (max <= sale) {
                max = sale;
                numberMax = number;
            }
        }
        return numberMax;
    }

    //Месяц минимальных продаж
    public static int findMonthMin(int[] sales) {
        int min = sales[0];
        int number = 0;
        int numberMin = 0;
        for (int sale : sales) {
            number++;
            if (min >= sale) {
                min = sale;
                numberMin = number;
            }
        }
        return numberMin;
    }

    //количество месяцев, в которые продажи были ниже среднего
    public static int  findQuantityUnderAverage(int[] sales) {
        int average = getAverage(sales);
        int month = 0;
        int quantityUnder = 0;
        for (int sale : sales) {
            if (sale < average) {
                month++;
                quantityUnder = month;
            }
        }
        return quantityUnder;
    }

    //количество месяцев, в которые продажи были выше среднего
    public static int findQuantityOverAverage(int[] sales) {
        int average = getAverage(sales);
        int month = 0;
        int quantityOver = 0;
        for (int sale : sales) {
            if (sale > average) {
                month++;
                quantityOver = month;
            }
        }
        return quantityOver;
    }

}

