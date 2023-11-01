package task.four;

import java.util.Scanner;

public class CalculatorOop {
    private double firstNumber;
    private double secondNumber;

    public CalculatorOop(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add() {
        return firstNumber + secondNumber;
    }

    public double subtract() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double divide() {
        return firstNumber / firstNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        String operation = scanner.next();
        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        CalculatorOop calculator = new CalculatorOop(firstNumber, secondNumber);

        double result;

        switch (operation) {
            case "+":
                result = calculator.add();
                break;
            case "-":
                result = calculator.subtract();
                break;
            case "*":
                result = calculator.multiply();
                break;
            case "/":
                    result = calculator.divide();
                break;
            default:
                System.out.println("Выбрана некорректная операция");
                return;
        }

        System.out.println("Результат: " + result);
    }
}