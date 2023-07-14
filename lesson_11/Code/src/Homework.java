import java.io.* ;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        System.out.println("Home work");

        Scanner scanner = new Scanner(System.in);

        //Задача 1
        //Составьте программу, которая вычисляет сумму чисел от 1 до 1/n.
        // n вводится с клавиатуры.
        // Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10
        // Для вычисления sum используйте метод.

        System.out.println("Введите число n: ");

        int n = scanner.nextInt();

            System.out.println("Сумма чисел равна: " + sumOfFraction(n));
        }
        // ________ Methods ______
public static double sumOfFraction(double n) {
        //
    double sum = 0, i = 1;
    while ( i <= n ) {
        sum = sum + 1 / i;
        i++;
    }
    return sum;
}
}
