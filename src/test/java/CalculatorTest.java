import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(7, calculator.add(3, 4) );
    }
    @Test
    public void canSubtract() {
        assertEquals(1, calculator.subtract(2, 1) );
    }

    @Test
    public void canMultiply() {
        assertEquals(2, calculator.multiply(1, 2));
    }

    @Test
    public void canDivide() {
        assertEquals(2, calculator.divide(4, 2));
    }
}
