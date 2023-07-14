public class Main {
    public static void main(String[] args) {

            System.out.println("String home work");

            String st = "I'm proud to learn Java! Java is the most famous programming language!!!";
            System.out.println(st); // Печатаем строку

            // Распечатать последний символ строки. Используем Method String.chart().

            int l = st.length(); // определяем длину строки
            System.out.println("Length of string is: " + l); // выводим длину строки на печвть

            char lastSymbol = st.charAt(st.length() - 1); // так мы узнали последний символ
            System.out.println("Last symbol is: " + lastSymbol);

            // Найти позицию подстроки "Java" в строке "I'm proud to learn Java!".

            String st1 = "I'm proud to learn Java!"; // Задали строку
            int index = st1.indexOf("Java"); // узнаем с какого индекса начинается слово Java
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
            String stNew4 ="I'm proud to learn Java!";
            yesOrNo = stNew4.endsWith("!!!"); // выясняем
            System.out.println(yesOrNo);

            // Проверить, начинается ли ваша строка подстрокой “I'm proud”. Используем метод String.startsWith(),
            String stNew5 ="I'm proud to learn Java!";
            yesOrNo = stNew5.startsWith("I'm proud"); // выясняем
            System.out.println(yesOrNo);


        }
    }
/*
public class Main {
    public static void main(String[] args) {

            System.out.println("String home work");

            String st = "I'm proud to learn Java! Java is the most famous programming language!!!";
            System.out.println(st); // Печатаем строку

            // Распечатать последний символ строки. Используем Method String.chart().

            int l = st.length(); // определяем длину строки
            System.out.println("Length of string is: " + l); // выводим длину строки на печвть

            char lastSymbol = st.charAt(st.length() - 1); // так мы узнали последний символ
            System.out.println("Last symbol is: " + lastSymbol);

            // Найти позицию подстроки "Java" в строке "I'm proud to learn Java!".

            String st1 = "I'm proud to learn Java!"; // Задали строку
            int index = st1.indexOf("Java"); // узнаем с какого индекса начинается слово Java
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
            String stNew4 ="I'm proud to learn Java!";
            yesOrNo = stNew4.endsWith("!!!"); // выясняем
            System.out.println(yesOrNo);

            // Проверить, начинается ли ваша строка подстрокой “I'm proud”. Используем метод String.startsWith(),
            String stNew5 ="I'm proud to learn Java!";
            yesOrNo = stNew5.startsWith("I'm proud"); // выясняем
            System.out.println(yesOrNo);


        }
    }
 */