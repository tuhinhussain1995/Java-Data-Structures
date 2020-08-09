package ConcurrentMapBasic;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Basic {
    public static void display(){

////////////////////////////////////////////////////////////////////////
///////////////////// All Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// ConcurrentMap:
        // ConcurrentMap map = new ConcurrentHashMap();

        ConcurrentMap map = new ConcurrentHashMap();

        map.put(1, 343);
        map.put(2, "Tuhin");
        map.put("3", 767);
        map.put("4", "Nazrul");

        System.out.println(map);


////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////


// ConcurrentMap:
        // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

                // ConcurrentMap<String, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>();
                // ConcurrentMap<Long, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentMap<Float, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentMap<String, Double> numbers = new ConcurrentHashMap<>();
                // ConcurrentMap<String, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentMap<Float, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentMap<Double, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentMap<Float, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentMap<String, Double> numbers = new ConcurrentHashMap<>();



// First:
        ConcurrentMap<String, String> numbers = new ConcurrentHashMap<>();

        numbers.put("a", "Tuhin");
        numbers.put("b", "Nazrul");

        System.out.println(numbers);


// Second:
        ConcurrentMap<String, String> newNum = new ConcurrentHashMap<>(numbers);
        System.out.println(newNum);



    }
}




