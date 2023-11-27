package lab5part1;

public class WordGroup {
    public String words;
    public WordGroup(String input){
        words = input.toLowerCase();
    }

    public String[] getWordArray() {
        return words.split(" ");
    }
}
