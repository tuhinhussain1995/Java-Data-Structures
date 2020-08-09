package ArrayDequeBasic;

import java.util.*;

public class Basic {
    public static void display(){

//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// ArrayDeque:
        // ArrayDeque myVector = new ArrayDeque();



        ArrayDeque myVector = new ArrayDeque();
        myVector.add("Tuhin");
        myVector.add(23);
        myVector.add(3.1416);
        myVector.add('c');
        myVector.add(true);

        System.out.println(myVector);


///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// ArrayDeque:
        // ArrayDeque<Byte> byteQueue = new ArrayDeque<>();
        // ArrayDeque<Boolean> booleanQueue = new ArrayDeque<>();
        // ArrayDeque<Character> charQueue = new ArrayDeque<>();
        // ArrayDeque<Short> shortQueue = new ArrayDeque<>();
        // ArrayDeque<Long> longQueue = new ArrayDeque<>();
        // ArrayDeque<String> stringQueue = new ArrayDeque<>();
        // ArrayDeque<Integer> integerQueue = new ArrayDeque<>();
        // ArrayDeque<Float> floatQueue = new ArrayDeque<>();
        // ArrayDeque<Double> doubleQueue = new ArrayDeque<>();



// First Way:
        ArrayDeque<String> myList = new ArrayDeque<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        ArrayDeque<String> myList1 = new ArrayDeque<>(Arrays.asList("one", "two", "three"));

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        ArrayDeque<String> myList2 = new ArrayDeque<>(Arrays.asList(myArray));






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        ArrayDeque<String> list1 = new ArrayDeque<>(Arrays.asList("A", "B", "C"));
        System.out.println(list1);

        // Second:
        ArrayDeque<String> list2 = new ArrayDeque<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        ArrayDeque<String> list3 = new ArrayDeque<>(Arrays.asList(a));

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        ArrayDeque<Integer> list4 = new ArrayDeque<>(Arrays.asList(23, 2323, 34));
        System.out.println(list4);

        // Second:
        ArrayDeque<Integer> list5 = new ArrayDeque<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        ArrayDeque<Integer> list6 = new ArrayDeque<>(Arrays.asList(myInteger1));

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        ArrayDeque<Float> list7 = new ArrayDeque<>(Arrays.asList(4.34f, 656.23f));
        System.out.println(list7);

        // Second:
        ArrayDeque<Float> list8 = new ArrayDeque<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        ArrayDeque<Float> list9 = new ArrayDeque<>(Arrays.asList(myFloat1));

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        ArrayDeque<Character> list10 = new ArrayDeque<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        ArrayDeque<Boolean> list11 = new ArrayDeque<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        ArrayDeque<Double> list12 = new ArrayDeque<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}

