package lesson04;

public class Homework01 {
    public static void main(String[] args) {
        int age = 47;
        String name = "Азамат";
        /* День недели имеет сой порядковый номер от 1 до 7, где понедельник это - 1,
        вторник - 2 и т.д.
         */
        int dayOffWork = 6;
        // Сегодня - воскресенье, задаю этому дню номер 7
        int today = 7;
//Вариант 1
        boolean result = dayOffWork <= today;

        // Вариант 2
        boolean isWeekend = true;

        System.out.println("В свои " + age + " годков " + name + " прилежно выполнял домашнее задание в свой выходной день.");
        System.out.println("А выходной ли сегодня день? " + result);
        System.out.println("А выходной ли сегодня день? " + isWeekend);


    }
}
