package TreeSetBasic;

/////////// TreeSet doesn't support to store multiple data type.///////////

// Collection ==> Set ==> SortedSet ==> NavigableSet ==> TreeSet

// HashSet is faster than the TreeSet.

public class Main {
    public static void main(String[] args) {
        Basic.display();
        Methods.display();

        TreeSetObject.display();



// All Data Type:
        // NavigableSet:
                // TreeSet doesn't support multiple data type.


// Specific Data Type:
        // TreeSet:
                // TreeSet<Byte> byteTreeSet = new TreeSet<>();
                // TreeSet<Boolean> booleanTreeSet = new TreeSet<>();
                // TreeSet<Character> charTreeSet = new TreeSet<>();
                // TreeSet<Short> shortTreeSet = new TreeSet<>();
                // TreeSet<Long> longTreeSet = new TreeSet<>();
                // TreeSet<String> stringTreeSet = new TreeSet<>();
                // TreeSet<Integer> integerTreeSet = new TreeSet<>();
                // TreeSet<Float> floatTreeSet = new TreeSet<>();
                // TreeSet<Double> doubleTreeSet = new TreeSet<>();


// Class Object:
        // TreeSet:
                // The elements in TreeSet must be of a Comparable type.
                // We can't directly use TreeSet.


    }
}
