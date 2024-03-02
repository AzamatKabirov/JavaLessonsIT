package lesson06;

import java.util.Scanner;

public class Homework01 {

    /*
    Напишите программу, которая запрашивает у пользователя
    два числа и выводит их сумму
    */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите слагаемое 1: ");
        double summandOne = scanner.nextDouble();
        System.out.println("Введите слагаемое 2: ");
        double summandTwo = scanner.nextDouble();
        double sum = summandOne + summandTwo;
        System.out.println("Сумма  = " + sum);
        scanner.close();
    }


}

