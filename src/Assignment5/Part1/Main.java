package Assignment5.Part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Qst 1: ArrayList Operations
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("orange");
        wordList.add("grape");
        wordList.add("kiwi");
        System.out.println(wordList);

        // Qst 2: ArrayList Manipulation:
        wordList.addFirst("pear");
        wordList.remove(3);
        System.out.println("Contains the word \"orange\": " + wordList.contains("orange"));
        System.out.println(wordList);
    }
}
