package ConcurrentHashMapBasic;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Basic {
    public static void display(){

////////////////////////////////////////////////////////////////////////
///////////////////// All Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// ConcurrentHashMap:
        // ConcurrentMap map = new ConcurrentHashMap();


        ConcurrentHashMap map = new ConcurrentHashMap();

        map.put(1, 343);
        map.put(2, "Tuhin");
        map.put("3", 767);
        map.put("4", "Nazrul");

        System.out.println(map);


////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////


// ConcurrentHashMap:
        // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

                // ConcurrentHashMap<String, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
                // ConcurrentHashMap<Long, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentHashMap<Float, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentHashMap<String, Double> numbers = new ConcurrentHashMap<>();
                // ConcurrentHashMap<String, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentHashMap<Float, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentHashMap<Double, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentHashMap<Float, String> numbers = new ConcurrentHashMap<>();
                // ConcurrentHashMap<String, Double> numbers = new ConcurrentHashMap<>();



// First:
        ConcurrentHashMap<String, String> numbers = new ConcurrentHashMap<>();
        numbers.put("a", "Tuhin");
        numbers.put("b", "Nazrul");

        System.out.println(numbers);


// Second:
        ConcurrentHashMap<String, String> newNum = new ConcurrentHashMap<>(numbers);
        System.out.println(newNum);



    }
}





