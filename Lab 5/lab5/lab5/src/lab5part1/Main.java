package lab5part1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WordGroup wordGroup1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup wordGroup2 = new WordGroup("When you play play hard when you work dont play at all");

        for (int i = 0; i < wordGroup1.getWordArray().length; i++) {
            System.out.println(wordGroup1.getWordArray()[i]);
        }

        for (int i = 0; i < wordGroup2.getWordArray().length; i++) {
            System.out.println(wordGroup2.getWordArray()[i]);
        }
    }
}
