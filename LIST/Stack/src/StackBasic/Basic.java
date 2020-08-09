package StackBasic;

import java.util.*;

public class Basic {
    public static void display(){

///////////////////////////////////////////////////////////////////////////
////////////////////////////// All Data Type /////////////////////////////
///////////////////////////////////////////////////////////////////////////

// Stack:
        // Stack myStack = new Stack();


        Stack myStack = new Stack();

        myStack.add("Tuhin");
        myStack.add(23);
        myStack.add(3.1416);
        myStack.add('c');
        myStack.add(true);

        System.out.println(myStack);


////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////


// Stack:
        // Stack<Byte> byteStack = new Stack<>();
        // Stack<Boolean> booleanStack = new Stack<>();
        // Stack<Character> charStack = new Stack<>();
        // Stack<Short> shortStack = new Stack<>();
        // Stack<Long> longStack = new Stack<>();
        // Stack<String> stringStack = new Stack<>();
        // Stack<Integer> integerStack = new Stack<>();
        // Stack<Float> floatStack = new Stack<>();
        // Stack<Double> doubleStack = new Stack<>();



// Only one way:
        Stack<String> myArrayList = new Stack<>();     // Empty Stack

        String[] myArray3 = new String[] {"one", "two", "three"};

        myArrayList.addAll(Arrays.asList(myArray3));
        myArrayList.addAll(Arrays.asList("Five", "Six", "Seven"));

        myArrayList.push("Four");





// String:
        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        Stack<String> arrayList2 = new Stack<>();

        arrayList2.addAll(Arrays.asList(a));
        arrayList2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +arrayList2);


// Integer:
        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        Stack<Integer> arrayList5 = new Stack<>();

        arrayList5.addAll(Arrays.asList(myInteger1));
        arrayList5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + arrayList5);


// Float:
        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        Stack<Float> arrayList8 = new Stack<>();

        arrayList8.addAll(Arrays.asList(myFloat1));
        arrayList8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ arrayList8);



// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        Stack<Character> arrayList10 = new Stack<>();
        arrayList10.addAll(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + arrayList10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        Stack<Boolean> arrayList11 = new Stack<>();
        arrayList11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + arrayList11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        Stack<Double> arrayList12 = new Stack<>();
        arrayList12.addAll(Arrays.asList(myDouble));
        System.out.println("Double list is: " + arrayList12);
    }
}

