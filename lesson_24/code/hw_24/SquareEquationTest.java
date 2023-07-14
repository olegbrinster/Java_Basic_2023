package hw_24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareEquationTest {

    SquareEquation squareEquation ;

    @BeforeEach
    void setUp() throws Exception  {

// Этот метод вызывается первым.
        // Создать экземпляр класса SquareEquation
        squareEquation  = new SquareEquation(2.0, 1.0, -3.0);      // 2*x^2 + x - 3 = 0

    }

    @Test
    void testSolution() {

       // fail("Not yet implemented") ;

        // Объявить экземпляр класса Roots
        Roots rt = squareEquation .Solution();

        // Проверка решения x1
        assertEquals(rt.x1, -1.5) ;

        // Проверка решения x2
        assertEquals(rt.x2, 1);


    }
}