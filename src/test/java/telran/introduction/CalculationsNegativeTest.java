package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsNegativeTest {

    @Test
    void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> divide(1, 0));
    }

    @Test
    void sumIntOverLimitTest() {
        assertThrows(ArithmeticException.class, () -> sum(Integer.MAX_VALUE, 1));
    }

    @Test
    void subtractIntOverLimitTest() {
        assertThrows(ArithmeticException.class, () -> subtract(Integer.MIN_VALUE, 1));
    }

    @Test
    void multiplyIntOverLimitTest() {
        assertThrows(ArithmeticException.class, () -> multiply(Integer.MAX_VALUE, 2));
    }
}
