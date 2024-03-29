package lesson07;

import java.util.Scanner;

public class Homework02 {
    /*
    Напишите программу для тестирования знаний.
Программа должна задать три вопроса связанных с программированием.

Ответом на первый вопрос должно быть да/нет,
на второй вопрос один вариант ответа из трех (a, b, c),
на третий вопрос открытый ответ (надо ввести ответ вручную)

Если пользователь правильно ответил хотябы на два вопроса, вывести сообщение "Вы хорошо знаете программирование!",
в противном случае вывести "Вам нужно учиться больше!".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Тест из трех вопросов:");
        System.out.println("1. Является ли джава языком программирования. (да/нет)");

        String answer1 = scanner.nextLine();

        if (answer1.equals("да")) {
            System.out.println("Верно!");
            /*
            ++ - оператор инкремента, увеличивает переменную на 1
            -- - оператор декремента, уменьшает переменную на 1
            переменная++ - суффиксный инкремент, пост-инкремент.
            ++переменная - префиксный инкремент, пре-инкремент
            Разница в приоритетности, приоритетность пре-инкремента
            намного выше пост-инкремента
            Комбинированные операторы присвоения
            += -= *= /= %=
            Это просто сокращения для записей
            переменная = переменная + значение === переменная += значение
            Результат операции между двумя операндами записывают в левый операнд
             */
            score++;
        } else {
            System.out.println("Неправильно!");
        }

        System.out.println("В каком году появилась Джава? a) 1991 b) 1995 c) 2000");

        String answer2 = scanner.nextLine();
        if (answer2.equals("a")) {
            System.out.println("Верно!");
            score++;
        } else {
            System.out.println("Неправильно!");
        }

        System.out.println("Какая компания разработала Джаву? (напишите ответ)");

        String answer3 = scanner.nextLine();
        if (answer3.equals("Sun Microsystems")) {
            System.out.println("Верно!");
            score++;
        } else {
            System.out.println("Неправильно!");
        }

        if (score >= 2) {
            System.out.println("Вы справились!");
        } else {
            System.out.println("Учитесь больше!");
        }
    }
}
