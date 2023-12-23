import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlgoUtilsTests {
    // Позитивний тест для методу findMinPositive
    @Test
    public void testFindMinPositive() {
        int[] positiveArray = {5, 3, 8, 1, 7};
        assertEquals(1, AlgoUtils.findMinPositive(positiveArray));
    }

    // Негативний тест для методу findMinPositive
    @Test
    public void testFindMinPositiveWithNoPositiveNumbers() {
        int[] negativeArray = {-2, -7, -4, -1, -5};
        assertEquals(Integer.MAX_VALUE, AlgoUtils.findMinPositive(negativeArray));
    }

    // Позитивний тест для методу calculateSumOfNegatives
    @Test
    public void testCalculateSumOfNegatives() {
        int[] negativeArray = {-2, -7, -4, -1, -5};
        assertEquals(-19, AlgoUtils.calculateSumOfNegatives(negativeArray));
    }

    // Негативний тест для методу calculateSumOfNegatives
    @Test
    public void testCalculateSumOfNegativesWithNoNegativeNumbers() {
        int[] positiveArray = {5, 3, 8, 1, 7};
        assertEquals(0, AlgoUtils.calculateSumOfNegatives(positiveArray));
    }

    // Позитивний тест для методу fibonacci
    @Test
    public void testFibonacci() {
        int n = 6;
        assertEquals(8, AlgoUtils.fibonacci(n));
    }

    // Негативний тест для методу fibonacci
    @Test
    public void testFibonacciWithNegativeInput() {
        int n = -3;
        assertEquals(-3, AlgoUtils.fibonacci(n));
    }

    // Позитивний тест для методу calculateCurrent
    @Test
    public void testCalculateCurrent() {
        double voltage = 12.0;
        double resistance = 4.0;
        assertEquals(3.0, AlgoUtils.calculateCurrent(voltage, resistance));
    }

    // Негативний тест для методу calculateCurrent з нульовим опором
    @Test
    public void testCalculateCurrentWithZeroResistance() {
        double voltage = 12.0;
        double resistance = 0.0;
        assertThrows(ArithmeticException.class, () -> {
            AlgoUtils.calculateCurrent(voltage, resistance);
        });
    }
}
