import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Home work_07");

        //-Задача 3:
       // Сделайте расчет покупки товаров со скидками.
        //Стоимость, количество товаров и скидку на них вводит пользователь.
        // Товар А стоит X руб и на него скидка D%, а товар B стоит Y руб и на него скидка С%.
        // Клиент взял N товаров A и M товаров B. Программа не должна допускать ввода отрицательных чисел.
        // Выведите итоговую стоимость покупки и полученной скидки.

        Scanner scanner = new Scanner(System.in); // Switch on Scanner

        System.out.println("Введите стоимость товара А:");

        double preisA = scanner.nextDouble(); // считываем стоимость товара А

        if (preisA < 0) {
            System.out.println("ERROR");
        } else

            System.out.println("Введите стоимость товара B:");
        double preisB = scanner.nextDouble(); // считываем стоимость товара B

        if (preisB < 0) {
            System.out.println("ERROR");
        } else

            System.out.println("Введите скидку на товар А ");
         int reduzD = scanner.nextInt(); // cчитываем скиду D товара А

        if (reduzD < 0) {
            System.out.println("ERROR");
        } else

            System.out.println("Введите скидку на товар B ");
        int reduzC = scanner.nextInt(); // cчитываем скиду C товара B

        if (reduzC < 0) {
            System.out.println("ERROR");
        } else

            System.out.println("Введите количество товара А:");
          int mengN = scanner.nextInt(); // считываем количество N товара А

        if (mengN < 0) {
            System.out.println("ERROR");
        } else

            System.out.println("Введите количество товара B:");
        int mengM = scanner.nextInt(); // считываем количество M товара B


        double d = preisA * reduzD / 100; // Вычисляем стоимость скидки товара А
        double c = preisB * reduzC / 100; // Вычисляем стоимость скидки товара B

         double S = mengN * (preisA - d) + mengM * (preisB - c);

        System.out.println("Стоимость покупки с учетом скидок = " + S + " руб.");

        }

    }


/*-------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("If - else practice");


        //-Задание 1:
        // Проверка четное или нечетное, положительное или отрицательное введенное пользователем число.
        // Проверка возраста собеседника, возраст запросить у пользователя. Если пользователю нет
        // 18 лет, то сообщить "Вам надо получить общее среднее образование", иначе - спросить дату
        // дня рождения и вывести ее на экран.

        Scanner scanner = new Scanner(System.in); // Switch on Scanner

        System.out.println("Input number, pls:");
        int number = scanner.nextInt();

        if (number % 2 == 0 ) {  // check division bu 2
            System.out.println("This number " + number + " is even."); // message for user
        } else {
            System.out.println("This number " + number + " is odd."); // message for user
        }

        if (number > 0 ) { // check negative or positive
            System.out.println("This number " + number + " is positive"); // message for user
        } else {
            System.out.println("This number " + number +" is negative"); // message for user

        }

       // even and positive number

        if (number > 0 & number % 2 == 0) { // check negative or positive
            System.out.println("This number " + number + " is positive and even"); // message for user
        }
           System.out.println("How old are you"); // question for user
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Yoe have to finish school!");

        } else {
            System.out.println("What is your date of birthday?"); // question for user
            String dayOfBirth = scanner.next();
            System.out.println("Your day of birthday is: " + dayOfBirth);
        }

    }
}

-------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Home work_07");


        //-Задача 1:
        // Запросить у пользователя три стороны треугольника.
        // Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
        //Сообщить результат пользователю - существует или нет треугольник с введенными сторонами.

        Scanner scanner = new Scanner(System.in); // Switch on Scanner

        System.out.println("Введите длину стороны а:");

        double lenga = scanner.nextDouble(); // считываем длину а


        System.out.println("Введите длину стороны b:");

        double lengb = scanner.nextDouble(); // считываем длину b

        System.out.println("Введите длину стороны c:");

        double lengc = scanner.nextDouble(); // считываем длину c

        if ((lenga < (lengb + lengc)) & (lengb < (lengc + lenga)) & (lengc < (lenga + lengb))){

            System.out.println("Треугольник с введенными сторонами существует");

        } else {
            System.out.println("Треугольник с введенными сторонами не существует");

        }

    }
}

------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Home work_07");


        //-Задача 2:
        //Дополнить задачу о сумме углов треугольника контролем, что вводимые углы не больше 90 градусов.

        Scanner scanner = new Scanner(System.in); // Switch on Scanner

        System.out.println("Введите величину угла А:");

        int gradA = scanner.nextInt(); // считываем величину угла А

        if (gradA > 90) {
            System.out.println("Величина угла А больше 90 градусов");
        } else

            System.out.println("Введите величину угла B:");

        int gradB = scanner.nextInt(); // считываем величину угла B
        if (gradB > 90) {
            System.out.println("Величина угла B больше 90 градусов");
        } else

            System.out.println("Введите величину угла C:");
        int gradC = scanner.nextInt(); // считываем величину угла C
        if (gradC > 90) {
            System.out.println("Величина угла C больше 90 градусов");

        }

    }
}
 */