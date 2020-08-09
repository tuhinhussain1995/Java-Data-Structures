package LinkedListBasic;

import java.util.*;

public class Basic {
    public static void display(){

///////////////////////////////////////////////////////////////////////////
////////////////////////////// All Data Type /////////////////////////////
///////////////////////////////////////////////////////////////////////////


// LinkedList:
        // LinkedList myLinkedList = new LinkedList();


        LinkedList myArr = new LinkedList();

        myArr.add("Tuhin");
        myArr.add(23);
        myArr.add(3.1416);
        myArr.add('c');
        myArr.add(true);

        System.out.println(myArr);



////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////


// ArrayList:
        // LinkedList<Byte> byteLinkedList = new LinkedList<>();
        // LinkedList<Boolean> booleanLinkedList = new LinkedList<>();
        // LinkedList<Character> charLinkedList = new LinkedList<>();
        // LinkedList<Short> shortLinkedList = new LinkedList<>();
        // LinkedList<Long> longLinkedList = new LinkedList<>();
        // LinkedList<String> stringLinkedList = new LinkedList<>();
        // LinkedList<Integer> integerLinkedList = new LinkedList<>();
        // LinkedList<Float> floatLinkedList = new LinkedList<>();
        // LinkedList<Double> doubleLinkedList = new LinkedList<>();



// First Way:
        LinkedList<String> myArrayList1 = new LinkedList<>(Arrays.asList("one", "two", "three"));

// Second Way:
        LinkedList<String> myArrayList = new LinkedList<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myArrayList.addAll(Arrays.asList(myArray3));

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        LinkedList<String> myArrayList2 = new LinkedList<>(Arrays.asList(myArray));






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First:
        LinkedList<String> arrayList1 = new LinkedList<>(Arrays.asList("Tuhin", "Sumon", "Nazrul"));
        System.out.println("String list is: " +arrayList1);

        // Second:
        LinkedList<String> arrayList2 = new LinkedList<>();

        arrayList2.addAll(Arrays.asList(a));
        arrayList2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +arrayList2);

        // Third:
        LinkedList<String> arrayList3 = new LinkedList<>(Arrays.asList(a));

        arrayList3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +arrayList3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First:
        LinkedList<Integer> arrayList4 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Integer list is: " + arrayList4);

        // Second:
        LinkedList<Integer> arrayList5 = new LinkedList<>();

        arrayList5.addAll(Arrays.asList(myInteger1));
        arrayList5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + arrayList5);

        // Third:
        LinkedList<Integer> arrayList6 = new LinkedList<>(Arrays.asList(myInteger1));

        arrayList6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + arrayList6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First:
        LinkedList<Float> arrayList7 = new LinkedList<>(Arrays.asList(3.4f, 5.3f, 11.44f));
        System.out.println("Float list is: "+ arrayList7);

        // Second:
        LinkedList<Float> arrayList8 = new LinkedList<>();

        arrayList8.addAll(Arrays.asList(myFloat1));
        arrayList8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ arrayList8);

        // Third:
        LinkedList<Float> arrayList9 = new LinkedList<>(Arrays.asList(myFloat1));

        arrayList9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ arrayList9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        LinkedList<Character> arrayList10 = new LinkedList<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + arrayList10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        LinkedList<Boolean> arrayList11 = new LinkedList<>();
        arrayList11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + arrayList11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        LinkedList<Double> arrayList12 = new LinkedList<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + arrayList12);
    }
}
