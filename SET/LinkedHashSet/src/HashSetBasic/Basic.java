package HashSetBasic;

import java.util.*;

public class Basic {
    public static void display(){


//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// LinkedHashSet:
        // LinkedHashSet myLinkedHashSet = new LinkedHashSet();



        LinkedHashSet mySet = new LinkedHashSet();

        mySet.add(12);
        mySet.add("Tuhin");
        mySet.add('A');
        mySet.add("Tuhin");
        mySet.add(12);

        System.out.println(mySet);



///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// LinkedHashSet:
        // LinkedHashSet<Byte> byteLinkedHashSet = new LinkedHashSet<>();
        // LinkedHashSet<Boolean> booleanLinkedHashSet = new LinkedHashSet<>();
        // LinkedHashSet<Character> charLinkedHashSet = new LinkedHashSet<>();
        // LinkedHashSet<Short> shortLinkedHashSet = new LinkedHashSet<>();
        // LinkedHashSet<Long> longLinkedHashSet = new LinkedHashSet<>();
        // LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        // LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        // LinkedHashSet<Float> floatLinkedHashSet = new LinkedHashSet<>();
        // LinkedHashSet<Double> doubleLinkedHashSet = new LinkedHashSet<>();




// First Way:
        LinkedHashSet<String> myList = new LinkedHashSet<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        LinkedHashSet<String> myList1 = new LinkedHashSet<>(Arrays.asList("one", "two", "three"));

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        LinkedHashSet<String> myList2 = new LinkedHashSet<>(Arrays.asList(myArray));






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        LinkedHashSet<String> list1 = new LinkedHashSet<>(Arrays.asList("A", "B", "C"));
        System.out.println(list1);

        // Second:
        LinkedHashSet<String> list2 = new LinkedHashSet<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        LinkedHashSet<String> list3 = new LinkedHashSet<>(Arrays.asList(a));

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        LinkedHashSet<Integer> list4 = new LinkedHashSet<>(Arrays.asList(23, 2323, 34));
        System.out.println(list4);

        // Second:
        LinkedHashSet<Integer> list5 = new LinkedHashSet<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        LinkedHashSet<Integer> list6 = new LinkedHashSet<>(Arrays.asList(myInteger1));

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        LinkedHashSet<Float> list7 = new LinkedHashSet<>(Arrays.asList(4.34f, 656.23f));
        System.out.println(list7);

        // Second:
        LinkedHashSet<Float> list8 = new LinkedHashSet<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        LinkedHashSet<Float> list9 = new LinkedHashSet<>(Arrays.asList(myFloat1));

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        LinkedHashSet<Character> list10 = new LinkedHashSet<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        LinkedHashSet<Boolean> list11 = new LinkedHashSet<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        LinkedHashSet<Double> list12 = new LinkedHashSet<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}

