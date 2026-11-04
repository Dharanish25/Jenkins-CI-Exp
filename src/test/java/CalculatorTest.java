import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(30, calc.add(10, 20));
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.multiply(5, 4));
    }
}