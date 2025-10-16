import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Advenced_CalculatorTest {
    Advenced_Calculator AdvencedCalc;

    @BeforeEach
    void setUp() {
        AdvencedCalc = new Advenced_Calculator();
        AdvencedCalc.setNumbers(9,3);
    }

    @Test
    void multiply() {
        assertEquals(27,AdvencedCalc.multiply());
    }

    @Test
    void divide() {
        assertEquals(3,AdvencedCalc.divide());
    }
}