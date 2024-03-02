package lesson08;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Homework02 {
    /*
    Пользователь вводит число, напечатать табличку умножения для этого числа.
    Например, если введено 4, нужно напечатать:
    1 * 4 = 4
    2 * 4 = 8
    3 * 4 = 12
    (и так далее до 10)
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            int result = i * number;
        System.out.println(i + " * " + number + " = " + result);

    }
}
}