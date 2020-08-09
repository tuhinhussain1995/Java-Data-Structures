package SetBasic;

import java.util.*;

public class Basic {
    public static void display(){

//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// All Data Type:
        // HashSet:
                // Set myHashSet = new HashSet();

        // LinkedHashSet:
                // Set myLinkedHashSet = new LinkedHashSet();

        // TreeSet:
                // TreeSet can't store multiple data type.



        Set mySet = new HashSet();         // or new HashSet/LinkedHashSet();

        mySet.add(12);
        mySet.add("Tuhin");
        mySet.add('A');
        mySet.add("Tuhin");
        mySet.add(12);

        System.out.println(mySet);


///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// First Way:
        Set<String> myList = new HashSet<>();    // or new HashSet/LinkedHashSet/TreeSet<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        Set<String> myList1 = new HashSet<>(Arrays.asList("one", "two", "three"));    // or new HashSet/LinkedHashSet/TreeSet<>();

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        Set<String> myList2 = new HashSet<>(Arrays.asList(myArray));    // or new HashSet/LinkedHashSet/TreeSet<>();






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        Set<String> list1 = new HashSet<>(Arrays.asList("A", "B", "C"));    // or new HashSet/LinkedHashSet/TreeSet<>();
        System.out.println(list1);

        // Second:
        Set<String> list2 = new HashSet<>();    // or new HashSet/LinkedHashSet/TreeSet<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        Set<String> list3 = new HashSet<>(Arrays.asList(a));    // or new HashSet/LinkedHashSet/TreeSet<>();

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        Set<Integer> list4 = new HashSet<>(Arrays.asList(23, 2323, 34));    // or new HashSet/LinkedHashSet/TreeSet<>();
        System.out.println(list4);

        // Second:
        Set<Integer> list5 = new HashSet<>();    // or new HashSet/LinkedHashSet/TreeSet<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        Set<Integer> list6 = new HashSet<>(Arrays.asList(myInteger1));    // or new HashSet/LinkedHashSet/TreeSet<>();

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        Set<Float> list7 = new HashSet<>(Arrays.asList(4.34f, 656.23f));    // or new HashSet/LinkedHashSet/TreeSet<>();
        System.out.println(list7);

        // Second:
        Set<Float> list8 = new HashSet<>();    // or new HashSet/LinkedHashSet/TreeSet<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        Set<Float> list9 = new HashSet<>(Arrays.asList(myFloat1));    // or new HashSet/LinkedHashSet/TreeSet<>();

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        Set<Character> list10 = new HashSet<>(Arrays.asList(myCharacter));    // or new HashSet/LinkedHashSet/TreeSet<>();
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        Set<Boolean> list11 = new HashSet<>();    // or new HashSet/LinkedHashSet/TreeSet<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        Set<Double> list12 = new HashSet<>(Arrays.asList(myDouble));    // or new HashSet/LinkedHashSet/TreeSet<>();
        System.out.println("Double list is: " + list12);
    }
}

