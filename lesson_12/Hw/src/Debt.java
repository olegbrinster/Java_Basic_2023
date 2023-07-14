import java.io.*;

public class Debt {

    public static void main(String[] args) {

            System.out.println("Businessman's debt");
            //Задача 3:
            //Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
            // Через сколько лет его долг превысит s тысяч рублей,
            // если за это время он не будет отдавать долг.


            double credit = 1000; //

            double finalAmount = 3000; // долг должен увеличиться до этого числа

            double percent = 0.1; // 10%
    int years = 0;
    do {

       // надо увеличивать кредит на 10% каждый год

       //  надо увеличивать год на 1

        // когда кредит превысит предельный долг, мы выйдем из цикла


         credit = credit + credit * percent; // увеличивается кредит
         years++; // увеличивается счетчик годов

        System.out.println(years + " " + credit);
    } while (credit <= finalAmount);

        System.out.println(years);
    }
    }




