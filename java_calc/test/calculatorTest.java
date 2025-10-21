import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        calculator calc= new calculator();
        calc.setNumbers(10,20);
        assertEquals(30,calc.add());
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        calculator calc= new calculator();
        calc.setNumbers(40,5);
        assertEquals(35,calc.subtract());
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        calculator calc= new calculator();
        calc.setNumbers(3,2);
        assertEquals(6,calc.multiply());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        calculator calc= new calculator();
        calc.setNumbers(48,6);
        assertEquals(8,calc.divide());
    }

    @org.junit.jupiter.api.Test
    void square() {
        calculator calc= new calculator();
        calc.setNumbers(3,3);
        assertEquals(27,calc.square());
    }
}