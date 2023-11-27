package lab5part2;

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
}
