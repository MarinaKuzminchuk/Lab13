package lab;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<List<String>> hashTable;

    public Dictionary(int n) {
        hashTable = new ArrayList<>();
        // create n empty buckets for dictionary elements
        for (int i = 0; i < n; i++) {
            hashTable.add(new ArrayList<>());
        }
    }

    // calculate a hash for a word, use it to determine a bucket and return the bucket
    public List<String> get(String word) {
        int hash = hash(word);
        int bucket = hash % hashTable.size();
        return hashTable.get(bucket);
    }

    // calculate a hash for a word, use it to determine a bucket and put the word in this bucket
    public void put(String word) {
        int hash = hash(word);
        int bucket = hash % hashTable.size();
        hashTable.get(bucket).add(word);
    }

    // return an integer corresponding to a word in a dictionary
    private int hash(String word) {
        // use the hashCode method from String class that already returns an integer for a string
        // use Math.abs to turn negative integers into positive
        return Math.abs(word.hashCode());
    }

    // override toString from class Object to print the dictionary in a more readable format
    @Override
    public String toString() {
        return "Dictionary{" +
                "hashTable=" + hashTable +
                '}';
    }
}
