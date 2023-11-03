package task.four;

public class CalculatorOop {
    private double firstNumber;
    private double secondNumber;
    private String operation;

    public CalculatorOop() {
    }

    public void setNumbers(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double calculate() {
        switch (operation) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            default:
                System.out.println("Некорректная операция");
                return 0;
        }
    }
}