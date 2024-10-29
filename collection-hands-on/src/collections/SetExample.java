package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        SortedSet<String> vocab = new TreeSet<>();
        vocab.add("apple");
        vocab.add("mango");
        vocab.add("pineapple");
        vocab.add("banana");
        vocab.add("apple");

        System.out.println(vocab);

        String firstWord = vocab.first();
        String last = vocab.last();

        SortedSet<String> pineapple = vocab.headSet("pineapple");
        SortedSet<String> mango = vocab.tailSet("mango");
        System.out.println(pineapple);
        System.out.println(mango);
        System.out.println(firstWord);
        System.out.println(last);

    }

}
