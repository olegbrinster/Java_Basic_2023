package home_work_18.product;

public class Food extends Product {

    // поле класса
    private boolean isOutOfDate;

    // перегрузили родительский код

    public Food(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode);
        this.isOutOfDate = isOutOfDate;
    }

    // метод выведения данных

    @Override
    public String toString() {
        System.out.println(super.toString());

        return "Food: " + super.getName() + "is Out Of Date= " + isOutOfDate;
    }


    // геттеры и сеттеры


    public boolean isOutOfDate() {
        return isOutOfDate;
    }

    public void setOutOfDate(boolean outOfDate) {
        isOutOfDate = outOfDate;
    }

}
