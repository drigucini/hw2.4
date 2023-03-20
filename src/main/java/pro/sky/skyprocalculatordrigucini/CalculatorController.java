package pro.sky.skyprocalculatordrigucini;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("/")
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/calculator")
    public String welcomeCalculator() {
        return calculatorService.welcomeCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam() int num1, int num2) {
        return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam() int num1, int num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam() int num1, int num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String calculatorDivide (@RequestParam() int num1, int num2) {
        return calculatorService.calculatorDivide(num1, num2);
    }
}
