package pro.sky.calculator.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exceptions.DivisionByZeroException;

public class CalculationServiceTest {

    private double num1;
    private double num2;
    CalculationService calculationService = new CalculationService();

    @Test
    public void getPlusTest1() {
        num1 = 5;
        num2 = 5;
        String expected = "5.0 + 5.0 = 10.0";
        //String expected = num1 + " + " + num2 + "=" + (num1 + num2);
        String actual = calculationService.getPlus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPlusTest2() {
        num1 = -23;
        num2 = 103.2;
        String expected = "-23.0 + 103.2 = 80.2";
        String actual = calculationService.getPlus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinusTest1() {
        num1 = 5;
        num2 = 5;
        String expected = "5.0 - 5.0 = 0.0";
        String actual = calculationService.getMinus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinusTest2() {
        num1 = -23;
        num2 = 103.2;
        String expected = "-23.0 - 103.2 = -126.2";
        String actual = calculationService.getMinus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMultiplyTest1() {
        num1 = 5;
        num2 = 5;
        String expected = "5.0 * 5.0 = 25.0";
        String actual = calculationService.getMultiply(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMultiplyTest2() {
        num1 = -23;
        num2 = 103.2;
        String expected = "-23.0 * 103.2 = -2373.6";
        String actual = calculationService.getMultiply(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDivideTest1() {
        num1 = 5;
        num2 = 5;
        String expected = "5.0 / 5.0 = 1.0";
        String actual = calculationService.getDivide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDivideTest2() {
        num1 = -88;
        num2 = 35.2;
        String expected = "-88.0 / 35.2 = -2.5";
        String actual = calculationService.getDivide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDivisionByZeroException() {
        num1 = 5;
        num2 = 0;
        Assertions.assertThrows(DivisionByZeroException.class, () -> calculationService.getDivide(num1, num2));
    }
}
