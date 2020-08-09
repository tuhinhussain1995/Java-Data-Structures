package LinkedHashMapBasic;

import java.util.*;

public class Basic {
    public static void display(){

///////////////////////////////////////////////////////////////////////////
////////////////////////////// All Data Type /////////////////////////////
///////////////////////////////////////////////////////////////////////////

// LinkedHashMap:
        // LinkedHashMap map = new LinkedHashMap();


        LinkedHashMap map = new LinkedHashMap();

        map.put(1, 343);
        map.put(2, "Tuhin");
        map.put("3", 767);
        map.put("4", "Nazrul");

        System.out.println(map);



////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// LinkedHashMap:
    // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

        // LinkedHashMap<String, String> numbers = new LinkedHashMap<>();
        // LinkedHashMap<Double, String> numbers = new LinkedHashMap<>();
        // LinkedHashMap<Integer, Float> numbers = new LinkedHashMap<>();
        // LinkedHashMap<String, String> numbers = new LinkedHashMap<>();
        // LinkedHashMap<String, Double> numbers = new LinkedHashMap<>();
        // LinkedHashMap<String, String> numbers = new LinkedHashMap<>();
        // LinkedHashMap<String, Double> numbers = new LinkedHashMap<>();
        // LinkedHashMap<Integer, String> numbers = new LinkedHashMap<>();
        // LinkedHashMap<String, String> numbers = new LinkedHashMap<>();
        // LinkedHashMap<Double, Float> numbers = new LinkedHashMap<>();


// First:
        LinkedHashMap<String, String> numbers = new LinkedHashMap<>();

        numbers.put("a", "Tuhin");
        numbers.put("b", "Nazrul");

        System.out.println(numbers);


// Second:
        LinkedHashMap<String, String> newNum = new LinkedHashMap<>(numbers);
        System.out.println(newNum);



    }
}


