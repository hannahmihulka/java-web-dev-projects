package studio;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String inputString = "Izzy is awesome.";

        Map <Character, Integer> characterCounts = new HashMap<>();

        inputString =inputString.toLowerCase();

        for (char c: inputString.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                continue;
            }
        }
    }
}
