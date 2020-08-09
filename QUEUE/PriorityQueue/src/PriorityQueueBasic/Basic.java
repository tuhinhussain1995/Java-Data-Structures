package PriorityQueueBasic;

import java.util.*;

public class Basic {
    public static void display(){

//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// PriorityQueue:
        // PriorityQueue doesn't support All data type.


///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// PriorityQueue:
        // PriorityQueue<Byte> byteQueue = new PriorityQueue<>();
        // PriorityQueue<Boolean> booleanQueue = new PriorityQueue<>();
        // PriorityQueue<Character> charQueue = new PriorityQueue<>();
        // PriorityQueue<Short> shortQueue = new PriorityQueue<>();
        // PriorityQueue<Long> longQueue = new PriorityQueue<>();
        // PriorityQueue<String> stringQueue = new PriorityQueue<>();
        // PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
        // PriorityQueue<Float> floatQueue = new PriorityQueue<>();
        // PriorityQueue<Double> doubleQueue = new PriorityQueue<>();



// First Way:
        PriorityQueue<String> myList = new PriorityQueue<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        PriorityQueue<String> myList1 = new PriorityQueue<>(Arrays.asList("one", "two", "three"));

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        PriorityQueue<String> myList2 = new PriorityQueue<>(Arrays.asList(myArray));






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        PriorityQueue<String> list1 = new PriorityQueue<>(Arrays.asList("A", "B", "C"));
        System.out.println(list1);

        // Second:
        PriorityQueue<String> list2 = new PriorityQueue<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        PriorityQueue<String> list3 = new PriorityQueue<>(Arrays.asList(a));

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        PriorityQueue<Integer> list4 = new PriorityQueue<>(Arrays.asList(23, 2323, 34));
        System.out.println(list4);

        // Second:
        PriorityQueue<Integer> list5 = new PriorityQueue<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        PriorityQueue<Integer> list6 = new PriorityQueue<>(Arrays.asList(myInteger1));

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        PriorityQueue<Float> list7 = new PriorityQueue<>(Arrays.asList(4.34f, 656.23f));
        System.out.println(list7);

        // Second:
        PriorityQueue<Float> list8 = new PriorityQueue<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        PriorityQueue<Float> list9 = new PriorityQueue<>(Arrays.asList(myFloat1));

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        PriorityQueue<Character> list10 = new PriorityQueue<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        PriorityQueue<Boolean> list11 = new PriorityQueue<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        PriorityQueue<Double> list12 = new PriorityQueue<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}


