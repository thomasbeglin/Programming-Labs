package lab5part3;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        WordGroup wordGroup1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup wordGroup2 = new WordGroup("When you play play hard when you work dont play at all");

        HashMap<String, Integer> wordGroup1Map = wordGroup1.getWordCounts();
        HashMap<String, Integer> wordGroup2Map = wordGroup2.getWordCounts();


        for (String string : wordGroup1Map.keySet()) {
            System.out.println(string + ": " + wordGroup1Map.get(string));
        }

        System.out.println(" ");
        for (String string : wordGroup2Map.keySet()) {
            System.out.println(string + ": " +  wordGroup2Map.get(string));
        }


        System.out.println(" ");

        for (String string : wordGroup1.getWordSet(wordGroup2)) {
            System.out.println(string );
        }



    }
}
