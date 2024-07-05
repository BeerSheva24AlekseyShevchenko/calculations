package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculationsTest {

    @ParameterizedTest
    @CsvSource({
        "-2, -3, -5",
        "0, 0, 0",
        "2, 3, 5",
    })
    void sumTest(int op1, int op2, int result) {
        assertEquals(result, sum(op1, op2));
    }

    @ParameterizedTest
    @CsvSource({
        "-2, -3, 1",
        "0, 0, 0",
        "3, 2, 1",
    })
    void subtractTest(int op1, int op2, int result) {
        assertEquals(result, subtract(op1, op2));
    }

    @ParameterizedTest
    @CsvSource({
        "-2, -3, 6",
        "0, 0, 0",
        "3, 2, 6",
    })
    void multiplyTest(int op1, int op2, int result) {
        assertEquals(result, multiply(op1, op2));
    }

    @ParameterizedTest
    @CsvSource({
        "-6, -2, 3",
        "0, 1, 0",
        "6, 2, 3",
    })
    void divideTest(int op1, int op2, int result) {
        assertEquals(result, divide(op1, op2));
    }

    @ParameterizedTest
    @CsvSource({
        "-123, 123",
        "0, 0",
        "123, 123",
    })
    void absTest(int op1, int result) {
        assertEquals(result, abs(op1));
    }

    @ParameterizedTest
    @CsvSource({
        "-123, 6",
        "000, 0",
        "123, 6",
    })
    void sumOfDigitsTest(int op1, int result) {
        assertEquals(result, sumOfDigits(op1));
    }

    @ParameterizedTest
    @CsvSource({
        "-123, 3",
        "000, 0",
        "123, 3",
    })
    void maxOfDigitsTest(int op1, int result) {
        assertEquals(result, maxOfDigits(op1));
    }

    @ParameterizedTest
    @CsvSource({
        "-6, 2, true",
        "0, 2, true",
        "6, 2, true",
        "-5, 2, false",
        "5, 2, false",
    })
    void isDividedOnTest(int op1, int op2, boolean result) {
        assertEquals(result, isDividedOn(op1, op2));
    }
}
