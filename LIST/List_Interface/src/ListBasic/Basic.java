package ListBasic;

import java.util.*;

public class Basic {
    public static void display(){

//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

// ArrayList:
        // List myArrayList = new ArrayList();

// LinkedList:
        // List myLinkedList = new LinkedList();

// Vector:
        // List myVector = new Vector();

// Stack:
        // List myStack = new Stack();


        List myVector = new Vector();       // or new ArrayList/LinkedList/Vector/Stack();

        myVector.add("Tuhin");
        myVector.add(23);
        myVector.add(3.1416f);
        myVector.add('c');
        myVector.add(true);

        System.out.println(myVector);



///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// First Way:
        List<String> myList = new ArrayList<>();    // or new ArrayList/Vector/LinkedList/Stack<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        List<String> myList1 = new ArrayList<>(Arrays.asList("one", "two", "three"));    // or new ArrayList/Vector/LinkedList/Stack<>();

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        List<String> myList2 = new ArrayList<>(Arrays.asList(myArray));    // or new ArrayList/Vector/LinkedList/Stack<>();






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));      // or new ArrayList/Vector/LinkedList/Stack<>();
        System.out.println(list1);

        // Second:
        List<String> list2 = new ArrayList<>();           // or new ArrayList/Vector/LinkedList/Stack<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        List<String> list3 = new ArrayList<>(Arrays.asList(a));     // or new ArrayList/Vector/LinkedList/Stack<>();

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        List<Integer> list4 = new ArrayList<>(Arrays.asList(23, 2323, 34));     // or new ArrayList/Vector/LinkedList/Stack<>();
        System.out.println(list4);

        // Second:
        List<Integer> list5 = new ArrayList<>();       // or new ArrayList/Vector/LinkedList/Stack<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        List<Integer> list6 = new ArrayList<>(Arrays.asList(myInteger1));       // or new ArrayList/Vector/LinkedList/Stack<>();

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        List<Float> list7 = new ArrayList<>(Arrays.asList(4.34f, 656.23f));     // or new ArrayList/Vector/LinkedList/Stack<>();
        System.out.println(list7);

        // Second:
        List<Float> list8 = new ArrayList<>();         // or new ArrayList/Vector/LinkedList/Stack<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        List<Float> list9 = new ArrayList<>(Arrays.asList(myFloat1));    // or new ArrayList/Vector/LinkedList/Stack<>();

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        List<Character> list10 = Arrays.asList(myCharacter);       // or new ArrayList/Vector/LinkedList/Stack<>();
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        List<Boolean> list11 = new ArrayList<>();       // or new ArrayList/Vector/LinkedList/Stack<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        List<Double> list12 = new ArrayList<>(Arrays.asList(myDouble));     // or new ArrayList/Vector/LinkedList/Stack<>();
        System.out.println("Double list is: " + list12);
    }
}
