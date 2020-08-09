package SortedSet_InterfaceBasic;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {


/////////// SortedSet doesn't support to store multiple data type.///////////


// Collection ==> Set ==> SortedSet ==> NavigableSet ==> TreeSet

// SortedSet extends Set.

// In order to use the functionalities of the SortedSet interface, we need to use the TreeSet class.





    public static void main(String[] args) {
        Basic.display();
        Methods.display();
        SortedSetObject.display();



// All Data Type:
        // SortedSet:
                // SortedSet doesn't support multiple data type.


// Specific Data Type:
        // SortedSet:
                // SortedSet<Byte> byteHashSet = new TreeSet<>();
                // SortedSet<Boolean> booleanHashSet = new TreeSet<>();
                // SortedSet<Character> charHashSet = new TreeSet<>();
                // SortedSet<Short> shortHashSet = new TreeSet<>();
                // SortedSet<Long> longHashSet = new TreeSet<>();
                // SortedSet<String> stringHashSet = new TreeSet<>();
                // SortedSet<Integer> integerHashSet = new TreeSet<>();
                // SortedSet<Float> floatHashSet = new TreeSet<>();
                // SortedSet<Double> doubleHashSet = new TreeSet<>();


// Class Object:
        // SortedSet:
                // The elements in TreeSet must be of a Comparable type.
                // We can't directly use TreeSet in SortedSet.
    }
}
