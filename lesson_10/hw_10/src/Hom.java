//import java.io.*;

import java.util.Scanner;

public class Hom {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        // Задача 1:
        // С клавиатуры вводятся N чисел.
        //  Составьте программу, которая определяет кол-во отрицательных,
        //  кол-во положительных и кол-во нулей среди введеных чисел.
        // Значение N вводится с клавиатуры.

        System.out.println("Введите количество чисел");
        int k = scanner.nextInt();

        int n = 0; // n - negative
        int p = 0; // p - positive
        int z = 0; // z - zero

        System.out.println("Введите числа:");

        int i = 0;
        while (i < k) {

            int num = scanner.nextInt();

            if (num > 0) {
                p++;
            } else if (num < 0) {
                n++;
            } else {
                z++; }
                i++;
            }
        System.out.println("Количество положительных чисел:" + p);
        System.out.println("Количество отрицательных чисел:" + n);
        System.out.println("Количество нулей:" + z);
        }
        }





