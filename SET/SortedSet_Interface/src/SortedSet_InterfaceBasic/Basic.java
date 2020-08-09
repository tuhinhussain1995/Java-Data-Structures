package SortedSet_InterfaceBasic;

import java.util.*;

public class Basic {
    public static void display(){


///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// SortedSet:
        // SortedSet<Byte> byteHashSet = new TreeSet<>();
        // SortedSet<Boolean> booleanHashSet = new TreeSet<>();
        // SortedSet<Character> charHashSet = new TreeSet<>();
        // SortedSet<Short> shortHashSet = new TreeSet<>();
        // SortedSet<Long> longHashSet = new TreeSet<>();
        // SortedSet<String> stringHashSet = new TreeSet<>();
        // SortedSet<Integer> integerHashSet = new TreeSet<>();
        // SortedSet<Float> floatHashSet = new TreeSet<>();
        // SortedSet<Double> doubleHashSet = new TreeSet<>();




// First Way:
        SortedSet<String> myList = new TreeSet<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        SortedSet<String> myList1 = new TreeSet<>(Arrays.asList("one", "two", "three"));

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        SortedSet<String> myList2 = new TreeSet<>(Arrays.asList(myArray));






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        SortedSet<String> list1 = new TreeSet<>(Arrays.asList("A", "B", "C"));
        System.out.println(list1);

        // Second:
        SortedSet<String> list2 = new TreeSet<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        SortedSet<String> list3 = new TreeSet<>(Arrays.asList(a));

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        SortedSet<Integer> list4 = new TreeSet<>(Arrays.asList(23, 2323, 34));
        System.out.println(list4);

        // Second:
        SortedSet<Integer> list5 = new TreeSet<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        SortedSet<Integer> list6 = new TreeSet<>(Arrays.asList(myInteger1));

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        SortedSet<Float> list7 = new TreeSet<>(Arrays.asList(4.34f, 656.23f));
        System.out.println(list7);

        // Second:
        SortedSet<Float> list8 = new TreeSet<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        SortedSet<Float> list9 = new TreeSet<>(Arrays.asList(myFloat1));

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        SortedSet<Character> list10 = new TreeSet<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        SortedSet<Boolean> list11 = new TreeSet<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        SortedSet<Double> list12 = new TreeSet<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}


