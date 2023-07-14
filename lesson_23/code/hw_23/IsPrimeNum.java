package hw_23;
import java.util.Scanner;
public class IsPrimeNum {

        // ______________Methods_______________
        public static boolean isPrimeNumber(int n) {
            boolean isPrime = true;
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) { // если хотя бы раз разделилось, то
                    isPrime = false;// объявим, что число НЕпростое и можно выйти из цикла
                }
            }
            return isPrime;
        }
    }




