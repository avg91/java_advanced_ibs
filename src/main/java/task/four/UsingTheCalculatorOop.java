/**
 * класс для использования CalculatorOop из вне
 * */

package task.four;

public class UsingTheCalculatorOop {
    public static void main(String[] args) {
        CalculatorOop calculator = new CalculatorOop();

        // ставим числа и операцию
        calculator.setNumbers(10.0, 5.0);
        calculator.setOperation("/");

        double result = calculator.calculate();

        System.out.println("Результат: " + result);
    }
}
