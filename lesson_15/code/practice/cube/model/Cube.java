
package practice.cube.model;


    // Задача 1.
    // Создать класс Cube, описывающий куб cо стороной a.
    // Реализовать в нем методы определения периметра p, площади s и объема v.
    // Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
    // Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

    // Шаг 1 - определяем поля класса
        public class Cube {
        // Ребро
        public double a;
        // Шаг 2 -определяем методы
        // Конструктор класса Cube
        public Cube(double a) {
            this.a = a;
        }
        // методы установки значений полей класса
        public void setA(double a) {
            this.a = a;
        }
        // метод для вычисления периметра
        public double perimeter(double a) {
            return 12 * a;
        }
        //метод для вычисления площади
        public double square(double a) {
            return 6 * a * a;
        }
            // метод для вычисления объема
            public double volume(double a) {
                return a * a * a;
            }
        }




