package hw_23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrMetTest {

    ArrMet arrMet ;

    @BeforeEach
    void setUp() {
        arrMet = new ArrMet() ;
    }

    @Test
    void zeroCountTest() {
        int [] num = {1, 0, -3, 4, 5};
        assertEquals(1, arrMet.zeroCount(num) ) ;
    }

    @Test
    void positiveCountTest() {
        int [] num = {1, 0, -3, 4, 5};
        assertEquals(3, arrMet.positiveCount(num) ) ;
    }

    @Test
    void negativeCountTest() {
        int [] num = {1, 0, -3, 4, 5};
        assertEquals(1, arrMet .negativeCount(num ) ) ;
    }

    @Test
    void evenCountTest() {
        int [] num = {1, 0, -3, 4, 5};
        assertEquals(2, arrMet .evenCount(num ) ) ;
    }
}