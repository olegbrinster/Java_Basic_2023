package home_work_18.product;
import java.util.Objects;

public class ProductAppl {

    public static void main(String[] args) {

        Product prod1 = new Product(2.50, "Brot ", 10000001L);
        Food prod2 = new Food(2.35, "Käse Tilsit", 10000001L, true ) ;
        Food prod3 = new Food(1.55, "Kefir ", 10000003L, false ) ;
        MeatFood  prod4 = new MeatFood(12.00, "Wild Fleisch ", 10000003L,true ,"Rehe") ;
        MilkFood  prod5 = new MilkFood(9.50, "Kavkas ", 10000005L, false ,"Kefir",2.5) ;

        Product[] arrayOfProduct = new Product[5];
        arrayOfProduct[0] = prod1;
        arrayOfProduct[1] = prod2;
        arrayOfProduct[2] = prod3;
        arrayOfProduct[3] = prod4;
        arrayOfProduct[4] = prod5;

        printArrayProduct(arrayOfProduct); //печатаем массив объектов

        System.out.println("Sum of prices: " + sumProd(arrayOfProduct));

        System.out.println("Сравниваем продукты по баркодам: " + prod1.equals(prod2));
        System.out.println("Сравниваем продукты по баркодам: " + prod3.equals(prod5));


        // вычисляем сумму цен всех продуктов в магазине
    }
    public static void printArrayProduct (Object[] arr) {
        for (int i = 0; i < arr.length ; i++) {

            System.out.println(arr[i].toString() );

        }
    }
    public static double sumProd (Product[] arr) {

        double sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i].getPrice();
        }
        return sum ;
    }
}
