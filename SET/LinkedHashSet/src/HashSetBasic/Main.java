package HashSetBasic;

public class Main {

// LinkedHashSet extends HashSet.

// The LinkedHashSet class of the Java collections framework provides functionalities of both the hashtable and the linked list data structure.

// LinkedHashSet maintain a doubly-linked list internally.

// default capacity of myHashSet is 16
// default load factor is 0.75


// LinkedHashSet class is non synchronized.

// LinkedHashSet class only maintains the insertion order of its elements.

// Difference between LinkedHashSet and HashSet.
        // The LinkedHashSet class requires more storage than HashSet. This is because LinkedHashSet maintains linked lists internally.
        // The performance of LinkedHashSet is slower than HashSet. It is because of linked lists present in LinkedHashSet.

// Difference between LinkedHashSet and TreeSet.
        // TreeSet class implements the SortedSet interface. That's why elements in a tree set are sorted.
        // TreeSet is usually slower than a LinkedHashSet. It is because whenever an element is added to a TreeSet, it has to perform the sorting operation.
        // LinkedHashSet allows the insertion of null values. However, we cannot insert a null value to TreeSet.




    public static void main(String[] args) {
        Basic.display();
        Methods.display();
        Object.display();




// All Data Type:
        // LinkedHashSet:
                // LinkedHashSet myLinkedHashSet = new LinkedHashSet();



// Specific Data Type:
        // LinkedHashSet:
                // LinkedHashSet<Byte> byteLinkedHashSet = new LinkedHashSet<>();
                // LinkedHashSet<Boolean> booleanLinkedHashSet = new LinkedHashSet<>();
                // LinkedHashSet<Character> charLinkedHashSet = new LinkedHashSet<>();
                // LinkedHashSet<Short> shortLinkedHashSet = new LinkedHashSet<>();
                // LinkedHashSet<Long> longLinkedHashSet = new LinkedHashSet<>();
                // LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
                // LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
                // LinkedHashSet<Float> floatLinkedHashSet = new LinkedHashSet<>();
                // LinkedHashSet<Double> doubleLinkedHashSet = new LinkedHashSet<>();



// Class Objects:
        // LinkedHashSet:
                // LinkedHashSet<Object> list = new LinkedHashSet<Object>();


    }
}
