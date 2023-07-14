
import java.io.* ;

public class Hw12 {
    public static void main(String[] args) {

        System.out.println("Home work");

        // Задача 1:
        // Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
        // Выведите на печать температуру, которая была во вторник и затем в четверг.
        // Найти среднюю температуру за прошлую неделю.

        double[] temperature = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8};

        int l = temperature.length;

        System.out.println("Данные температуры за:" + l + "дней");

        for (int i = 0; i < temperature.length; i++) {

            System.out.print(temperature[i] + " | ");
        }
        System.out.println("    ");

        System.out.println("Температура во вторник:" + temperature[1]);

        System.out.println("Температура в четверг:" + temperature[3]);


       // double average = (temperature[0] + temperature[1] + temperature[2] + temperature[3] + temperature[4] + temperature[5] + temperature[6]) / 7;

        double sum = 0;

        for (double i : temperature) {

            sum +=i;
        }

        System.out.println("Средняя температура за неделю:" + sum / temperature.length);
    }
}







