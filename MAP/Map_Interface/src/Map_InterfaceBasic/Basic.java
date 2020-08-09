package Map_InterfaceBasic;

import java.util.*;

public class Basic {
    public static void display(){

///////////////////////////////////////////////////////////////////////////
////////////////////////////// All Data Type /////////////////////////////
///////////////////////////////////////////////////////////////////////////

// Map:
        // Map map = new HashMap();


        Map map = new HashMap();              // HashMap or LinkedHashMap or WeakHashMap

        map.put(1, 343);
        map.put(2, "Tuhin");
        map.put("3", 767);
        map.put("4", "Nazrul");

        System.out.println(map);



////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// Map:

    // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

        // Map<String, String> numbers = new HashMap<>();                  // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap
        // Map<Double, String> numbers = new HashMap<>();                  // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap
        // Map<Integer, Float> numbers = new HashMap<>();                  // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap
        // Map<String, String> numbers = new HashMap<>();                  // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap
        // Map<String, Double> numbers = new HashMap<>();                  // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap
        // Map<String, String> numbers = new HashMap<>();                  // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap
        // Map<String, Double> numbers = new HashMap<>();                  // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap
        // Map<Integer, String> numbers = new HashMap<>();                 // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap
        // Map<String, String> numbers = new HashMap<>();                  // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap
        // Map<Double, Float> numbers = new HashMap<>();                   // HashMap or LinkedHashMap or WeakHashMap or EnumMap or TreeMap



// First:
        Map<String, String> numbers = new HashMap<>();

        numbers.put("a", "Tuhin");
        numbers.put("b", "Nazrul");

        System.out.println(numbers);


// Second:
        Map<String, String> newNum = new HashMap<>(numbers);
        System.out.println(newNum);



    }
}
