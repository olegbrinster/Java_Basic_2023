public class Main {

    public static void main(String args[]) {
        System.out.println("Home Work");
        //Даны строки разной длины (длина - четное число),
        // необходимо вернуть два средних знака этой строки.
        // Например, если дана строка "string" результат будет "ri",
        // для строки "code" результат "od",
        //для "Practice" результат "ct".

        String str= new String("string");
        System.out.print("вывести: ");
        System.out.println(str.substring(2,4));

        String str1= new String("code");
        System.out.print("вывести: ");
        System.out.println(str1.substring(1,3));

        String str2= new String("practice");
        System.out.print("вывести: ");
        System.out.println(str2.substring(3,5));
    }
}



