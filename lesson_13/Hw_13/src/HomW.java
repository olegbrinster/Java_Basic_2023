
import java.io.* ;
import java.util.Scanner ;

public class HomW {
    public static void main(String[] args) {

        System.out.println("Hom work lesson_13");

        //Задача 1.
        // Написать метод, принимающий массив целых чисел,
        // и возвращающий сумму всех его нечетных элементов (не индексы!, а сами элементы).
        // Массив на 100 элементов задать случайными числами в интервале от 1 до 100.

        int[] num = new int[100];
        int a = 1, b = 100;


        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        System.out.println();

        printArray(num);

        System.out.println();

        System.out.print("нечетные элементы массива:");

        printOddArray(num);

        System.out.println();

        oddElemens(num );
    }

    //________ Methods _________

    public static void printOddArray (int [] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + "|");
            }
        }
    }
    //__________
    public static void printArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "|");

        }
    }
        //__________
        public static int oddElemens(int[] num ) {
            int sumOdd = 0;

            for (int i = 0; i < num.length; i++) {
                if (num[i] % 2 != 0) {
                    sumOdd += num[i];
                }
            }
            System.out.println("Сумма всех нечетных элементов массива:" + sumOdd);

            return sumOdd;

        }
        //___________ end of Methods _________
    }

