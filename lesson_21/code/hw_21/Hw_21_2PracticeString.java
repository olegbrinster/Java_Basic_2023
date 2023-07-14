package hw_21;

import java.util.Arrays ;

public class Hw_21_2PracticeString {

        public static void main(String[] args) {

            //Задча 2.Дано предложение: "Казнить нельзя помиловать".
            // Поменяйте первое и последнее слово в нем местами;
            // добавьте в него запятую на нужном месте и выведите на печать.

            String str = "Казнить нельзя помиловать.";
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


            String strNew4 = str.replace("Казнить","Помиловать") ; // замена строки
            String strNew5 = strNew4 .replace( "помиловать", ", казнить");
            System.out.println(strNew4 );
            System.out.println(strNew5 );

        }
    }


