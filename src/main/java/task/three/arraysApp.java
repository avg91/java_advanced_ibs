package task.three;

import java.util.Random;
import java.util.Arrays;

public class arraysApp {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();

        // заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21) - 10;
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int maxNegativeIndex = -1;
        int minPositiveIndex = -1;

        // находим максимальный отрицательный и минимальный положительный элементы и их индексы
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] > maxNegative) {
                maxNegative = arr[i];
                maxNegativeIndex = i;
            } else if (arr[i] > 0 && arr[i] < minPositive) {
                minPositive = arr[i];
                minPositiveIndex = i;
            }
        }
        // переставляем местами максимальный отрицательный и минимальный положительный элементы
        if (maxNegativeIndex != -1 && minPositiveIndex != -1) {
            int temp = arr[maxNegativeIndex];
            arr[maxNegativeIndex] = arr[minPositiveIndex];
            arr[minPositiveIndex] = temp;
        }
        System.out.println("Измененный массив: " + Arrays.toString(arr));
    }
}