package hw_24;

// Equation roots

class Roots {
    public Double  x1;
    public Double  x2;
}
   //класс, который решает квадратное уравнение
   // a*x^2 + b*x + c = 0

public class SquareEquation {

    // Коэффициенты уравнения
    public Double  a, b, c;

    // Конструктор

    public SquareEquation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Метод, решающий квадратное уравнение
    public Roots Solution() {

        // Дискриминант

        Double d = b*b - 4*a*c;

        // Проверка, имеет ли уравнение корни
        if (d<0)
            throw new ArithmeticException("Solution has no roots.");

        // Вычислить результат
        Roots result = new Roots();
        result.x1 = (-b - Math.sqrt(d)) / (2*a);
        result.x2 = (-b + Math.sqrt(d)) / (2*a);

        // Вернуть результат

        return result;
    }
}


