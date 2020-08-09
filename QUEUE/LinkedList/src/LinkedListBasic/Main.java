package LinkedListBasic;

import java.util.*;

public class Main {

// LinkedList provides doubly-linked list data structure.


// Each element in a linked list is known as a node. It consists of 3 fields:

    // Prev - Stores an address of the previous element in the list. It is null for the first element.
    // Next - Stores an address of the next element in the list. It is null for the last element.
    // Data - Stores the actual data.


// Creating LinkedList:
            // LinkedList<Type> linkedList = new LinkedList<>();
            // LinkedList linkedList = new LinkedList<>();

// Creating LinkedList using interfaces:
    // List Interface
            // List<Type> animals1 = new LinkedList<>();
            // List animals1 = new LinkedList<>();
    // Queue Interface
            // Queue<Type> animals2 = new LinkedList<>();
            // Queue animals2 = new LinkedList<>();
    // Deque Interface
            // Deque<Type> animals3 = new LinkedList<>();
            // Deque animals3 = new LinkedList<>();


// Deque is a sub-interface of Queue. So Deque can use queue and deque all methods.


    public static void main(String[] args) {
        Basic.display();
        Methods.display();
        Object.display();



// All Data Type:
        // LinkedList:
                // LinkedList myLinkedList = new LinkedList();


// Specific Data Type:
        // LinkedList:
                // LinkedList<Byte> byteLinkedList = new LinkedList<>();
                // LinkedList<Boolean> booleanLinkedList = new LinkedList<>();
                // LinkedList<Character> charLinkedList = new LinkedList<>();
                // LinkedList<Short> shortLinkedList = new LinkedList<>();
                // LinkedList<Long> longLinkedList = new LinkedList<>();
                // LinkedList<String> stringLinkedList = new LinkedList<>();
                // LinkedList<Integer> integerLinkedList = new LinkedList<>();
                // LinkedList<Float> floatLinkedList = new LinkedList<>();
                // LinkedList<Double> doubleLinkedList = new LinkedList<>();


// Class Objects:
        // LinkedList:
                // LinkedList<Object> myLinkedList=new LinkedList<Object>();

    }
}
