


    //    code


import java.util.Scanner;

public class Main05 {
            public static void main(String[] args) {

                System.out.println("Задачи на вычисления");

                //  Запросить у пользователя длину радиуса окружности.
                //  Написать метод, который находит площадь круга для введенного радиуса.
                //  Вычислить площадь круга, вызвав написанный метод.

                Scanner scanner = new Scanner(System.in);

                System.out.println("Вычисление площади круга через радиус");

                System.out.println("Введите длину радиуса r:");

                double lengr = scanner.nextDouble();// считываем длину r

                // Площадь круга для введенного радиуса:
                // S=PI*r*r

                double s = Math.PI*lengr*lengr; // Вычисляем площядь s круга

                System.out.println("Площядь круга = " + s );

            }
        }

/*

 Scanner scanner = new Scanner(System.in);
                System.out.println("Вычисление угла треугольника");
                System.out.println("Выведите первый угол: ");
                int a1 = scanner.nextInt();

                System.out.println("Выведите второй угол: ");
                int a2 = scanner.nextInt();

                int a3 = 180 - a1 - a2; //сумма = 180

                System.out.println("Величина 3-его угла =: " + a3);

                __________________

                 System.out.println("Задачи на вычисления");

                Scanner scanner = new Scanner(System.in);
                System.out.println("Вычисление длины окружности и площади круга");


                System.out.println("Введите радиус окружности ");

                double radius = scanner.nextDouble();

                double l = 2 * Math.PI * radius; //длина

                double s = Math.PI * radius * radius; //площадь


                System.out.println("Длина круга: " + l);
                System.out.println("Площадь круга: " + s);
--------------------


  System.out.println("Input cost of City ticket:");
                double priceMonatKarte = scanner.nextDouble();
                System.out.println("Input number of working das in current month:");
                int workingDays = scanner.nextInt();

                int trip = workingDays * 2; //кол-во поездок в раб. дни
                int holydays = 31 - workingDays;

                int holydayTrip = (int) Math.round(1.5 * holydays); //кол-во поездок в вых. дни

                int trips = 0; // общ. кол-во поездок
                trips = trip +  holydayTrip;

                System.out.println("Number of trips in May:" + trips);

                double averageTripPrice = priceMonatKarte/trips; // вычисляем ср. стоимость

                System.out.println("Average price = " + averageTripPrice); //выводим на печать

                System.out.printf("Average price =%.2f", averageTripPrice); //выводим на печать


                -------------------

                  System.out.println("Задачи на вычисления");

                //  Вычислите гипотенузу по двум катетам.
                //  Длину катетов запросите у пользователя.
                //  Теорема Пифагора. Math.sqrt();

                Scanner scanner = new Scanner(System.in);

                System.out.println("Вычисление гипотенузы по катетам");

                System.out.println("Введите длину катета a: ");

                double lenga = scanner.nextDouble(); // считываем длину а

                System.out.println("Введите длину катета b: ");

                double lengb = scanner.nextDouble(); // считываем длину b

                double lengc = Math.sqrt((lenga * lenga) + (lengb * lengb));

                System.out.println("Длина гипотенузы: " + lengc);

            }
        }
-----------------------


import java.util.Scanner;

public class Main1 {
            public static void main(String[] args) {

                System.out.println("Задачи на вычисления");

                //  Вычислите площадь треугольника по формуле Герона: p = (a + b + с)/2;
                //  S = sqrt(p*(p-a)(p-b)(p-c));

                Scanner scanner = new Scanner(System.in);

                System.out.println("Вычисление площади треугольника по формуле Герона");

                System.out.println("Введите длину стороны а:");

                double lenga = scanner.nextDouble();// считываем длину а

                System.out.println("Введите длину стороны b:");

                double lengb = scanner.nextDouble();// считываем длину b

                System.out.println("Введите длину стороны с:");

                double lengc = scanner.nextDouble();// считываем длину c

                double p = (lenga + lengb + lengc) / 2; // вычисляем периметр

                double s = Math.sqrt((p*(p-lenga)*(p-lengb)*(p-lengc))); // Вычисляем площядь s

                System.out.println("Площядь = " + s );

            }
        }


 */
