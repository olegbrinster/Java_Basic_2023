import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("If - else practice - NEXT");


        //  Задание 2: Объявите две переменные целого типа a и b и присвойте им значения с клавиатуры.
        //  Создайте третью переменную sum и выведите ее значение на экран таким образом:
        // Если a = b, то sum будет равно 2*(a+b) a если нет, то sum= a+b.


        Scanner scanner = new Scanner(System.in); // Switch on Scanner

        System.out.println("Input 1st number, pls:");
        int a = scanner.nextInt();

        System.out.println("Input 2nd number, pls:");
        int b = scanner.nextInt();
        int sum;

        if (a == b) {

            sum = 2 * (a + b);
        } else {
            sum = a + b;
    }

    System.out.println("sum = " + sum);

    }
}

/*




        Scanner scanner = new Scanner(System.in); // Switch on Scanner

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