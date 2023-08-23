package studio;
import java.util.Map;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String inputString = "Izzy is awesome.";

        Map <Character, Integer> characterCounts = new HashMap<>();

        inputString =inputString.toLowerCase();

        for (var c: inputString.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                continue;
            }

            characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
        }
        }
    }
