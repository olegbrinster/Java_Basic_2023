

import java.io.*;

     import java.util.Scanner;

     public class Main_hw_09 {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             System.out.println("Home Work 09");

             // Задача 3.
             //В первый день спортсмен пробежал s километров,
             // а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
             // Определите номер дня, на который пробег спортсмена составит не менее target километров.
             // Программа получает на вход действительные числа s и target
             // и должна вывести одно натуральное число.

             System.out.println("Введите число киллометров s (km) за первый день");

             double s = scanner.nextDouble();

             System.out.println("Введите цель пробега target (km)");

             double target = scanner.nextDouble();

             int day = 1;

             while (s < target) {

                 s = s + s / 10;

                 day++;
             }
             System.out.println("Спортсмен достигнет результата на:" + day + "день");
         }
     }

/*
---------


import java.io.*;

     import java.util.Scanner;

     public class Main_hw_09 {
         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);

             System.out.println("Home Work 09");

             // Задача 2.
             //Вводится положительное целое число, найдите сумму его цифр.

             System.out.println("Введите число:");

             int n = input.nextInt();


          System.out.println("Сумма цифр равна: " + sumD(n));

     }
         public static int sumD(int n) {
             int sum = 0;
             while (n != 0) {
                 sum += n % 10;
                 n /= 10;
                 System.out.println(n);
             }

             return sum;
         }

     }

     -----------------------



import java.io.*;

     import java.util.Scanner;

     public class Main_hw_09 {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             System.out.println("Home Work 09");

             // Задача 1.
             //Программа получает на вход строку и число повторений этой строки
             // Программа должна вывести эту строку нужное количество раз.

             System.out.println("Введите техт:");
             String text = scanner.next();

             System.out.println("Введите число повторений");
             int w = scanner.nextInt(); // w = wiederholung
             int num = 0;
             while (num < w) {
                 System.out.println(text);
                 num ++;
             }
         }

     }

 */