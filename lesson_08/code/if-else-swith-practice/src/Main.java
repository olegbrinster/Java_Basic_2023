import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Superman and his choice");

      // Задача 1.
        // Богатырь приехал к камню с выбором трех путей - налево, направо или прямо.
        // Считайте с клавиатуры выбор богатыря и сообщите ему его судьбу:
        // left - loose your horse, right - loose your honor, forward - loose your head.
        // Использовать сравнение строк st.equals(), st - это имя переменной типа String

// задача

    Scanner scanner = new Scanner(System.in);

        System.out.println("left - loose your horse, right - loose your honor, forward - loose your head");
        System.out.println("What is your choice?");

        String choice = scanner.next(); // считываем строку котору написал пользователь
// st.equals (" значение ")
        if (choice.equals("left")) {
            System.out.println("Лошадь потеряет");
        } else if (choice.equals("right")) {
                System.out.println("You loose your honor!");
            } else if (choice.equals("forward")) {
            System.out.println(" You loose your head");
            } else {
            System.out.println("Wrong input");
        }
    }
}