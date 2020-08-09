package TreeMapBasic;

import java.util.*;

public class Basic {
    public static void display(){


////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////


// TreeMap:
        // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

            // TreeMap<String, String> numbers = new TreeMap<>();
            // TreeMap<String, Integer> numbers = new TreeMap<>();
            // TreeMap<Long, String> numbers = new TreeMap<>();
            // TreeMap<Float, String> numbers = new TreeMap<>();
            // TreeMap<String, Double> numbers = new TreeMap<>();
            // TreeMap<String, String> numbers = new TreeMap<>();
            // TreeMap<Float, String> numbers = new TreeMap<>();
            // TreeMap<Double, String> numbers = new TreeMap<>();
            // TreeMap<Float, String> numbers = new TreeMap<>();
            // TreeMap<String, Double> numbers = new TreeMap<>();


// First:
        TreeMap<String, String> numbers = new TreeMap<>();

        numbers.put("a", "Tuhin");
        numbers.put("b", "Nazrul");

        System.out.println(numbers);


// Second:
        TreeMap<String, String> newNum = new TreeMap<>(numbers);
        System.out.println(newNum);



    }
}




