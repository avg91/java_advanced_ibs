package task.six;

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
    // добавил исключения при делении на 0 и если выбрана вместо операции ввели что-то другое
    public double calculate() {
        try {
            switch (operation) {
                case "+":
                    return firstNumber + secondNumber;
                case "-":
                    return firstNumber - secondNumber;
                case "*":
                    return firstNumber * secondNumber;
                case "/":
                    if (secondNumber == 0) {
                        throw new ArithmeticException("Деление на ноль");
                    }
                    return firstNumber / secondNumber;
                default:
                    throw new IllegalArgumentException("Некорректная операция");
            }
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e);
            return 0;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: "  + e);
            return 0;
        }
    }
}