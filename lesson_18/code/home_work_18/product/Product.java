package home_work_18.product;

import java.util.Objects;
public class Product {


    //Задача 1.
    // Создать класс Product, с полями
    //private double price; private String name; private long barCode;
    //
    //Создать класс Food расширяющий класс Product с полем private boolean isOutOfDate;,
    // которое отвечает за годность продукта.
    //
     //Создать класс MeatFood расширяющий класс Food с полем private String meatType;,
    // которое хранит тип мяса, из которого изготовлен продукт.
    //
     //Создать класс MilkFood расширяющий класс Food с полями private String milkType; private double fat;,
      // которые хранят тип молока и жирность продукта соответственно.
    //
    //Во всех классах переопределить метод toString.
    //
     //В классе ProductsAppl создать в методе main создать массив, в котором хранятся как минимум по одному объекту для каждого продукта.
    // Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов в магазине.
    //
    //Задача 2.
    // Переопределить метод equals для сравнения объектов класса Product.
    // В классе ProductsAppl создать метод печатающий в консоль все негодные в пищу продукты.
    // В методе main вызвать новые методы. Результат их работы напечатать в консоль.


    // поля класса

    private double price;
    private String name;
    private long barCode;

    // конструктор

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    // геттеры и сеттеры

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return ("Price: " + price + ", Name: " + name + ", Bar Code: " + barCode) ;
    }


    // метод для сравнения объектов

    @Override
    public boolean equals(Object obj) {  // сигнатура метода : модификатор, ТИП возвращаемого методом значения, имя метода
        // тип переменной и ее имя, которое принимает метод

        if (this == obj) return true; // если мы сравниваем объект сам с собой, возвращаем true

        if (obj == null || getClass() != obj.getClass()) return false; // если сравниваем с null или объекты из разных классов

        Product produkt = (Product) obj ; // производим downcasting предложенного для сравнения объекта до класса Computer

        return (barCode == produkt.barCode); // логическое выражение упростили так как barcode отвечает за уникальность типа продукта
    }

    @Override
    public int hashCode() {

        return Objects.hash(price, name, barCode);
    }
}
