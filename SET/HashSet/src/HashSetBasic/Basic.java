package HashSetBasic;

import java.util.*;

public class Basic {
    public static void display(){


//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// HashSet:
        // HashSet myHashSet = new HashSet();



        HashSet mySet = new HashSet();

        mySet.add(12);
        mySet.add("Tuhin");
        mySet.add('A');
        mySet.add("Tuhin");
        mySet.add(12);

        System.out.println(mySet);



///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// HashSet
        // HashSet<Byte> byteHashSet = new HashSet<>();
        // HashSet<Boolean> booleanHashSet = new HashSet<>();
        // HashSet<Character> charHashSet = new HashSet<>();
        // HashSet<Short> shortHashSet = new HashSet<>();
        // HashSet<Long> longHashSet = new HashSet<>();
        // HashSet<String> stringHashSet = new HashSet<>();
        // HashSet<Integer> integerHashSet = new HashSet<>();
        // HashSet<Float> floatHashSet = new HashSet<>();
        // HashSet<Double> doubleHashSet = new HashSet<>();




// First Way:
        HashSet<String> myList = new HashSet<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));

// Second Way:
        HashSet<String> myList1 = new HashSet<>(Arrays.asList("one", "two", "three"));

// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        HashSet<String> myList2 = new HashSet<>(Arrays.asList(myArray));






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First
        HashSet<String> list1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        System.out.println(list1);

        // Second:
        HashSet<String> list2 = new HashSet<>();

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);

        // Third:
        HashSet<String> list3 = new HashSet<>(Arrays.asList(a));

        list3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First
        HashSet<Integer> list4 = new HashSet<>(Arrays.asList(23, 2323, 34));
        System.out.println(list4);

        // Second:
        HashSet<Integer> list5 = new HashSet<>();

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);

        // Third:
        HashSet<Integer> list6 = new HashSet<>(Arrays.asList(myInteger1));

        list6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First
        HashSet<Float> list7 = new HashSet<>(Arrays.asList(4.34f, 656.23f));
        System.out.println(list7);

        // Second:
        HashSet<Float> list8 = new HashSet<>();

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);

        // Third:
        HashSet<Float> list9 = new HashSet<>(Arrays.asList(myFloat1));

        list9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        HashSet<Character> list10 = new HashSet<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        HashSet<Boolean> list11 = new HashSet<>();
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        HashSet<Double> list12 = new HashSet<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}

