package lesson08;

import java.util.Scanner;

public class Homework03 {
    /*
    Пользователь вводит число, посчитать сумму всех натуральных чисел,
    которые идут до него включительно.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int res = 0;
        int number = scanner.nextInt();
             for (int i = 1; i <= number; i++){
                res += i; // --> res = res + i
            }

        System.out.println("Сумма всех натуральных чисел до " + number + " включительно равна " + res);
    }
}
