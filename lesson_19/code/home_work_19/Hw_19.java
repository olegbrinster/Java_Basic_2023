import java.util.Scanner;

public class Hw_19 {

    public static void main(String[] args) {

       //Задача 2.
        //  Вводится пользователем натуральное число n.
        //  Сформировать массив из всех делителей данного числа.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input intege positiv number:");

        int n = scanner.nextInt() ;
        int m = 0;                    // число делителей
        int array[] = new int[n] ;
        int div;                      // div - делитель
        for (int i = 1; i <= n ; i++) {
            if (n % i ==0){
            div = i;
            array [m] = div;
            m++;

            }
        }
        // заполнение массива
        for (int i = 0; i < m; i++) {

            System.out.print(array[i] + ",");
        }
    }
}




