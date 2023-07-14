package practice.quadraticEquation.controller;

import practice.quadraticEquation.model.QuadraticEquation;

public class QuadraticEquationAppl {

    public static void main(String[] args) {

        QuadraticEquation quadEquat1 = new QuadraticEquation(2, -5, 2); // создаем объект типа QuadEquat

        double a = quadEquat1.a;
        double b = quadEquat1.b;
        double c = quadEquat1.c;


        System.out.println("Дискриминант = " + quadEquat1.discr(a, b, c));
        double d = quadEquat1 .discr(a, b, c);
        // {
        if (d  > 0) {
            double x1, x2;
            System.out.println(" X1 = " + quadEquat1.x1(a, b, d));
            System.out.println(" X2 = " + quadEquat1.x2(a, b, d));

        } else if (quadEquat1.discr(a,b,d) == 0) {
            double x;

            System.out.println(" X = " + quadEquat1.x(a,b));
        } else {
            System.out.println("Уравнение не имеет действительных корней !");
        }
        System.out.println();
        System.out.println();
    }
}

