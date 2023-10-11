/**
 * @autor Gubskiy A.V.
 * @location Saint-Petersburg
 */

package task.one;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Какую операцию выполнить: 1. + 2. - 3. * 4. / ");
        int operation = scanner.nextInt();

        if (operation == 1){
            System.out.printf("%.2f" ,firstNumber + secondNumber);
        }
        else if (operation == 2){
            System.out.printf("%.2f" ,firstNumber - secondNumber);
        }
        else if (operation == 3){
            System.out.printf("%.2f" ,firstNumber * secondNumber);
        }
        else if (operation == 4){
            System.out.printf("%.2f" ,firstNumber / secondNumber);
        }
        else {
            System.out.println("Выбрана некорректная операция");
        }
    }
}
