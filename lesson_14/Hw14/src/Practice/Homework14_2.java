public class Homework14_2 {

    public static void main(String[] args) {

        System.out.println("Home work lesson 14 / 2");

        // Задача 1/2.
        // изменить код задач про:
        // умножать числа с четными индексами в массиве так, чтобы использовались операторы break или continue.

        int[] num = new int[20];
        int a = 1, b = 20;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        printArray(num); //вызываем метод и печатаем массив
        System.out.println();

        int mult = 1; // mult - multiplication
        int n = 0;

        System.out.println("Умножение элементов с четными индексами");

        // находим элементы с четными индексами

        for (int i = 0; i < num.length; i++) {

            if (i % 2 != 0) {
                // if (i % 2 == 0) { //здесь изменение кода
                n++;
               continue;
            }
                mult = mult * num[i]; // произведение элементов

                System.out.print(num[i] + "|");
        }
        System.out.println();
        System.out.println("Всего элементов:" + n);
        System.out.println("Их произведение:" + mult);

    }
//__________ Methods _______

                public static void printArray ( int[] arr){
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " | ");
                    }
                    //______end of methods _____
                }
            }




