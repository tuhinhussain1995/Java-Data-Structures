package SortedMapBasic;

import java.util.*;

public class Basic {
    public static void display(){


////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// SortedMap:
        // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

            // SortedMap<String, String> numbers = new TreeMap<>();
            // SortedMap<String, Integer> numbers = new TreeMap<>();
            // SortedMap<Long, String> numbers = new TreeMap<>();
            // SortedMap<Float, String> numbers = new TreeMap<>();
            //  SortedMap<String, Double> numbers = new TreeMap<>();
            // SortedMap<String, String> numbers = new TreeMap<>();
            // SortedMap<Float, String> numbers = new TreeMap<>();
            // SortedMap<Double, String> numbers = new TreeMap<>();
            // SortedMap<Float, String> numbers = new TreeMap<>();
            // SortedMap<String, Double> numbers = new TreeMap<>();



// First:
        SortedMap<String, String> numbers = new TreeMap<>();

        numbers.put("a", "Tuhin");
        numbers.put("b", "Nazrul");

        System.out.println(numbers);


// Second:
        SortedMap<String, String> newNum = new TreeMap<>(numbers);
        System.out.println(newNum);



    }
}


