
import java.io.* ;

 public class HomeWork_16 {

     public static void main(String[] args) {

         System.out.println("Home work 16");

         //Задача 2.
         // Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
         // Найдите среднюю величину по всем элементам массива с четными индексами.

         int[] num = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};

         printArray(num); //вызываем метод и печатаем массив
         System.out.println();

         double sum = 0; // сумма элементов с четными индексами
         double n = 0;
         double average = 0;
         System.out.println("Средняя величина элементов с четными индексами");

         // находим элементы с четными индексами

         for (int i = 0; i < num.length; i++) {

             if (i % 2 == 0) {
                 sum += num[i];
                 n++;
             }
         }
         //sum += num[i]; // сложение элементов
         average = sum / n;

        // System.out.print(num[i] + "|");

         System.out.println();
         System.out.println("Всего элементов:" + n);
         System.out.println("Их сумма:" + sum);
         System.out.println("Средняя величина элементов с четными индексами: " + average);

     }

//__________ Methods _______

     public static void printArray(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " | ");

             //______end of methods _____
         }
     }
 }

