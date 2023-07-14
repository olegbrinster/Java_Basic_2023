

import java.util.Scanner;
import java.io.*;

                public class Main {
                    public static void main(String[] args) {

                        System.out.println("Home work_07");

                        //-Задача 3:
                        // Сделайте расчет покупки товаров со скидками.
                        //Стоимость, количество товаров и скидку на них вводит пользователь.
                        // Товар А стоит X руб и на него скидка D%, а товар B стоит Y руб и на него скидка С%.
                        // Клиент взял N товаров A и M товаров B. Программа не должна допускать ввода отрицательных чисел.
                        // Выведите итоговую стоимость покупки и полученной скидки.

                        Scanner scanner = new Scanner(System.in); // Switch on Scanner

                        System.out.println("Введите стоимость товара А:");

                        double preisA = scanner.nextDouble(); // считываем стоимость товара А

                        if (preisA < 0) {
                            System.out.println("ERROR");
                        } else

                            System.out.println("Введите стоимость товара B:");
                        double preisB = scanner.nextDouble(); // считываем стоимость товара B

                        if (preisB < 0) {
                            System.out.println("ERROR");
                        } else

                            System.out.println("Введите скидку на товар А ");
                        int reduzD = scanner.nextInt(); // cчитываем скиду D товара А

                        if (reduzD < 0) {
                            System.out.println("ERROR");
                        } else

                            System.out.println("Введите скидку на товар B ");
                        int reduzC = scanner.nextInt(); // cчитываем скиду C товара B

                        if (reduzC < 0) {
                            System.out.println("ERROR");
                        } else

                            System.out.println("Введите количество товара А:");
                        int mengN = scanner.nextInt(); // считываем количество N товара А

                        if (mengN < 0) {
                            System.out.println("ERROR");
                        } else

                            System.out.println("Введите количество товара B:");
                        int mengM = scanner.nextInt(); // считываем количество M товара B


                        double d = preisA * reduzD / 100; // Вычисляем стоимость скидки товара А
                        double c = preisB * reduzC / 100; // Вычисляем стоимость скидки товара B

                        double S = mengN * (preisA - d) + mengM * (preisB - c);

                        System.out.println("Стоимость покупки с учетом скидок = " + S + " руб.");

                    }

                }
