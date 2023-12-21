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

        // Qst 3: Generic Class
        Pair<Integer,String> pair = new Pair<>(3,"hi");
        System.out.println(pair);

        // Qst 4: Using Generic Class
        Pair<Double, Double> pair2 = new Pair<>(2.3, 4.5);
        System.out.println(pair2);

        // Qst 5: ArrayList with Generics
        ArrayList<Pair<?,?>> arr = new ArrayList<>();
        arr.add(pair);
        arr.add(pair2);
        System.out.println(arr);

        // Qst 6: Challenge
        printArrayList(wordList);
        printArrayList(arr);
    }

    // Qst 6: Challenge
    public static <E> void printArrayList(ArrayList<E> arrayList){
        System.out.println("Printing ArrayList: ");
        for(E e : arrayList){
            System.out.println("\t" + e);
        }
    }
}
