package pro.sky.skyprocalculatordrigucini;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceIml implements CalculatorService {

    public String welcomeCalculator() {
        return "Welcome to the <b>calculator</b>";
    }


    public String calculatorPlus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please input two parameters";
        }
        Integer result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String calculatorMinus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please input two parameters";
        }
        Integer result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String calculatorMultiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please input two parameters";
        }

        Integer result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String calculatorDivide (Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please input two parameters";
        }
        if (num2 == 0) {
            return "Dividing by 0 is prohibited";
        }
        Integer result = num1 / num2;
        return num1 + "/" + num2 + " = " + result;
    }

}
