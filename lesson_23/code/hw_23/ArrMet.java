package hw_23;
import java.util.* ;
public class ArrMet {


    public static  void printArray(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] +", ");
        }
    }

    // число нулей в массиве
    public int zeroCount (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    // количество положительных чисел
    public int positiveCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    // кол-во отрицательных чисел

    public int negativeCount(int [] arr) {
        int count = 0;
        for (int i = 0; i < arr .length ; i++) {
            if (arr [i] < 0){
                count ++;
              //  System.out.println("Negativ: " + count );
            }
        }
        return count ;
    }

    // кол-во четных чисел
    public int evenCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
           // System.out.println("Even: " + count );
            }
        }
        return count;
             }
        }









