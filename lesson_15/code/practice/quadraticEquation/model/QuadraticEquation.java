

package practice.quadraticEquation.model;

               // Задача 3.
               // ()* Создать класс, описывающий квадратные уравнения с коэффициетами a, b и c.
                // Реализовать в нем методы:
               //  вычисления дискриминанта b*b - 4 * a *c
              //  определения количества корней в зависимости от значения дискриминанта
              // (d>0 - два корня, d=0 - один корень, d<0 - корней нет)
              // Вызвать методы из приложения QuadraticEquationAppl
public class QuadraticEquation {

                   // Шаг 1 - определяем поля класса

                   // значение а
                   public double a;
                   // значение b
                   public double b;
                   // значение c
                   public double c;


                   // Шаг 2 -определяем методы

                   // Конструктор класса QuadraticEquation

                   public QuadraticEquation(double a, double b, double c) {
                       this.a = a ;
                       this.b = b ;
                       this.c = c ;
                   }


                   // методы установки значений полей класса

                   public double getA() {

                       return a;
                   }

                   public void setA(double a) {

                       this.a = a;
                   }

                   public double getB() {

                       return b;
                   }

                   public void setB(double b) {

                       this.b = b;
                   }

                   public double getC() {

                       return c;
                   }

                   public void setC(double c) {

                       this.c = c;
                   }

                   // метод для вычисления дискриминанта

                   public double discr(double a, double b, double c) {  // discr - discriminant
                       return b * b - 4 * a * c;
                   }
                       //методы для вычисления x1, x2, x

                      public double x1 (double a, double b, double discr){
                          return ((-1) * b + Math.sqrt(discr)) / (2 * a);
                       }
                       public double x2 ( double a, double b, double discr){
                       return ((-1) * b - Math.sqrt(discr)) / (2 * a);
                       }
                       public double x ( double a, double b) {
                       return (-1) * b / (2 * a);
                       }
                   }






