package five;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCountCollection {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/java/five/words.txt";

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        List<String> wordsList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            wordsList.addAll(Arrays.asList(words));
        }
        reader.close();

        // сортируем
        Collections.sort(wordsList);

        Map<String, Integer> wordCountMap = new LinkedHashMap<>();
        for (String word : wordsList) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // вывод статистики
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз");
        }

        // поиск слова с макс количеством повторений
        int maxCount = 0;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        // вывод слова с макс количеством повторений
        System.out.println("Слово с максимальным количеством повторений: " + maxWord);
        System.out.println("Количество повторений: " + maxCount);
    }
}


