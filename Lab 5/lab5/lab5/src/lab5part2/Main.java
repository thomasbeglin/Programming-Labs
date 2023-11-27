package lab5part2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        WordGroup wordGroup1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup wordGroup2 = new WordGroup("When you play play hard when you work dont play at all");

        HashSet<String> hashSet = wordGroup1.getWordSet(wordGroup2);

        for (String string : hashSet) {
            System.out.println(string);
        }
    }
}
