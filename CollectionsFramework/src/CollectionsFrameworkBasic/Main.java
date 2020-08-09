package CollectionsFrameworkBasic;

public class Main {

    public static void main(String[] args) {

// The collection framework" and Collection interface are not the same thing.

// Java Collection framework provides many interfaces and classes.

// Collection Interfaces:

        // Interfaces ----> Classes
            // List
                        // ArrayList
                        // Vector
                        // LinkedList           ****
                        // Stack
            // Set
                        // HashSet
                        // LinkedHashSet
                        // EnumSet
                        // TreeSet               $$$$
            // SortedSet
                        // TreeSet               $$$$
            // NavigableSet
                        // TreeSet               $$$$
            // Queue
                        // ArrayDeque            &&&&
                        // LinkedList            ****
                        // PriorityQueue
            // Deque
                        // ArrayDeque            &&&&
                        // LinkedList            ****
            // BlockingQueue
                        // ArrayBlockingQueue
                        // LinkedBlockingQueue
            // BlockingDeque
                        // LinkedBlockingDeque



// Map Interface:
    // Map is a part of the collection framework but it doesn't implement the java.util.Collection interface.
    // Because Maps works with key/value pairs, while the other collections work with just values.

        // Interfaces ----> Classes
            // Map
                        // HashMap
                        // EnumMap
                        // LinkedHashMap      ==> extends HashMap
                        // WeakHashMap
                        // TreeMap            $$$$
            // SortedMap
                        // TreeMap            $$$$
            // NavigableMap                   ==> extends SortedMap
                        // TreeMap            $$$$
            // ConcurrentMap
                        // ConcurrentHashMap


// Iterator Interface:
    // Collection framework also proves Iterator interface.



///////////////////////////////////////////////////////////////////////////////////////////


// Collection Interface:
        // The Collection interface is the root interface of the collections framework.

// List Interface:
        // List interface is an ordered collection that allows us to add and remove elements like an array.

// Set Interface:
        // The Set interface allows us to store elements in different sets similar to the set in mathematics. It cannot have duplicate elements.

// Queue Interface:
        // The Queue interface is used when we want to store and access elements in First In, First Out manner.

// Map Interface:
        // Map interface allows elements to be stored in key/value pairs. Keys are unique names that can be used to access a particular element in a map.
        // And, each key has a single value associated with it.



    }
}
