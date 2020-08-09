package BlockingQueueBasic;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class BasicArrayBlockingQueue {
    public static void display(){

//////////////////////////////////////////////////////////////////////////////////////
///////////////////////// All Data Type /////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


// ArrayBlockingQueue:
        // BlockingQueue myBQ = new ArrayBlockingQueue<>(1024);

// LinkedBlockingQueue:
        // BlockingQueue myBQ = new LinkedBlockingQueue<>(1024);


        BlockingQueue myVector = new ArrayBlockingQueue(1024);
        myVector.add("Tuhin");
        myVector.add(23);
        myVector.add(3.1416);
        myVector.add('c');
        myVector.add(true);

        System.out.println(myVector);


///////////////////////////////////////////////////////////////////////////////////
////////////////////////// Specific Data type //////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


// ArrayBlockingQueue:
        // BlockingQueue<Byte> byteBQ = new ArrayBlockingQueue<>(1024);
        // BlockingQueue<Boolean> booleanBQ = new ArrayBlockingQueue<>(1024);
        // BlockingQueue<Character> charBQ = new ArrayBlockingQueue<>(1024);
        // BlockingQueue<Short> shortBQ = new ArrayBlockingQueue<>(1024);
        // BlockingQueue<Long> longBQ = new ArrayBlockingQueue<>(1024);
        // BlockingQueue<String> myBQ = new ArrayBlockingQueue<>(1024);
        // BlockingQueue<Integer> integerBQ = new ArrayBlockingQueue<>(1024);
        // BlockingQueue<Float> floatBQ = new ArrayBlockingQueue<>(1024);
        // BlockingQueue<Double> doubleBQ = new ArrayBlockingQueue<>(1024);

// LinkedBlockingQueue:
        // BlockingQueue<Byte> byteBQ = new LinkedBlockingQueue<>(1024);
        // BlockingQueue<Boolean> booleanBQ = new LinkedBlockingQueue<>(1024);
        // BlockingQueue<Character> charBQ = new LinkedBlockingQueue<>(1024);
        // BlockingQueue<Short> shortBQ = new LinkedBlockingQueue<>(1024);
        // BlockingQueue<Long> longBQ = new LinkedBlockingQueue<>(1024);
        // BlockingQueue<String> myv = new LinkedBlockingQueue<>(1024);
        // BlockingQueue<Integer> integerBQ = new LinkedBlockingQueue<>(1024);
        // BlockingQueue<Float> floatBQ = new LinkedBlockingQueue<>(1024);
        // BlockingQueue<Double> doubleBQ = new LinkedBlockingQueue<>(1024);


// First Way:
        BlockingQueue<String> myList = new ArrayBlockingQueue<>(1024);
        String[] myArray3 = new String[] {"one", "two", "three"};
        myList.addAll(Arrays.asList(myArray3));




// String:

        String a[] = new String[] { "A", "B", "C", "D" };
        String d[] = new String[] { "I", "O"};

        BlockingQueue<String> list2 = new ArrayBlockingQueue<>(23);

        list2.addAll(Arrays.asList(a));
        list2.addAll(Arrays.asList(d));
        System.out.println("String list is: " +list2);


// Integer:

        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        Integer[] myInteger2 = new Integer[] { 1, 2, 3};

        BlockingQueue<Integer> list5 = new ArrayBlockingQueue<>(100);

        list5.addAll(Arrays.asList(myInteger1));
        list5.addAll(Arrays.asList(myInteger2));
        System.out.println("Integer list is: " + list5);


// Float:

        Float myFloat1[] = new Float[]{3.4f, 5.3f, 11.44f};
        Float myFloat2[] = new Float[]{66.32f, 53.3f};

        BlockingQueue<Float> list8 = new ArrayBlockingQueue<>(55);

        list8.addAll(Arrays.asList(myFloat1));
        list8.addAll(Arrays.asList(myFloat2));
        System.out.println("Float list is: "+ list8);


// Character:

        Character myCharacter[] = new Character[]{'A', 'E', 'I', 'O', 'U'};
        BlockingQueue<Character> list10 = new ArrayBlockingQueue<>(62);
        list10.addAll(Arrays.asList(myCharacter));
        System.out.println("Character list is: " + list10);

// Boolean:

        Boolean[] myBoolean = new Boolean[]{false, false, true, false};
        BlockingQueue<Boolean> list11 = new ArrayBlockingQueue<>(125);
        list11.addAll(Arrays.asList(myBoolean));
        System.out.println("Boolean list is: " + list11);

// Double:

        Double myDouble[] = new Double[]{44.34d, 656.34d, 3.232d};
        BlockingQueue<Double> list12 = new ArrayBlockingQueue<>(13);
        list12.addAll(Arrays.asList(myDouble));
        System.out.println("Double list is: " + list12);
    }
}

