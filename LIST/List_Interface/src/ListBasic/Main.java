package ListBasic;

import java.util.*;

public class Main {

// List extends Collection.

// List interface is an ordered collection that allows us to store and access elements sequentially.



// In order to use functionalities of the List interface, we can use these classes:
// List Interface:
        // ArrayList class
        // LinkedList class
        // Vector class
        // Stack class



    public static void main(String[] args) {
        ListInterfaceWithClass.display();
        Basic.display();
        Object.display();

        ListInterfaceWithoutClass.display();


/////////////////////////////////////////////////////////////////////////////
////////////////////////// List Interface with Class ////////////////////////
/////////////////////////////////////////////////////////////////////////////

// All Data Type:
        // ArrayList:
                // List myArrayList = new ArrayList();

        // LinkedList:
                // List myLinkedList = new LinkedList();

        // Vector:
                // List myVector = new Vector();

        // Stack:
                // List myStack = new Stack();


// Specific Data Type:
        // ArrayList:
                // List<Byte> byteArrayList = new ArrayList<>();
                // List<Boolean> booleanArrayList = new ArrayList<>();
                // List<Character> charArrayList = new ArrayList<>();
                // List<Short> shortArrayList = new ArrayList<>();
                // List<Long> longArrayList = new ArrayList<>();
                // List<String> stringArrayList = new ArrayList<>();
                // List<Integer> integerArrayList = new ArrayList<>();
                // List<Float> floatArrayList = new ArrayList<>();
                // List<Double> doubleArrayList = new ArrayList<>();

        // LinkedList:
                // List<Byte> byteArrayList = new LinkedList<>();
                // List<Boolean> booleanArrayList = new LinkedList<>();
                // List<Character> charArrayList = new LinkedList<>();
                // List<Short> shortArrayList = new LinkedList<>();
                // List<Long> longArrayList = new LinkedList<>();
                // List<String> stringArrayList = new LinkedList<>();
                // List<Integer> integerArrayList = new LinkedList<>();
                // List<Float> floatArrayList = new LinkedList<>();
                // List<Double> doubleArrayList = new LinkedList<>();

        // Vector:
                // List<Byte> byteArrayList = new Vector<>();
                // List<Boolean> booleanArrayList = new Vector<>();
                // List<Character> charArrayList = new Vector<>();
                // List<Short> shortArrayList = new Vector<>();
                // List<Long> longArrayList = new Vector<>();
                // List<String> stringArrayList = new Vector<>();
                // List<Integer> integerArrayList = new Vector<>();
                // List<Float> floatArrayList = new Vector<>();
                // List<Double> doubleArrayList = new Vector<>();

        // Stack:
                // List<Byte> byteArrayList = new Stack<>();
                // List<Boolean> booleanArrayList = new Stack<>();
                // List<Character> charArrayList = new Stack<>();
                // List<Short> shortArrayList = new Stack<>();
                // List<Long> longArrayList = new Stack<>();
                // List<String> stringArrayList = new Stack<>();
                // List<Integer> integerArrayList = new Stack<>();
                // List<Float> floatArrayList = new Stack<>();
                // List<Double> doubleArrayList = new Stack<>();

// Class Objects:
        // ArrayList:
                // List<Object> list=new ArrayList<Object>();

        // LinkedList:
                // List<Object> list=new LinkedList<Object>();

        // Vector:
                // List<Object> list=new Vector<Object>();

        // Stack:
                // List<Object> list=new Stack<Object>();



//////////////////////////////////////////////////////////////////////////////////
///////////////////////// List Interface without class ///////////////////////////
//////////////////////////////////////////////////////////////////////////////////

        // fixed size, we can't extends or reduce the list.
        // Provided Data Type: Arrays$ArrayLis
//--------------------------------------------------------------------------------

        List newList1 = new ArrayList(Arrays.asList("A", 343, 3.23f, 'm', false, 4.3434d));
        List<Float> newList2 = new ArrayList(Arrays.asList(3.34f, 546.343f, 231.34f));

// All Data Type:
        // List myList = Arrays.asList();

                // Example:
                        // List myList = Arrays.asList("A", 343, 3.23f, 'm', false, 4.3434d);
                                // or....................
                        // List myList = Arrays.asList(newList1);

// Specific Data Type:
        // List<Type> myList = Arrays.asList();

                // Example:
                        // List<String> myList = Arrays.asList("A", "B", "C");
                                // or...........
                        // List<Float> myList = Arrays.asList(newList2);



    }
}
