package hw_22;

import java.io.* ;
import java.util.Scanner;

public class Hw22_Amoeba {

    public static void main(String[] args) {

        //Задача 2.
        // (цикл) Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы.
        // Необходимо определить, сколько будет амёб через n часов,
        // если первоначально была только одна амёба.

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(" Введитете число n.");

            int n = scanner.nextInt();

            int res = 1;  // первоначальное кол-во амеб

            for (int i = 0; i < n / 3; i++) {

                res *= 2;  // кол-во амеб через n часов
            }
            System.out.println("Через это время появится: " + res + "амебы");

            System.out.println("Continue? y/n");
            String choice = scanner.next();
            if (!choice.equals("y") ) {
                System.out.println("Thanks, bye!");
                break;
        }
      }
    }
}
