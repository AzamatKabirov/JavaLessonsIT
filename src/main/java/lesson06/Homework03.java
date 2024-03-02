package lesson06;

import java.util.Scanner;

public class Homework03 {

    /*
    Создайте программу, которая запрашивает у пользователя
    оценки по пяти предметам, затем рассчитывает и выводит средний бал.
        */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите оценку по математике: ");
        int markOne = scanner.nextInt();
        System.out.println("Введите оценку по биологии: ");
        int markTwo = scanner.nextInt();
        System.out.println("Введите оценку по химии: ");
        int markThree = scanner.nextInt();
        System.out.println("Введите оценку по физике: ");
        int markFour = scanner.nextInt();
        System.out.println("Введите оценку по информатике: ");
        int markFive = scanner.nextInt();

        float sum = (markOne + markTwo + markThree + markFour + markFive);
        System.out.println("Средний бал  = " + sum/5);
        scanner.close();
    }


}
