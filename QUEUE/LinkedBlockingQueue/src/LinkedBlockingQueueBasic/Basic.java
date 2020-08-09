package LinkedBlockingQueueBasic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Basic {
    public static void display(){

//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// ArrayBlockingQueue:
        // LinkedBlockingQueue myVector = new LinkedBlockingQueue();


        LinkedBlockingQueue myVector = new LinkedBlockingQueue();
        myVector.add("Tuhin");
        myVector.add(23);
        myVector.add(3.1416);
        myVector.add('c');
        myVector.add(true);

        System.out.println(myVector);


///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// ArrayBlockingQueue:
        // LinkedBlockingQueue<Byte> byteBQ = new LinkedBlockingQueue<>();
        // LinkedBlockingQueue<Boolean> booleanBQ = new LinkedBlockingQueue<>();
        // LinkedBlockingQueue<Character> charBQ = new LinkedBlockingQueue<>();
        // LinkedBlockingQueue<Short> shortBQ = new LinkedBlockingQueue<>();
        // LinkedBlockingQueue<Long> longBQ = new LinkedBlockingQueue<>();
        // LinkedBlockingQueue<String> myBQ = new LinkedBlockingQueue<>();
        // LinkedBlockingQueue<Integer> integerBQ = new LinkedBlockingQueue<>();
        // LinkedBlockingQueue<Float> floatBQ = new LinkedBlockingQueue<>();
        // LinkedBlockingQueue<Double> doubleBQ = new LinkedBlockingQueue<>();



// First Way:
        LinkedBlockingQueue<String> myArrayList1 = new LinkedBlockingQueue<>(Arrays.asList("one", "two", "three"));


// Second Way:
        LinkedBlockingQueue<String> myArrayList = new LinkedBlockingQueue<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myArrayList.addAll(Arrays.asList(myArray3));


// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        LinkedBlockingQueue<String> myArrayList2 = new LinkedBlockingQueue<>(Arrays.asList(myArray));






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First:
        LinkedBlockingQueue<String> arrayList1 = new LinkedBlockingQueue<>(Arrays.asList("Tuhin", "Sumon", "Nazrul"));
        System.out.println("String list is: " +arrayList1);

        // Second:
        LinkedBlockingQueue<String> arrayList2 = new LinkedBlockingQueue<>();

        arrayList2.addAll(Arrays.asList(a));
        arrayList2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +arrayList2);

        // Third:
        LinkedBlockingQueue<String> arrayList3 = new LinkedBlockingQueue<>(Arrays.asList(a));

        arrayList3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +arrayList3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First:
        LinkedBlockingQueue<Integer> arrayList4 = new LinkedBlockingQueue<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Integer list is: " + arrayList4);

        // Second:
        LinkedBlockingQueue<Integer> arrayList5 = new LinkedBlockingQueue<>();

        arrayList5.addAll(Arrays.asList(myInteger1));
        arrayList5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + arrayList5);

        // Third:
        LinkedBlockingQueue<Integer> arrayList6 = new LinkedBlockingQueue<>(Arrays.asList(myInteger1));

        arrayList6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + arrayList6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First:
        LinkedBlockingQueue<Float> arrayList7 = new LinkedBlockingQueue<>(Arrays.asList(3.4f, 5.3f, 11.44f));
        System.out.println("Float list is: "+ arrayList7);

        // Second:
        LinkedBlockingQueue<Float> arrayList8 = new LinkedBlockingQueue<>();

        arrayList8.addAll(Arrays.asList(myFloat1));
        arrayList8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ arrayList8);

        // Third:
        LinkedBlockingQueue<Float> arrayList9 = new LinkedBlockingQueue<>(Arrays.asList(myFloat1));

        arrayList9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ arrayList9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        LinkedBlockingQueue<Character> arrayList10 = new LinkedBlockingQueue<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + arrayList10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        LinkedBlockingQueue<Boolean> arrayList11 = new LinkedBlockingQueue<>();
        arrayList11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + arrayList11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        LinkedBlockingQueue<Double> arrayList12 = new LinkedBlockingQueue<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + arrayList12);
    }
}



