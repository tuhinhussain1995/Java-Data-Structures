package QueueBasic;

import java.util.*;

public class Basic {
    public static void display(){

//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// LinkedList:
        // Queue myQueue = new LinkedList();

// ArrayDeque:
        // Queue myQueue = new ArrayDeque();

// PriorityQueue:
        // Queue myQueue = new PriorityQueue();



        Queue myVector = new LinkedList<>();       // or new LinkedList/ArrayDeque/PriorityQueue<>();
        myVector.add("Tuhin");
        myVector.add(23);
        myVector.add(3.1416);
        myVector.add('c');
        myVector.add(true);

        System.out.println(myVector);


///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


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



// First Way:
        Queue<String> myList = new LinkedList<>();    // or new LinkedList/ArrayDeque/PriorityQueue<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        Queue<String> myList1 = new LinkedList<>(Arrays.asList("one", "two", "three"));    // or new LinkedList/ArrayDeque/PriorityQueue<>();

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        Queue<String> myList2 = new LinkedList<>(Arrays.asList(myArray));    // or new LinkedList/ArrayDeque/PriorityQueue<>();






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        Queue<String> list1 = new LinkedList<>(Arrays.asList("A", "B", "C"));
        System.out.println(list1);

        // Second:
        Queue<String> list2 = new LinkedList<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        Queue<String> list3 = new LinkedList<>(Arrays.asList(a));

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        Queue<Integer> list4 = new LinkedList<>(Arrays.asList(23, 2323, 34));
        System.out.println(list4);

        // Second:
        Queue<Integer> list5 = new LinkedList<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        Queue<Integer> list6 = new LinkedList<>(Arrays.asList(myInteger1));

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        Queue<Float> list7 = new LinkedList<>(Arrays.asList(4.34f, 656.23f));
        System.out.println(list7);

        // Second:
        Queue<Float> list8 = new LinkedList<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        List<Float> list9 = new LinkedList<>(Arrays.asList(myFloat1));

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        Queue<Character> list10 = new LinkedList<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        Queue<Boolean> list11 = new LinkedList<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        Queue<Double> list12 = new LinkedList<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}
