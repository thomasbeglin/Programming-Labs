package lab5part3;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {
    public String words;
    public WordGroup(String input){
        words = input.toLowerCase();
    }

    public String[] getWordArray() {
        return words.split(" ");
    }

    public HashSet<String> getWordSet(WordGroup wordGroup){
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < words.split(" ").length; i++) {
            hashSet.add(words.split(" ")[i]);
        }
        for (int i = 0; i < wordGroup.getWordArray().length; i++) {
            hashSet.add(wordGroup.getWordArray()[i]);
        }
        return hashSet;
    }

    public HashMap<String, Integer> getWordCounts() {
        HashMap<String, Integer> wordMap = new HashMap<>();

        String[] wordArray = words.split(" ");

        for (int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i];

            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        return wordMap;
    }
}
