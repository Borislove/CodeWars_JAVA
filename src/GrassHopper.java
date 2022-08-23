/*Суммирование
Напишите программу, которая находит суммирование каждого числа от 1 до num. Число всегда будет целым положительным числом, большим 0.

Например:

суммирование(2) -> 3
1 + 2

суммирование(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
* */

public class GrassHopper {

    public static int summation(int n) {

        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(summation(8));
    }
}
