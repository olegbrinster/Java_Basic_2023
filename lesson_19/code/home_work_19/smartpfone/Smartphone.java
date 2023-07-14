package smartpfone;

import java.util.Objects ;
public class Smartphone {

             //поля объекта класса

            public  double price;
            public  String color;
            public  int storage;
            public  int battery;

            // Конструктор класса


    public Smartphone(double price, String color, int storage, int battery) {
        this.price = price;
        this.color = color;
        this.storage = storage;
        this.battery = battery;
    }
    public void display() {
        System.out.println("Price: " + price + ", Color: " + color + ", Storage: " + storage + ", Battery: " + battery );
        System.out.println();
    }



    //геттеры и сеттеры


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}

