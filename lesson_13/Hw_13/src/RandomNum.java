import java.util.Scanner ;

public class RandomNum {

    public static void main(String[] args) {


//Задача 2.
// Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
// Запросите у пользователя какое-то натуральное число.
// Определите, есть ли это число в массиве.
// Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
// а возвращает ответ - нашлось ли это число в массиве.

        Scanner scanner = new Scanner(System .in ) ;

        int[] num = new int[10];

        int a = 1, b = 100;

        for (int i = 0; i < num.length ; i++) {

            // заполним элементы массива случайными

           num [i] = (int)(Math.random() * (b - a + 1) + a);

        }

        printArray(num); // вызываем метод ипечатаем массив

        System.out.println("Input number for search (integer and positive):");
        int n = scanner.nextInt();

        while ( n < 0 ) {
            System.out.println("Wrong input! Try again");
            n = scanner.nextInt(); // переспрашиваем ввод числа
        }

        // вызов метода поиска и печать результата


        if (searchInArray(num, n )) {
            System.out.println(" We find the number!" + searchIndexArray(num, n));
        }else {
            System.out.println("We didn`t find the number!" +searchIndexArray(num, n));
        }

    }
    //_________ Methods _______

    public static int  searchIndexArray(int[] num, int n ) {
       int index = -1; // несуществующий индекс

        for (int i = 0; i < num.length; i++) {

            // проверяем что в массиве есть искомое число
            if (n == num[i]) {
                index = i;
                return index ;
            }

            }
        return index ;
        }

    public static boolean searchInArray(int[] num, int n ) {
        boolean res = false ;
        for (int i = 0; i < num.length; i++) {

            // проверяем что в массиве есть искомое число
        if (n == num[i]) {

            return true;
        }
    }
        return false ;
    }
    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " | ");

        }
    }

    //________ end of methods ________

}
