import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ScientificCalculatorTest {
    ScientificCalculator ScientificCalculator;

    @BeforeEach
    void setUp() {
        ScientificCalculator = new ScientificCalculator();
        ScientificCalculator.setNumbers(2,3);
    }

    @Test
    void square() {
        assertEquals(8, ScientificCalculator.square());
    }
}