import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("If - else practice");

        //  -Задача 4:
        //  Решение квадратного уравнения по коэффициентам квадратного трехчлена а, b и с.


        Scanner scanner = new Scanner(System.in); // Swtch on Scanner

        System.out.println("Input 1st coefficient");
        int a = scanner.nextInt();

        System.out.println("Input 2nd coefficient");
        int b = scanner.nextInt();

        System.out.println("Input 3rd coefficient");
        int c = scanner.nextInt();

        int d = b * b - 4 * a * c; // calculate discriminant

        if (d < 0) {
            System.out.println("There are no roots, d is negative" + d);

        } else if (d == 0) {
            double x = -b / (2*a);
            System.out.println("X = " + x);


        }else {
            double x1 = (-b + Math.sqrt(d)) / (2*a);
             double x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("X1 = " + x1 + ", X2 = " + x2);
        }

        System.out.println("Thanks and goodblye!");


    }
}

/*


import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {

        System.out.println("If - else practice");


        //  -Задача 4:
        //  Решение квадратного уравнения по коэффициентам квадратного трехчлена а, b и с.


        Scanner scanner = new Scanner(System.in); // Swtch on Scanner

        System.out.println("Input 1st coefficient");
        int a = scanner.nextInt();

        System.out.println("Input 2nd coefficient");
        int b = scanner.nextInt();

        System.out.println("Input 3rd coefficient");
        int c = scanner.nextInt();

        int d = b * b - 4 * a * c; // calculate discriminant

        if (d < 0) {
            System.out.println("There are no roots, d is negative" + d);

        } else if (d == 0) {
            double x = -b / (2*a);
            System.out.println("X = " + x);


        }else {
            double x1 = (-b + Math.sqrt(d)) / (2*a);
             double x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("X1 = " + x1 + ", X2 = " + x2);
        }

        System.out.println("Thanks and goodblye!");


---------------------------------
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