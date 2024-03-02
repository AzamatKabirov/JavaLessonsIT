package lesson08;

import java.util.Scanner;

public class Homework01 {
    /*
    Напечатать в консоль все чётные числа от 1 до 20
     */

    public static void main(String[] args) {
        int odd = 2;
        while (odd <= 20) {
            if (odd % 2 == 0) {

                System.out.println(odd);

            }
            odd = odd + 2;
        }
    }
    }

