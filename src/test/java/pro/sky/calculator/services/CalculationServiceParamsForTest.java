package pro.sky.calculator.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculationServiceParamsForTest {
    CalculationService calculationService = new CalculationService();

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void getPlusTest(double num1, double num2) {
        String expected = num1 + " + " + num2 + " = " + (num1 + num2);
        String actual = calculationService.getPlus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void getMinusTest(double num1, double num2) {
        String expected = num1 + " - " + num2 + " = " + (num1 - num2);
        String actual = calculationService.getMinus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void getMultiplyTest(double num1, double num2) {
        String expected = num1 + " * " + num2 + " = " + (num1 * num2);
        String actual = calculationService.getMultiply(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void getDivideTest(double num1, double num2) {
        String expected = num1 + " / " + num2 + " = " + (num1 / num2);
        String actual = calculationService.getDivide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> paramsForTest() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(45, -45),
                Arguments.of(15, 5.2),
                Arguments.of(-2, 45)
        );
    }


}
