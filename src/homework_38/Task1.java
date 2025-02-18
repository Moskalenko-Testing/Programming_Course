package homework_38;

import org.junit.platform.commons.util.StringUtils;

import java.util.*;

public class Task1 {
    public static List<String> getSortedUniqueWords(String input) {
    if (input == null || input.isEmpty()) {
        return Collections.emptyList();
    }

    Set<String> wordsSet = new HashSet<>(Arrays.asList(input.split("\\s+")));
    List<String> wordsList = new ArrayList<>(wordsSet);

        wordsList.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        return wordsList;
}
    public static void main(String[] args) {
        String text = "Тестовая строка для удаления слов, которые повторяются.";
        List<String> result = getSortedUniqueWords(text);
        System.out.println(result);
    }
}
