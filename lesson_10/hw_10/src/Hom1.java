
 import java.io.*;

import java.util.Scanner;

public class Hom1 {
    public static void main(String[] args) {

        // Задача 2:
        // В сберкассу на трёхпроцентный вклад положили S рублей.
        // Какой станет сумма вклада через N лет?

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада: S(руб) ");
        //int S = scanner.nextInt();
        double sum = scanner.nextDouble();

        System.out.println("Введите желаемый период: N(лет)");
        int Num = scanner.nextInt();
        int yearCount = 1;

     while (yearCount <= Num) {

         sum = sum + 3 * sum / 100;
         System.out.println("Сумма вклада через:" + yearCount + "year:" + sum);
         yearCount = yearCount + 1;

     }
    }
}
