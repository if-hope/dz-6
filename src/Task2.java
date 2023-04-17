import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    public static void print(String text) {

        char[] arr = text.toCharArray();

        Map<Character, Integer> unique = new LinkedHashMap<>();
        for (Character letter : arr) {
            if (unique.containsKey(letter)) {
                Integer valueOfElement = unique.get(letter) + 1;
                unique.put(letter, valueOfElement);
            } else {
                unique.put(letter, 1);
            }

        }

        List<Character> newchar = new ArrayList<>(unique.keySet());

        System.out.println("\nTask 2: The unique chars are:");
        newchar.forEach(el -> System.out.println(el));

    }
}
