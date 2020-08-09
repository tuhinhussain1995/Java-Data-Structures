package EnumSetBasic;

import java.util.EnumSet;
import java.util.HashSet;

public class Basic {
    enum Size{
        Small,
        Medium,
        Large,
        ExtraLarge
    }

    public static void display(){

// allOf(Size): ------ The allOf() method creates an enum set that contains all the values of the specified enum type Size
        EnumSet<Size> allOfEnumSet = EnumSet.allOf(Size.class);
        System.out.println(allOfEnumSet);


// noneOf(Size): ------ noneOf() method creates an empty enum set.
        EnumSet<Size> noneOfEnumSet = EnumSet.noneOf(Size.class);
        System.out.println(noneOfEnumSet);


// range(e1, e2): ------ range() method creates an enum set containing all the values of an enum between e1 and e2 including both values.
        EnumSet<Size> rangeEnumSet = EnumSet.range(Size.Medium, Size.ExtraLarge);
        System.out.println(rangeEnumSet);


// of(e1, ....): ------- of() method creates an enum set containing the specified elements.
        EnumSet<Size> ofEnumSet = EnumSet.of(Size.Small, Size.Large);
        System.out.println(ofEnumSet);


// copyOf(EnumSet):
        EnumSet<Size> copyOfEnumSet = EnumSet.copyOf(allOfEnumSet);
        System.out.println(copyOfEnumSet);


// complementOf(EnumSet):
        EnumSet<Size> complementOfEnumSet = EnumSet.complementOf(allOfEnumSet);
        System.out.println(complementOfEnumSet);




///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// EnumSet:
        // EnumSet<Enum> myEnumSet = EnumSet.allOf(Enum.class);
                // or......................
        // EnumSet<Enum> myEnumSet = EnumSet.noneOf(Enum.class);
                // or......................
        // EnumSet<Enum> myEnumSet = EnumSet.range(Enum.Item);
                // or......................
        // EnumSet<Enum> myEnumSet = EnumSet.of(Enum.Item);
                // or......................
        // EnumSet<Enum> myEnumSet = EnumSet.copyOf(Set_EnumSet);
                // or......................
        // EnumSet<Enum> myEnumSet = EnumSet.complementOf(Set_EnumSet);


    }
}
