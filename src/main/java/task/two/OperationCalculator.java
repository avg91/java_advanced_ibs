/**
 * Операции калькулятора уже были реализованы в 1 задании
 * */

package task.two;

import java.util.Scanner;

public class OperationCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию:");
        System.out.println("1. Калькулятор");
        System.out.println("2. Поиск максимального слова в массиве");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // калькулятор
            System.out.println("Введите первое число: ");
            double firstNumber = scanner.nextDouble();
            System.out.println("Введите второе число: ");
            double secondNumber = scanner.nextDouble();
            System.out.println("Какую операцию выполнить: 1. + 2. - 3. * 4. / ");
            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.printf("%.4f", firstNumber + secondNumber);
            } else if (operation == 2) {
                System.out.printf("%.4f", firstNumber - secondNumber);
            } else if (operation == 3) {
                System.out.printf("%.4f", firstNumber * secondNumber);
            } else if (operation == 4) {
                System.out.printf("%.4f", firstNumber / secondNumber);
            } else {
                System.out.println("Выбрана некорректная операция");
            }
        } else if (choice == 2) {
            // поиск максимального слова в массиве
            System.out.println("Введите размерность массива: ");
            int arraySize = scanner.nextInt();
            String[] words = new String[arraySize];

            for (int i = 0; i < arraySize; i++) {
                System.out.println("Введите слово " + (i + 1) + ": ");
                words[i] = scanner.next();
            }

            String longestWord = findLongestWord(words);
            System.out.println("Самое длинное слово: " + longestWord);
        } else {
            System.out.println("Выбрана некорректная операция, выберите между 1 и 2");
        }
    }

    public static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}