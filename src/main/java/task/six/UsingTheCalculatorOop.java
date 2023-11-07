package task.six;

public class UsingTheCalculatorOop {
    public static void main(String[] args) {
        CalculatorOop calculator = new CalculatorOop();

        // ставим числа и операцию
        calculator.setNumbers(10.0, 0.0);
        calculator.setOperation("/");

        double result = calculator.calculate();

        System.out.println("Результат: " + result);
    }
}
