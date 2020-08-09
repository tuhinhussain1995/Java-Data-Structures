package EnumSetBasic;

import java.util.EnumSet;


// Collection ==> Set ==> EnumSet

// EnumSet class of the Java collections framework provides a set implementation of elements of a single enum.

// An enum set only stores enum values of a specific enum. Hence, the JVM already knows all the possible values of the set.


public class Main {
    public static void main(String[] args) {
        Basic.display();
        Methods.display();
    }
}



// All Data Type:
        // EnumSet:
                // // For EnumSet All data type is same as Specific data type. So better to follow Specific data type.


// Specific Data Type:
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



// Class Objects:
        // EnumSet:
                // EnumSet doesn't support class objects..................
