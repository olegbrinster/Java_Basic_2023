package Practice;

public class Homework14 {

    public static void main(String[] args) {
        System.out.println("Home work lesson 14 / 1");

          // Задача 1.
        // изменить код задач про:
        //    сумма нечетных чисел в массиве
        //    умножать числа с четными индексами в массиве так, чтобы использовались операторы break или continue.

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

        oddElements(num );
    }

    //________ Methods _________

    public static void printOddArray (int [] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                continue;
            }
                System.out.print(num[i] + "|");
        }
    }
    //__________
    public static void printArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "|");
        }
    }
    //__________
    public static int oddElements(int[] num ) {
        int sumOdd = 0;

        for (int i = 0; i < num.length; i++) {
           // if (num[i] % 2 != 0) {
            if (num [i] % 2 == 0) {
                continue;
            }
                sumOdd += num[i];
        }
        System.out.println("Сумма всех нечетных элементов массива:" + sumOdd);

        return sumOdd;

    }
    //___________ end of Methods _________
}



