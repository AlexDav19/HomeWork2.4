package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    public String getPlus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает значений для операции.";
        }
        double result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String getMinus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает значений для операции.";
        }
        double result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String getMultiply(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает значений для операции.";
        }
        double result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String getDivide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает значений для операции.";
        } else if (num2 == 0) {
            return "Нельзя делить на 0";
        }
        double result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;

    }
}
