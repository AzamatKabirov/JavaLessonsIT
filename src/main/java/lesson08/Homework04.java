package lesson08;

import java.util.Scanner;

public class Homework04 {
    /*
    Пользователь вводит число. Посчитать суммму всех его цифр.
    Например, для числа одна тысяча двести тридцать четыре (1234) результат будет 10.
    Подсказка: разряды
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, сумму цифр которых нужно подсчитать: ");
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            //Суммирование цифр числа
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum);

    }
}
