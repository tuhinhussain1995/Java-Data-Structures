package NavigableMapBasic;

import java.util.*;

public class Basic {
    public static void display(){


////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// NavigableMap:
        // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

        // NavigableMap<String, String> numbers = new TreeMap<>();
        // NavigableMap<String, Integer> numbers = new TreeMap<>();
        // NavigableMap<Long, String> numbers = new TreeMap<>();
        // NavigableMap<Float, String> numbers = new TreeMap<>();
        // NavigableMap<String, Double> numbers = new TreeMap<>();
        // NavigableMap<String, String> numbers = new TreeMap<>();
        // NavigableMap<Float, String> numbers = new TreeMap<>();
        // NavigableMap<Double, String> numbers = new TreeMap<>();
        // NavigableMap<Float, String> numbers = new TreeMap<>();
        // NavigableMap<String, Double> numbers = new TreeMap<>();



// First:
        NavigableMap<String, String> numbers = new TreeMap<>();

        numbers.put("a", "Tuhin");
        numbers.put("b", "Nazrul");

        System.out.println(numbers);


// Second:
        NavigableMap<String, String> newNum = new TreeMap<>(numbers);
        System.out.println(newNum);



    }
}



