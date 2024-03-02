package lesson06;

import java.util.Scanner;

public class Homework02 {
    /*
       Напишите программу, которая запрашивает у пользователя
        целое число и сообщает, является ли это число четным или нечетным
        */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        /*
        % - оператор остатка от целочисленного деления
        т.е., например, 15 / 7 = 2 остаток 1
        т.е. результатом операции 15 % 7 в программировании будет 1
        Остаток от деления всегда будет в промежутке от 0 до делителя минус 1
         */
        if (number % 2 == 0){
            System.out.println("Число " + number + " чётное");
        }
       else {
            System.out.println("Число " + number + " нечётное");
        }

        scanner.close();
    }


}
