package ru.netology.stats;

public class StatService {

    public long sumSales(long[] sales) { //рассчет суммы продаж
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long avgSales(long[] sales) { //рассчет средней суммы продаж
        return sumSales(sales) / sales.length;
    }

    public int minSales(long[] sales) { //рассчет номера месяца с минимальными продажами
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i;                  // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) { //рассчет номера месяца с максиными продажами
        int maxMonth = 0; // номер месяца с макcимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i;
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int lesThanAvgSales(long[] sales) { //Количество месяцев, в которых продажи были ниже среднего
        int count = 0;
        long avg = avgSales(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;

            }
        }
        return count;
    }

    public int aboveThanAvgSales(long[] sales) { //Количество месяцев, в которых продажи выше среднего
        int count = 0;
        long avg = avgSales(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;

            }
        }
        return count;
    }
}
