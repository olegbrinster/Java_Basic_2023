package home_work_18.product;

import java.util.Objects ;

public class MilkFood extends Food {

    // поля класса

    private String milkType;
    private double fat;

    // конструктор

    public MilkFood(double price, String name, long barCode, boolean isOutOfDate, String milkType, double fat) {
        super(price, name, barCode, isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    // перегрузили родительский код

    @Override
    public String toString() {
        return "MilkFood: " + super.getName() + "milkType= " + milkType +  ", fat=" + fat ;
    }

    // геттеры и сеттеры
    public String getMilkType() {
        return milkType;
    }
    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }
    public double getFat() {
        return fat;
    }
    public void setFat(double fat) {
        this.fat = fat;
    }
}
