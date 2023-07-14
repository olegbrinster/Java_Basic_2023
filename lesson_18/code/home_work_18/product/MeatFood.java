package home_work_18.product;

import java.util.Objects ;
public class MeatFood extends Food  {

    // поле класса
    private String meatType;

   // конструктор
    public MeatFood(double price, String name, long barCode, boolean isOutOfDate, String meatType) {
        super(price, name, barCode, isOutOfDate);
        this.meatType = meatType;
    }

    // метод выведения данных

    @Override
    public String toString() {
        return "MeatFood: " + super.getName() + "meatType= " + meatType;
    }

    // геттеры и сеттеры
    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
}
