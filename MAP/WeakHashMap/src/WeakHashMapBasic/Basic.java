package WeakHashMapBasic;

import java.util.*;

public class Basic {
    public static void display(){

///////////////////////////////////////////////////////////////////////////
////////////////////////////// All Data Type /////////////////////////////
///////////////////////////////////////////////////////////////////////////

// WeakHashMap:
        // WeakHashMap map = new WeakHashMap();


        WeakHashMap map = new WeakHashMap();

        map.put(1, 343);
        map.put(2, "Tuhin");
        map.put("3", 767);
        map.put("4", "Nazrul");

        System.out.println(map);



////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// WeakHashMap:
        // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

        // WeakHashMap<String, String> numbers = new WeakHashMap<>();
        // WeakHashMap<Double, String> numbers = new WeakHashMap<>();
        // WeakHashMap<Integer, Float> numbers = new WeakHashMap<>();
        // WeakHashMap<String, String> numbers = new WeakHashMap<>();
        // WeakHashMap<String, Double> numbers = new WeakHashMap<>();
        // WeakHashMap<String, String> numbers = new WeakHashMap<>();
        // WeakHashMap<String, Double> numbers = new WeakHashMap<>();
        // WeakHashMap<Integer, String> numbers = new WeakHashMap<>();
        // WeakHashMap<String, String> numbers = new WeakHashMap<>();
        // WeakHashMap<Double, Float> numbers = new WeakHashMap<>();


// First:
        WeakHashMap<String, String> numbers = new WeakHashMap<>();

        numbers.put("a", "Tuhin");
        numbers.put("b", "Nazrul");

        System.out.println(numbers);


// Second:
        WeakHashMap<String, String> newNum = new WeakHashMap<>(numbers);
        System.out.println(newNum);



    }
}


