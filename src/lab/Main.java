package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> words = readWordsFromFile();
        Dictionary dictionary = new Dictionary(words.size() * 10);
        for (String word : words) {
            dictionary.put(word);
            dictionary.getPermutations(word, "");
        }
        
        
        
        
        System.out.println(dictionary);
        //System.out.println(dictionary.get("administration"));
       // System.out.print(dictionary.getPermutations("", ""));
    }

    // Reads words from file "words.txt" line by line and returns a set of words without duplicates
    private static Set<String> readWordsFromFile() {
        Set<String> wordsSet = new HashSet<>();
        try (Scanner scanner = new Scanner(new File("D:/Desktop/INFORMATIK 2/Lab13/words.txt"))){
            while (scanner.hasNext()) {
                String word = scanner.nextLine();
                wordsSet.add(word);
            }
            return wordsSet;
        } catch (FileNotFoundException e) {
            return wordsSet;
        }
    }
}
