

public class Main {
    public static void main(String[] args) {

        System.out.println("String practike");

    String st = "I like Java! Java is the best way to earn good salary in IT.";
        System.out.println(st); // Печатаем строку

        // Распечатать последний символ строки. Используем Metod String.chart().

        int l = st.length(); // определяем длину строки
        System.out.println("Length of string is: " + l); // выводим длину строки на печвть

        //"I like Java! Java is the best way to earn good salary in IT."

       char lastSymbol = st.charAt(st.length() - 1); // так мы узнали последний символ
        System.out.println("Last symbol is: " + lastSymbol);

        // Найти позицию подстроки "Java" в строке "I like Java!".

        String st1 = "I like Java!"; // Задали строку
        int index = st1.indexOf("Java"); // узнаем с лалого индекса начинается слово Java
        System.out.println("Java starts from index " + index); // Печатаем результат

        int index1 = st1.indexOf("like");
        System.out.println("like starts from index " + index1);

        // Проверить, содержит ли заданная строка подстроку “Java”. Используем метод String.contains().
        boolean yesOrNo = st.contains("Java");
        System.out.println(yesOrNo); // печатаем результат => true

        // Заменить все символы “а” на “о”.
        String stNew = st.replace("a", "o"); // делаем замену в строке st всех букв "a" на букву "о"
        System.out.println(stNew); // заменяем и печатаем

        // Преобразуйте строку к верхнему и нижнему регистру.
        String stNew1 = st.toLowerCase(); // переводим строку в нижний регистр
        System.out.println(stNew1); // печатаем результат

        String stNew2 = st.toUpperCase(); // переводим строку в верхний регистр
        System.out.println(stNew2); // печатаем результат

        // Вырезать строку Java c помощью метода String.substring().
        String stNew3 = st.substring(7, 11); // вырезаем
        System.out.println(stNew3); // печатаем

        // Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith(),
        //   привыкаем к типу boolean.
        String stNew4 ="I like Java!!!";
        yesOrNo = stNew4.endsWith("!!!"); // выясняем
        System.out.println(yesOrNo);

        }
    }


    /*


public class Main {
    public static void main(String[] args) {

        System.out.printf("Type char - practike");


        char ch = 65;
        System.out.println("Symbol with number 65: " + ch); // это А

        char ch1 = 90;
        System.out.println("Symbol with number 90: " + ch1); // это Z

        char ch3 = 176;
        System.out.println("Temperature 23" + ch3); // grad

        char ch4 = 178;
        System.out.println("2x" + ch);


     */