package SetBasic;
import java.util.*;


// Set extends Collection.


// The Set interface allows us to store elements in different sets similar to the set in mathematics. It cannot have duplicate elements.

// Both the List interface and the Set interface inherits the Collection interface.



// In order to use functionalities of the Set interface, we can use these classes:
// These classes are defined in the Collections framework and implement the Set interface.
// Set Interface:
        // HashSet class
        // LinkedHashSet class
        // EnumSet class
        // TreeSet class


// The Set interface is also extended by these sub interfaces:
// SortedSet Interface:
        // TreeSet  class
// NavigableSet Interface:
        // TreeSet class


public class Main {
    public static void main(String[] args) {

        Basic.display();
        Methods.display();
        Object.display();

        TreeSetObject.display();

        SetWithEnumSetClass.display();
        
        SetWithEnumSetClass.display3();
        SetWithEnumSetClass.display4();

    }



// All Data Type:
        // HashSet:
                // Set myHashSet = new HashSet();

        // LinkedHashSet:
                // Set myLinkedHashSet = new LinkedHashSet();

        // TreeSet:
                // TreeSet doesn't support All data type.................

        // EnumSet:
                // For EnumSet All data type is same as Specific data type. So better to follow Specific data type.


// Specific Data Type:
        // HashSet:
                // Set<Byte> byteHashSet = new HashSet<>();
                // Set<Boolean> booleanHashSet = new HashSet<>();
                // Set<Character> charHashSet = new HashSet<>();
                // Set<Short> shortHashSet = new HashSet<>();
                // Set<Long> longHashSet = new HashSet<>();
                // Set<String> stringHashSet = new HashSet<>();
                // Set<Integer> integerHashSet = new HashSet<>();
                // Set<Float> floatHashSet = new HashSet<>();
                // Set<Double> doubleHashSet = new HashSet<>();

        // LinkedHashSet:
                // Set<Byte> byteLinkedHashSet = new LinkedHashSet<>();
                // Set<Boolean> booleanLinkedHashSet = new LinkedHashSet<>();
                // Set<Character> charLinkedHashSet = new LinkedHashSet<>();
                // Set<Short> shortLinkedHashSet = new LinkedHashSet<>();
                // Set<Long> longLinkedHashSet = new LinkedHashSet<>();
                // Set<String> stringLinkedHashSet = new LinkedHashSet<>();
                // Set<Integer> integerLinkedHashSet = new LinkedHashSet<>();
                // Set<Float> floatLinkedHashSet = new LinkedHashSet<>();
                // Set<Double> doubleLinkedHashSet = new LinkedHashSet<>();

        // TreeSet:
                // Set<Byte> byteTreeSet = new TreeSet<>();
                // Set<Boolean> booleanTreeSet = new TreeSet<>();
                // Set<Character> charTreeSet = new TreeSet<>();
                // Set<Short> shortTreeSet = new TreeSet<>();
                // Set<Long> longTreeSet = new TreeSet<>();
                // Set<String> stringTreeSet = new TreeSet<>();
                // Set<Integer> integerTreeSet = new TreeSet<>();
                // Set<Float> floatTreeSet = new TreeSet<>();
                // Set<Double> doubleTreeSet = new TreeSet<>();

        // EnumSet:
                // Set<Enum> myEnumSet = EnumSet.allOf(Enum.class);
                        // or......................
                // Set<Enum> myEnumSet = EnumSet.noneOf(Enum.class);
                        // or......................
                // Set<Enum> myEnumSet = EnumSet.range(Enum.Item);
                        // or......................
                // Set<Enum> myEnumSet = EnumSet.of(Enum.Item);
                        // or......................
                // Set<Enum> myEnumSet = EnumSet.copyOf(Set_EnumSet);
                        // or......................
                // Set<Enum> myEnumSet = EnumSet.complementOf(Set_EnumSet);



// Class Objects:
        // HashSet:
                // Set<Object> list = new HashSet<Object>();

        // LinkedHashSet:
                // Set<Object> list = new LinkedHashSet<Object>();

        // TreeSet:
                // Set<Object> set = new TreeSet<Object>();

        // EnumSet:
                // EnumSet doesn't support class objects..................


}
