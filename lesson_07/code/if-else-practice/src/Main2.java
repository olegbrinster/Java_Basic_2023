import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("If - else practice");


        //  -Задача 3:
        //  Написать метод, выводящий на экран максимальное из трех целых чисел.
        //  Числа должны вводится с клавиатуры.


        Scanner scanner = new Scanner(System.in); // Swtch on Scanner

        System.out.println("Input 1st number, pls:");
        int a = scanner.nextInt();

        System.out.println("Input 2nd number, pls:");
        int b = scanner.nextInt();

        System.out.println("Input 3rd number, pls:");
        int c = scanner.nextInt();

// Алгоритм:
        // Шаг 1 - объявить переменную max
        // Шаг 2 - присвоим max = a ( любую и любую из наших переменных
        // Шаг 3 - сравним b и max, если b > max to max = b
        // Шаг 4 - сравним c и max, если c > max to max = c

        int maximum = maxABC(a, b, c); // вызов метода и передали ему на вход три числа a, b, c
        System.out.println("Max from " + a + "," + b + "," + c + "is:" + maximum);

    }
    //_______Methods_________
    public static int maxABC (int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    //____end of Methods______

}



/*




        Scanner scanner = new Scanner(System.in); // Swtch on Scanner

        System.out.println("Input number, pls:");
        int number = scanner.nextInt();

        if (number % 2 == 0 ) {
            System.out.println("This number " + number + " even."); // message for user
        } else {
            System.out.println("This number " + number + " is odd."); // message for user
        }

        if (number > 0 ) {
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
 */