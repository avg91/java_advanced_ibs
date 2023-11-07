package task.seven.tests;

import org.junit.jupiter.api.Test;
import task.six.CalculatorOop;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorOopTests {

    @Test
    public void testAddition() {
        CalculatorOop calculator = new CalculatorOop();
        calculator.setNumbers(5, 3);
        calculator.setOperation("+");
        double result = calculator.calculate();
        assertEquals(8, result, 0.001); // проверяем, что результат сложения верен
    }

    @Test
    public void testSubtraction() {
        CalculatorOop calculator = new CalculatorOop();
        calculator.setNumbers(8, 3);
        calculator.setOperation("-");
        double result = calculator.calculate();
        assertEquals(5, result, 0.001); // проверяем, что результат вычитания верен
    }

    @Test
    public void testMultiplication() {
        CalculatorOop calculator = new CalculatorOop();
        calculator.setNumbers(4, 2);
        calculator.setOperation("*");
        double result = calculator.calculate();
        assertEquals(8, result, 0.001); // проверяем, что результат умножения верен
    }

    @Test
    public void testDivision() {
        CalculatorOop calculator = new CalculatorOop();
        calculator.setNumbers(6, 2);
        calculator.setOperation("/");
        double result = calculator.calculate();
        assertEquals(3, result, 0.001); // проверяем, что результат деления верен
    }

    @Test
    public void testDivisionByZero() {
        CalculatorOop calculator = new CalculatorOop();
        calculator.setNumbers(6, 0);
        calculator.setOperation("/");
        double result = calculator.calculate();
        assertEquals(0, result, 0.001); // проверяем, что при делении на ноль возвращается 0 и выброс исключения
    }

    @Test
    public void testInvalidOperation() {
        CalculatorOop calculator = new CalculatorOop();
        calculator.setNumbers(6, 3);
        calculator.setOperation("invalid");
        double result = calculator.calculate();
        assertEquals(0, result, 0.001); // проверяем, что при некорректной операции возвращается 0 и выброс исключения
    }
}