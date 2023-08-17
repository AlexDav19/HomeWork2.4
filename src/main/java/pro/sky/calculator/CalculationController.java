package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //класс с вычислительными методами
@RequestMapping(path = "/calculator")
public class CalculationController {
    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping(path = "/plus") //сложение
    public String getPlus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculationService.getPlus(num1, num2);
    }

    @GetMapping(path = "/minus") //вычитание
    public String getMinus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculationService.getMinus(num1, num2);
    }

    @GetMapping(path = "/multiply") //умножение
    public String getMultiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculationService.getMultiply(num1, num2);
    }

    @GetMapping(path = "/divide") //деление
    public String getDivide(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        return calculationService.getDivide(num1, num2);
    }

}
