package HashMapBasic;

import java.util.*;

public class Basic {
    public static void display(){

///////////////////////////////////////////////////////////////////////////
////////////////////////////// All Data Type /////////////////////////////
///////////////////////////////////////////////////////////////////////////

// HashMap:
        // HashMap map = new HashMap();


        HashMap map = new HashMap();

        map.put(1, 343);
        map.put(2, "Tuhin");
        map.put("3", 767);
        map.put("4", "Nazrul");

        System.out.println(map);



////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// HashMap:
    // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

        // HashMap<String, String> numbers = new HashMap<>();
        // HashMap<Double, String> numbers = new HashMap<>();
        // HashMap<Integer, Float> numbers = new HashMap<>();
        // HashMap<String, String> numbers = new HashMap<>();
        // HashMap<String, Double> numbers = new HashMap<>();
        // HashMap<String, String> numbers = new HashMap<>();
        // HashMap<String, Double> numbers = new HashMap<>();
        // HashMap<Integer, String> numbers = new HashMap<>();
        // HashMap<String, String> numbers = new HashMap<>();
        // HashMap<Double, Float> numbers = new HashMap<>();


// First:
        HashMap<String, String> numbers = new HashMap<>();

        numbers.put("a", "Tuhin");
        numbers.put("b", "Nazrul");

        System.out.println(numbers);


// Second:
        HashMap<String, String> newNum = new HashMap<>(numbers);
        System.out.println(newNum);


    }
}

