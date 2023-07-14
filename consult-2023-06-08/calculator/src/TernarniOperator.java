public class TernarniOperator {
    public static void main(String[] args) {
        System.out.println("Ternarni operator");

        // Провека на положительное или отрицательнон

        int number1 = -11;
        int number2 = 128;
        int number3 = 129;
        String s = null;

        s = (number1 > 0) ? "число положительное" : "число отрицательное";

        System.out.println(s);

//  Провека на делимость на 3, 5, 7,

      s = ( number1 % 3 == 0) ? "делится на 3" : " не делится на 3";
        System.out.println(s);

        s = ( number2 % 3 == 0) ? "делится на 3" : " не делится на 3";
        System.out.println(s);

        s = ( number3 % 3 == 0) ? "делится на 3" : " не делится на 3";
        System.out.println(s);
    }
}
