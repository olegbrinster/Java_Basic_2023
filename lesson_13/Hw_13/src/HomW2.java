
import java.io.* ;
import java.util.Scanner ;

public class HomW2 {

    public static void main(String[] args) {

        System.out.println("Hom work lesson_13");

        //Задача 2.
        // Написать метод, принимающий массив целых чисел, и возвращающий произведение всех его элементов,
        // с четными индексами. 0 - тоже четное число.

        int[] num = new int[20];
        int a = 1, b = 20;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        printArray(num); //вызываем метод и печатаем массив
        System.out.println();

        int mult = 1; // mult - multiplication
        int n = 0;

        System.out.println("Умножение элементов с четными индексами");

        // находим элементы с четными индексами

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                n++;
                mult = mult * num[i]; // произведение элементов
                System.out.print(num[i] + "|");
            }
        }
                System.out.println();
                System.out.println("Всего элементов:" + n);
                System.out.println("Их произведение:" + mult);
            }

//__________ Methods _______

        public static void printArray ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " | ");
            }
            //______end of methods _____
        }
    }



