
public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("String practice");
String st = "I like Java! Java is the best way to earn good salary in IT.";

    int l = st.length();


        System.out.println("Lengt of string is: " + l);

       char lastSymbol = st.charAt(st.length() - 1);
        System.out.println("LastSymbol is: " + lastSymbol);


    boolean yesOrNo = st.contains("Java");
        System.out.println(yesOrNo); //печатаем результат => true
   // заменить а на о

        String stNew = st.replace("a", "o");
        System.out.println(stNew);

        String stNew1 = st.toLowerCase();
        System.out.println(stNew1);

        String stNew2 = st.toLowerCase();
        System.out.println(stNew2);
// вырезать строку Java

        String stNew3 = st.substring(7, 11);
        System.out.println(stNew3);


        yesOrNo = st.endsWith("!!!");
        System.out.println(yesOrNo);

        String stNew4 = "I like Java!!!";


        yesOrNo = st.endsWith("!!!");
      ////  System.out.println(yesOrNo);


        }
    }


/*


public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("String practice");
String st = "I like Java! Java is the best way to earn good salary in IT.";

    int l = st.length();


        System.out.println("Lengt of string is: " + l);

        char lastSymbol = st.charAt(st.length() - 1);
        System.out.println("LastSymbol is: " + lastSymbol);


    boolean yesOrNo = st.contains("Java");
        System.out.println(yesOrNo); //печатаем результат => true


        }
    }


 */