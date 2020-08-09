package BlockingDequeBasic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Basic {
    public static void display(){

//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// LinkedBlockingDeque:
        // BlockingDeque myBQ = new LinkedBlockingDeque();



        BlockingDeque myVector = new LinkedBlockingDeque();
        myVector.add("Tuhin");
        myVector.add(23);
        myVector.add(3.1416);
        myVector.add('c');
        myVector.add(true);

        System.out.println(myVector);


///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// LinkedBlockingDeque:
        // BlockingDeque<Byte> byteBQ = new LinkedBlockingDeque<>();
        // BlockingDeque<Boolean> booleanBQ = new LinkedBlockingDeque<>();
        // BlockingDeque<Character> charBQ = new LinkedBlockingDeque<>();
        // BlockingDeque<Short> shortBQ = new LinkedBlockingDeque<>();
        // BlockingDeque<Long> longBQ = new LinkedBlockingDeque<>();
        // BlockingDeque<String> myBQ = new LinkedBlockingDeque<>();
        // BlockingDeque<Integer> integerBQ = new LinkedBlockingDeque<>();
        // BlockingDeque<Float> floatBQ = new LinkedBlockingDeque<>();
        // BlockingDeque<Double> doubleBQ = new LinkedBlockingDeque<>();


// First Way:
        BlockingDeque<String> myList = new LinkedBlockingDeque<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        BlockingDeque<String> myList1 = new LinkedBlockingDeque<>(Arrays.asList("one", "two", "three"));

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        BlockingDeque<String> myList2 = new LinkedBlockingDeque<>(Arrays.asList(myArray));





// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        BlockingDeque<String> list1 = new LinkedBlockingDeque<>(Arrays.asList("A", "B", "C"));
        System.out.println(list1);

        // Second:
        BlockingDeque<String> list2 = new LinkedBlockingDeque<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        BlockingDeque<String> list3 = new LinkedBlockingDeque<>(Arrays.asList(a));

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        BlockingDeque<Integer> list4 = new LinkedBlockingDeque<>(Arrays.asList(23, 2323, 34));
        System.out.println(list4);

        // Second:
        BlockingDeque<Integer> list5 = new LinkedBlockingDeque<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        BlockingDeque<Integer> list6 = new LinkedBlockingDeque<>(Arrays.asList(myInteger1));

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        BlockingDeque<Float> list7 = new LinkedBlockingDeque<>(Arrays.asList(4.34f, 656.23f));
        System.out.println(list7);

        // Second:
        BlockingDeque<Float> list8 = new LinkedBlockingDeque<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        BlockingDeque<Float> list9 = new LinkedBlockingDeque<>(Arrays.asList(myFloat1));

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        BlockingDeque<Character> list10 = new LinkedBlockingDeque<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        BlockingDeque<Boolean> list11 = new LinkedBlockingDeque<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        BlockingDeque<Double> list12 = new LinkedBlockingDeque<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}


