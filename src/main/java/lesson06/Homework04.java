package lesson06;

import java.util.Scanner;

public class Homework04 {
    /*
    Создайте программу для расчёта налога, который зависит
    от категории товара и региона покупателя.
    Налог на электронику 10%, на одежду 5%.
    Если покупатель из региона A, применяется дополнительный налог 2%.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите цену товара");
        Double price = scanner.nextDouble();
        System.out.println("Введите категорию товара: electronics, clothes или other");
        String name = scanner.next();
        System.out.println("Введите регион");
        String region = scanner.next();
        if (region.equals("NRW")) {
            price = price + price * 0.02;
        }
            //электроника
            if (name.equals("electronics")) {
                System.out.println("Налог на товар 10 %. " + "Стоимость с налогом составит " + (price + (price * 0.1)) + " Euro");
            } else {
                //одежда
                if (name.equals("clothes")) {
                    System.out.println("Налог на товар 5 %. " + "Стоимость с налогом составит " + (price + (price * 0.05)) + " Euro");
                } else {
                    System.out.println("Налог не применяется. Стоимость составляет " + price + " Euro");
                }

            }
            scanner.close();
        }

}