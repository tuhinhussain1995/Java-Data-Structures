package VectorBasic;

import java.util.*;

public class Basic {
    public static void display(){

///////////////////////////////////////////////////////////////////////////
////////////////////////////// All Data Type /////////////////////////////
///////////////////////////////////////////////////////////////////////////

// Vector:
        // Vector myArrayList = new Vector();


        Vector myVector = new Vector();

        myVector.add("Tuhin");
        myVector.add(23);
        myVector.add(3.1416);
        myVector.add('c');
        myVector.add(true);

        System.out.println(myVector);



////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// Vector:
        // Vector<Byte> byteVector = new Vector<>();
        // Vector<Boolean> booleanVector = new Vector<>();
        // Vector<Character> charVector = new Vector<>();
        // Vector<Short> shortVector = new Vector<>();
        // Vector<Long> longVector = new Vector<>();
        // Vector<String> stringVector = new Vector<>();
        // Vector<Integer> integerVector = new Vector<>();
        // Vector<Float> floatVector = new Vector<>();
        // Vector<Double> doubleVector = new Vector<>();




// First Way:
        Vector<String> myArrayList1 = new Vector<>(Arrays.asList("one", "two", "three"));

// Second Way:
        Vector<String> myArrayList = new Vector<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myArrayList.addAll(Arrays.asList(myArray3));

// Third Way:
        String[] myArray = {"one", "two", "three"};
        Vector<String> myArrayList2 = new Vector<>(Arrays.asList(myArray));






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First:
        Vector<String> arrayList1 = new Vector<>(Arrays.asList("Tuhin", "Sumon", "Nazrul"));
        System.out.println("String list is: " +arrayList1);

        // Second:
        Vector<String> arrayList2 = new Vector<>();

        arrayList2.addAll(Arrays.asList(a));
        arrayList2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +arrayList2);

        // Third:
        Vector<String> arrayList3 = new Vector<>(Arrays.asList(a));

        arrayList3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +arrayList3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First:
        Vector<Integer> arrayList4 = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Integer list is: " + arrayList4);

        // Second:
        Vector<Integer> arrayList5 = new Vector<>();

        arrayList5.addAll(Arrays.asList(myInteger1));
        arrayList5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + arrayList5);

        // Third:
        Vector<Integer> arrayList6 = new Vector<>(Arrays.asList(myInteger1));

        arrayList6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + arrayList6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First:
        Vector<Float> arrayList7 = new Vector<>(Arrays.asList(3.4f, 5.3f, 11.44f));
        System.out.println("Float list is: "+ arrayList7);

        // Second:
        Vector<Float> arrayList8 = new Vector<>();

        arrayList8.addAll(Arrays.asList(myFloat1));
        arrayList8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ arrayList8);

        // Third:
        Vector<Float> arrayList9 = new Vector<>(Arrays.asList(myFloat1));

        arrayList9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ arrayList9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        Vector<Character> arrayList10 = new Vector<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + arrayList10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        Vector<Boolean> arrayList11 = new Vector<>();
        arrayList11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + arrayList11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        Vector<Double> arrayList12 = new Vector<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + arrayList12);
    }
}
