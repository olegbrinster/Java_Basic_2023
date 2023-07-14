package hw_21;

import java.util.Arrays;
import java.util.* ;

public class Hw_21PracticeString {



        public static void main(String[] args) {

            //Задча 1.
            // Выполнить все упражнения, которые мы делали на занятии со строкой.
            // В качестве примера строки взять свое слово или короткое предложение,
            // например, "Меня зовут Имя и Фамилия".

            String str = "Ich heiße Oleg Brinster!";
            System.out.println("String: " + str);

            String[] words = str.split(" "); // разделяем строку на слова, потому что разделителем является " " (пробел)
            int n = words.length;
            System.out.println("Quantity of words in the string: " + n);
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }

            String[] simbols = str.split(""); // разделяем строку на символы, потому что разделителем является "" (слитно)
            int m = simbols.length;
            System.out.println("Quantity of symbols in the string: " + m);
            for (int i = 0; i < simbols.length; i++) {
                System.out.print(simbols[i] + " | ");

            }
            System.out.println();
           int l = str.length() ;
            System.out.println("Length of string is: " + l);

            char lastSymbol = str.charAt(str .length() - 1); //последний символ
            System.out.println("Last symbol is: " + lastSymbol );

            String strNew1 = str .toLowerCase() ; // переводим строку в нижний регистр
            System.out.println(strNew1 );

            String strNew2 = str .toUpperCase() ; // переводим строку в верхний регистр
            System.out.println(strNew2 );

            String strNew3 = str.substring(10,14) ; // вырезаем строку
            System.out.println(strNew3 );

            String strNew4 = str.replaceAll("Brinster" , "Oleg") ; // замена строк
            System.out.println(strNew4 );

        }
    }





