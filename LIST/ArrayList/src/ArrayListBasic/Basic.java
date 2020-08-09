package ArrayListBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic {
    public static void display(){

///////////////////////////////////////////////////////////////////////////
////////////////////////////// All Data Type /////////////////////////////
///////////////////////////////////////////////////////////////////////////

// ArrayList:
        // ArrayList myArrayList = new ArrayList();


        ArrayList myArr = new ArrayList();

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
        // ArrayList<Byte> byteArrayList = new ArrayList<>();
        // ArrayList<Boolean> booleanArrayList = new ArrayList<>();
        // ArrayList<Character> charArrayList = new ArrayList<>();
        // ArrayList<Short> shortArrayList = new ArrayList<>();
        // ArrayList<Long> longArrayList = new ArrayList<>();
        // ArrayList<String> stringArrayList = new ArrayList<>();
        // ArrayList<Integer> integerArrayList = new ArrayList<>();
        // ArrayList<Float> floatArrayList = new ArrayList<>();
        // ArrayList<Double> doubleArrayList = new ArrayList<>();




// First Way:
        ArrayList<String> myArrayList1 = new ArrayList<>(Arrays.asList("one", "two", "three"));


// Second Way:
        ArrayList<String> myArrayList = new ArrayList<>();

        String[] myArray3 = new String[] {"one", "two", "three"};
        myArrayList.addAll(Arrays.asList(myArray3));


// Third Way:
        String[] myArray = new String[] {"one", "two", "three"};
        ArrayList<String> myArrayList2 = new ArrayList<>(Arrays.asList(myArray));






// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        // First:
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("Tuhin", "Sumon", "Nazrul"));
        System.out.println("String list is: " +arrayList1);

        // Second:
        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.addAll(Arrays.asList(a));
        arrayList2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +arrayList2);

        // Third:
        ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList(a));

        arrayList3.addAll(Arrays.asList(d));
        System.out.println("String list is: " +arrayList3);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        // First:
        ArrayList<Integer> arrayList4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Integer list is: " + arrayList4);

        // Second:
        ArrayList<Integer> arrayList5 = new ArrayList<>();

        arrayList5.addAll(Arrays.asList(myInteger1));
        arrayList5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + arrayList5);

        // Third:
        ArrayList<Integer> arrayList6 = new ArrayList<>(Arrays.asList(myInteger1));

        arrayList6.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + arrayList6);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        // First:
        ArrayList<Float> arrayList7 = new ArrayList<>(Arrays.asList(3.4f, 5.3f, 11.44f));
        System.out.println("Float list is: "+ arrayList7);

        // Second:
        ArrayList<Float> arrayList8 = new ArrayList<>();

        arrayList8.addAll(Arrays.asList(myFloat1));
        arrayList8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ arrayList8);

        // Third:
        ArrayList<Float> arrayList9 = new ArrayList<>(Arrays.asList(myFloat1));

        arrayList9.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ arrayList9);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        ArrayList<Character> arrayList10 = new ArrayList<>(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + arrayList10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        ArrayList<Boolean> arrayList11 = new ArrayList<>();
        arrayList11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + arrayList11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        ArrayList<Double> arrayList12 = new ArrayList<>(Arrays.asList(myDouble));
        System.out.println("Double list is: " + arrayList12);
    }
}
