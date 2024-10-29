package collections;

import java.util.ArrayList;
import java.util.Collection;

public class IteratorPattern {

    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();

//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }



}

class FruitSupplier{

    public Collection<String> getFruits() {

        ArrayList<String> list = new ArrayList<>();
        list.add("mango");
        list.add("banana");
        list.add("cherry");
        return list;
    }
}
