


        import java.util.Scanner;
         import java.io.*;

        public class Main {
            public static void main(String[] args) {

                System.out.println("Home work_08");

                //Задача 1:
                //Используя оператор switch ... case написать бот,
                //  который помогает выбрасывать мусор в баки разных цветов:
                //    упаковки в желтый бак
                //    пищевые отходы в коричневый бак
                //    бумага в зеленый бак
                //    прочие отходы в черный бак

          Scanner scanner = new Scanner(System.in);

                System.out.println("Müllklassifikation");
                System.out.println("Bitte, klassifizieren Sie Ihren Abfall!");

                String Müllklassifikation = scanner.next();

                switch(Müllklassifikation) {

                    case "Verpackung":
                        System.out.println("Gelber Container");
                        break;
                    case "Bioreste":
                        System.out.println("Brauner Container");
                        break;
                    case "Papier":
                        System.out.println("Grüner Container");
                        break;
                    case "Restmüll":
                        System.out.println("Schwarzer Container");
                        break;
                    default:
                        System.out.println("Falsche Input");
                        break;
                }

            }
}

/*

-----------------

        import java.util.Scanner;
         import java.io.*;

        public class Main {
            public static void main(String[] args) {

                System.out.println("Home work_08");

                //Задача 1:
                //Пользователь вводит с клавитуры число.
                // Вывести абсолютное значение (модуль) числа,
                // используя тернарный оператор.

          Scanner scanner = new Scanner(System.in);
                System.out.println("Введите какое-либо число");

                int number = scanner.nextInt();

                int str = number>=0 ? number: -number;

                System.out.println("Модуль числа" + str);

            }
}

 */