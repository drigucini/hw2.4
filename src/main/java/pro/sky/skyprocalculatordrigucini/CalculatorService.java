package pro.sky.skyprocalculatordrigucini;

public interface CalculatorService {
    String welcome();

    String welcomeCalculator();

    String calculatorPlus(int num1, int num2);

    String calculatorMinus(int num1, int num2);

    String calculatorMultiply(int num1, int num2);

    String calculatorDivide(int num1, int num2);
}