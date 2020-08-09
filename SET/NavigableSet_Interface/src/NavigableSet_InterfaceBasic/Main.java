package NavigableSet_InterfaceBasic;


/////////// NavigableSet doesn't support to store multiple data type.///////////

// Collection ==> Set ==> SortedSet ==> NavigableSet ==> TreeSet

// NavigableSet extends SortedSet.


// The NavigableSet is considered as a type of SortedSet. It is because NavigableSet extends the SortedSet interface.
// some of the methods of SortedSet (headSet(), tailSet() and subSet()) are defined differently in NavigableSet.


import java.util.NavigableSet;

public class Main {

    public static void main(String[] args) {
        Basic.display();
        Methods.display();

        NavigableSetObject.display();

// All Data Type:
        // NavigableSet:
                // NavigableSet doesn't support multiple data type.


// Specific Data Type:
        // NavigableSet:
                // NavigableSet<Byte> byteNavigableSet = new TreeSet<>();
                // NavigableSet<Boolean> booleaNavigableSet = new TreeSet<>();
                // NavigableSet<Character> charNavigableSet = new TreeSet<>();
                // NavigableSet<Short> shortNavigableSet = new TreeSet<>();
                // NavigableSet<Long> longNavigableSet = new TreeSet<>();
                // NavigableSet<String> stringNavigableSet = new TreeSet<>();
                // NavigableSet<Integer> integerNavigableSet = new TreeSet<>();
                // NavigableSet<Float> floatNavigableSet = new TreeSet<>();
                // NavigableSet<Double> doubleNavigableSet = new TreeSet<>();


// Class Object:
        // NavigableSet:
                // The elements in TreeSet must be of a Comparable type.
                // We can't directly use TreeSet in NavigableSet.

    }
}
