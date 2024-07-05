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
    void isDividedOnByZeroTest() {
        assertThrows(ArithmeticException.class, () -> isDividedOn(1, 0));
    }
}
