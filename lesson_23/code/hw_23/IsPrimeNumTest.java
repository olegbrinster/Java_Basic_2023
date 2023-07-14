package hw_23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPrimeNumTest {

    IsPrimeNum isPrimeNum;  // это поле


    @BeforeEach
    void setUp() {
        isPrimeNum = new IsPrimeNum(); //это инициализация объекта, new - это вызов конструктора
    }

    @Test
    void isPrimeNumberTest1() {
        int n = 17;
        assertTrue(isPrimeNum.isPrimeNumber(n));

    }

    @Test
    void isPrimeNumberTest2() {
        int m = 22;
        assertFalse(isPrimeNum .isPrimeNumber(m)) ;

    }
}