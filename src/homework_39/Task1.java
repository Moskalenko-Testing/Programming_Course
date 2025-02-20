package homework_39;

import java.util.HashMap;
import java.util.Map;

/*
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */
public class Task1 {
    public static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> wordCount = new HashMap<>();

        if (text == null || text.isEmpty()) {
            return wordCount;
        }

        String[] words = text.toLowerCase().split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

            }
        }

        return wordCount;
    }
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";
        Map<String, Integer> frequency = getWordFrequency(text);
        System.out.println("Частотный словарь: " + frequency);
    }

}
