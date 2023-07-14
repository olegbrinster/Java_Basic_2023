
import java.io.* ;
import java.util.Scanner ;


public class Revers {

    public static void main(String[] args) {
        System.out.println("Hom work lesson_13");
        //Задача 3.
        //  Пользователь вводит строку.
        //  Распечатайте эту строку в обратном порядке.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввести строку: ");

        String st = scanner.nextLine();

        char[] array = st.toCharArray();

        for (int i = st.length() - 1; i >= 0; i--) {

            System.out.print(array[i]);

        }
    }
}











