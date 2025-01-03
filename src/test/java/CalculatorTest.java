import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        double result = Calculator.calculate(10, 5, "+");
        assertEquals(15, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        double result = Calculator.calculate(10, 5, "-");
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        double result = Calculator.calculate(10, 5, "*");
        assertEquals(50, result, 0.0001);
    }

    @Test
    public void testDivision() {
        double result = Calculator.calculate(10, 5, "/");
        assertEquals(2, result, 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.calculate(10, 0, "/");
        });
    }

    @Test
    public void testInvalidOperation() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculate(10, 5, "^");
        });
    }
}
