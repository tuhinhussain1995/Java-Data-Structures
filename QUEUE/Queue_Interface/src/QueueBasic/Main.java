package QueueBasic;
import java.util.ArrayDeque;
import java.util.*;

public class Main {

// Queue extends Collection.

// Data doesn't store in sorted form.

// The Queue interface is used when we want to store and access elements in First In, First Out(FIFO) manner.     
// elements are added from the behind and removed from the front.


// In order to use the functionalities of Queue, we need to use classes that implement it:
// Queue Interface:
        // ArrayDeque class
        // LinkedList class
        // PriorityQueue class

// The Queue interface is also extended by various sub-interfaces:
// Queue Interface:
        // Deque Interface.
                // ArrayDeque class
                // LinkedList class
        // BlockingQueue Interface
                // ArrayBlockingQueue class
                // LinkedBlockingQueue class
        // BlockingDeque Interface
                // LinkedBlockingDeque class



    public static void main(String[] args) {
        Basic.display();
        Methods.display();
        Object.display();



// All Data Type:
        // LinkedList:
                // Queue myQueue = new LinkedList();

        // ArrayDeque:
                // Queue myQueue = new ArrayDeque();

        // PriorityQueue:
                // Queue myQueue = new PriorityQueue();


// Specific Data Type:
        // LinkedList:
                // Queue<Byte> byteQueue = new LinkedList<>();
                // Queue<Boolean> booleanQueue = new LinkedList<>();
                // Queue<Character> charQueue = new LinkedList<>();
                // Queue<Short> shortQueue = new LinkedList<>();
                // Queue<Long> longQueue = new LinkedList<>();
                // Queue<String> stringQueue = new LinkedList<>();
                // Queue<Integer> integerQueue = new LinkedList<>();
                // Queue<Float> floatQueue = new LinkedList<>();
                // Queue<Double> doubleQueue = new LinkedList<>();

        // ArrayDeque:
                // Queue<Byte> byteQueue = new ArrayDeque<>();
                // Queue<Boolean> booleanQueue = new ArrayDeque<>();
                // Queue<Character> charQueue = new ArrayDeque<>();
                // Queue<Short> shortQueue = new ArrayDeque<>();
                // Queue<Long> longQueue = new ArrayDeque<>();
                // Queue<String> stringQueue = new ArrayDeque<>();
                // Queue<Integer> integerQueue = new ArrayDeque<>();
                // Queue<Float> floatQueue = new ArrayDeque<>();
                // Queue<Double> doubleQueue = new ArrayDeque<>();

        // PriorityQueue:
                // Queue<Byte> byteQueue = new PriorityQueue<>();
                // Queue<Boolean> booleanQueue = new PriorityQueue<>();
                // Queue<Character> charQueue = new PriorityQueue<>();
                // Queue<Short> shortQueue = new PriorityQueue<>();
                // Queue<Long> longQueue = new PriorityQueue<>();
                // Queue<String> stringQueue = new PriorityQueue<>();
                // Queue<Integer> integerQueue = new PriorityQueue<>();
                // Queue<Float> floatQueue = new PriorityQueue<>();
                // Queue<Double> doubleQueue = new PriorityQueue<>();



// Class Objects:
        // LinkedList:
                // Queue<Object> myQueue=new LinkedList<Object>();

        // ArrayDeque:
                // Queue<Object> myQueue=new ArrayDeque<Object>();

        // PriorityQueue:
                // Queue<Object> myQueue=new PriorityQueue<Object>();



    }
}
