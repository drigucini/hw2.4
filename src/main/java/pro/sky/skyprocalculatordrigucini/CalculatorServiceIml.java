package pro.sky.skyprocalculatordrigucini;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceIml implements CalculatorService {

    public String welcome() {
        return "Welcome";
    }

    public String welcomeCalculator() {
        return "Welcome to the <b>calculator</b>";
    }


    public String calculatorPlus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String calculatorMinus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String calculatorMultiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String calculatorDivide (int num1, int num2) {
        int result = num1 / num2;
        return num1 + "/" + num2 + " = " + result;
    }

}
