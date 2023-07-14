
import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {

        //Задача 3.
        // Пользователь вводит натуральное число.
        // Распечатайте это число в обратном порядке.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer positive number:");
        int n = scanner.nextInt();

        int digits = 0;
        int nd = n;

        // занесем цифры числа в массив, а потом распечатаем его в обратном порядке

        while (n > 0) {
            digits++;
            n = n / 10;
        }

        System.out.println(digits);

        int[] digit = new int[digits]; //

        // в массив digit заносим цифры числа

        for (int i = 0; i < digit.length; i++) {
            digit[i] = nd % 10; // остаток щт деления на 10 - это иесть
            nd = nd / 10;

        }
        printArray(digit);
        System.out.println();
        printArrayRevers(digit);


    }
//__________ Method _____

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");

        }
    }

    public static void printArrayRevers(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " | ");
        }
    }
    // _____ end of Method ______
}


