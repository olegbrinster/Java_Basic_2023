import java.io.* ;

import java.util.Scanner ;

public class Hw_3 {

    public static void main(String[] args) {

        System.out.println("Hom work lesson_14");
        System.out.println();
        //Задача 3.
        // Задача про поиск "счастливого пельменя", часть 2.
        // Хозяйка налепила для гостей 30 пельменей.
        // В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
        // Напишите программу, которая ищет счастливый пельмень.

        int[] num = new int[30];
        int a = 25, b = 40;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        for (int i = 0; i < num.length ; i++) {
            System.out.print(num [i] + "|");

        }

        int max = num[0]; // в качестве самого тяжелого пельменя
        // пока временно назначили 1-й пельмень массива (под индексом 0)

        int pointer = -1; // это значит, что пока элемента еще не нашли

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i]; // находим самый тяжелый пельмень
                pointer = i; // сохраняем его номер в переменной pointer
            }
        }
        System.out.println();
        System.out.println("Счастливый пельмень номер: " + pointer);

        }
    }


/*
-----------------------
import java.io.* ;

import java.util.Scanner ;

public class Hw_3 {

    public static void main(String[] args) {

        System.out.println("Hom work lesson_14");
        System.out.println();
        //Задача 2.
        // Задача про поиск "счастливого пельменя", часть 1.
        // Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
        // Напишите программу,
        // которая занесет в массив данные о весе каждого слепленного пельменя.

        int[] num = new int[31];
        int a = 25, b = 30;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        for (int i = 1; i < num.length ; i++) {
            System.out.println( i +"-й пельмень весит" + num[i] + "грамм" );

        }

    }
}


*/