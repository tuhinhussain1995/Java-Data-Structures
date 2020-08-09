package EnumMapBasic;

import java.util.*;

public class Basic {
    public static void display(){


////////////////////////////////////////////////////////////////////////
///////////////////// Specific Data type ////////////////////////////
/////////////////////////////////////////////////////////////////////////

// EnumMap:
        // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

            // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
            // EnumMap<Size, String> sizes1 = new EnumMap<>(Size.class);
            // EnumMap<Size, Double> sizes1 = new EnumMap<>(Size.class);
            // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
            // EnumMap<Size, Float> sizes1 = new EnumMap<>(Size.class);
            // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
            // EnumMap<Size, Short> sizes1 = new EnumMap<>(Size.class);
            // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
            // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
            // EnumMap<Size, Boolean> sizes1 = new EnumMap<>(Size.class);


// First:
        EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);

        sizes1.put(Size.LARGE, 36);
        sizes1.put(Size.MEDIUM, 33);

        System.out.println(sizes1);



// Second:
        EnumMap<Size, Integer> newNum = new EnumMap<>(sizes1);
        System.out.println(newNum);


    }
}


