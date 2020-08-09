package PriorityQueueBasic;

import java.util.*;

public class Methods {
    public static void display() {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

// o=object, e=element, c=collection, a=array, i=index

        // PriorityQueue  =================================================================================================>
                        // ======> PriorityQueue<Type> numbers = new PriorityQueue<>();
                        // ======> PriorityQueue myQueue = new PriorityQueue();
                        // ======> PriorityQueue<Object> list=new PriorityQueue<Object>();


        // Queue ===========================================================================================================>

                // offer(e) ------------ boolean =================> Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
                // remove() ------------ removed item data type ==> Returns and removes the head of the queue. Throws an exception if the queue is empty.
                // poll() -------------- removed item data type ==> Returns and removes the head of the queue. Returns null if the queue is empty.
                // element() ----------- get item data type ======> Returns the head of the queue. Throws an exception if the queue is empty.
                // peek() -------------- get item data type ======> Returns the head of the queue. Returns null if the queue is empty.


        // Collection ========================================================================================================>

                // add(e) -------------- boolean =================>  Inserts the specified element into the queue at the last position.. If the task is successful, add() returns true
                // size() --------------- int ====================> size of the queue
                // isEmpty() ------------ boolean ================> check is the list is empty or not.
                // contains(o) ---------- booean =================> check if the element is exist inside of the list or not.
                // iterator() ----------- iterator ===============> iterate the list item
                // toArray() ------------ Object =================> convert queue to array
                // toArray(array) ------- array ==================> convert queue to array
                // remove(o) ------------ boolean ================> remove element from list by following object.
                // containsAll(c) ------- boolean ================> check if the item collections is exist inside the list or not.
                // addAll(c) ------------ boolean ================> add all element to the list
                // removeAll(c) --------- boolean ================> remove all elements from list, that is similar.
                // retainAll(c) --------- boolean ================> remove all elements that is not similar.
                // clear() -------------- void ===================> remove all the elements from the list and make it empty.
                // equals(o) ------------ boolean ================> check if two list is equal or not.
                // toString()  ------------- String ===================> return ArrayList as String.
                // hashCode() ----------- int ====================> create a hash code
                // removeIf(filter) ----- boolean ================> remove the element by using filter
                // Stream() --------------- Stream ===================> Returns a sequential Stream with this collection as its source.
                // parallelStream() ------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.
                // Spliterator() ---------- Spliterator ==============> Creates a Spliterator over the elements in this collection.

        // Iterable =============================================================>
                // forEach(action) ------- void ==================> use for(java.util.Objects myVar : myList){}



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////// PriorityQueue<Type> numbers = new PriorityQueue<>();        //////////////////////////////////////////////////////////
/////////////// PriorityQueue myQueue = new PriorityQueue();              ///////////////////////////////////////////////////////////
/////////////// PriorityQueue<Object> list=new PriorityQueue<Object>();   ////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////// java.util.Queue ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        numbers.add(110);
        numbers.add(230);
        numbers.add(1);
        numbers.add(0);

// offer(e) ------------ boolean =================> Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
        numbers.offer(34);
        numbers.offer(3434);

        boolean isIt = numbers.offer(12);
        System.out.println(isIt);


// remove() ------------ removed item data type ==> Returns and removes the head of the queue. Throws an exception if the queue is empty.
        System.out.println(numbers.remove());

        int abd = numbers.remove();
        System.out.println(abd);


// poll() -------------- removed item data type ==> Returns and removes the head of the queue. Returns null if the queue is empty.
        System.out.println(numbers.poll());

        int myIntVal = numbers.poll();
        System.out.println(myIntVal);


// element() ----------- get item data type ======> Returns the head of the queue. Throws an exception if the queue is empty.
        System.out.println(numbers.element());

        int ae = numbers.element();
        System.out.println(ae);


// peek() -------------- get item data type ======> Returns the head of the queue. Returns null if the queue is empty.
        System.out.println(numbers.peek());

        myIntVal = numbers.peek();
        System.out.println(myIntVal);


////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// java.util.Collection ///////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////


// add(e) -------------- boolean =================>  Inserts the specified element into the queue at the last position.. If the task is successful, add() returns true
        numbers.add(110);
        numbers.add(230);
        numbers.add(1);
        numbers.add(0);

        System.out.println(numbers);

        boolean is = numbers.add(343545);
        System.out.println(is);


// size() ----------------- int ======================> size of the list, set, queue.
        System.out.println("ArrayList size: "+ numbers.size());

        int myInt2 = numbers.size();
        System.out.println(myInt2);


// isEmpty()--------------- boolean ==================> check is the list is empty or not.
        boolean check = numbers.isEmpty();
        System.out.println(check);

        PriorityQueue<String> myStringList = new PriorityQueue<>();
        System.out.println(myStringList.isEmpty());


// contains(o)------------- boolean ==================> check if the element is exist inside of the list or not.
        boolean myBool = numbers.contains(9999);
        System.out.println(myBool);


// iterator()-------------- iterator =================> iterate the list item
        Iterator<Integer> miter = numbers.iterator();
        while (miter.hasNext()){
            System.out.println(miter.next());
        }


// toArray()--------------- array ====================> convert List to array
        java.lang.Object[] myNewList = numbers.toArray();

        System.out.println(myNewList);


// toArray([])------------- array ====================> convert List to Array
        Integer[] myInt = new Integer[numbers.size()];
        myInt = numbers.toArray(myInt);
        System.out.println("toArray: "+ Arrays.toString(myInt));


// add(e)------------------ boolean  =================> add single element to the list
        numbers.add(110);
        numbers.add(230);
        numbers.add(1);
        numbers.add(0);

        System.out.println(numbers);


// remove(o)--------------- boolean  =================> remove element from list by following object.
        PriorityQueue anotherList = new PriorityQueue(Arrays.asList(22, 33, 44, 55, 66));
        java.lang.Object sdf = anotherList.peek();

        numbers.remove(sdf);

        System.out.println(numbers);


// containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
        PriorityQueue<Integer> myIntList1 = new PriorityQueue<>(Arrays.asList(22, 33, 44, 55, 66));
        Vector<Integer> myIntList2 = new Vector<>(Arrays.asList(22, 33, 44, 55, 66));

        boolean myBoolean = myIntList1.containsAll(myIntList2);
        System.out.println(myBoolean);

        myIntList1.remove(2);
        System.out.println(myIntList1.containsAll(myIntList2));


// addAll(c)--------------- boolean  =================> add all element to the list
        // First: (from value)
        numbers.addAll(Arrays.asList(3, 4, 5));
        System.out.println(numbers);

        // Second: (from array)
        Integer[] myInteger1 = new Integer[] { 10, 20, 30, 40 };
        numbers.addAll(Arrays.asList(myInteger1));
        System.out.println(numbers);

        // Third: (from List)
        List<Integer> myList = Arrays.asList(100, 200, 300);
        numbers.addAll(myList);
        System.out.println(numbers);

        // Forth: (from ArrayList)
        ArrayList<Integer> newIntList = new ArrayList<>(Arrays.asList(22, 33, 44, 55, 66));

        numbers.addAll(newIntList);
        System.out.println(numbers);

        // Fifth: (from LinkedList)
        LinkedList<Integer> mll = new LinkedList<>(Arrays.asList(22, 33, 44, 55, 66));

        numbers.addAll(mll);
        System.out.println(numbers);

        // Sixth: (from Vector)
        Vector<Integer> vi = new Vector<>(Arrays.asList(23, 232, 23));

        numbers.addAll(vi);
        System.out.println(numbers);


// removeAll(c) ----------- boolean  =================> remove all elements from list, that is similar.
        Integer[] newArray1 = {123, 456, 43};
        numbers.removeAll(Arrays.asList(newArray1));
        System.out.println(numbers);


        PriorityQueue<Integer> newIntList1 = new PriorityQueue<>(Arrays.asList(22, 33, 44, 55, 66));
        numbers.removeAll(newIntList1);
        System.out.println(numbers);


        newIntList1.removeAll(newIntList1);      // with itself
        System.out.println(newIntList1);


// removeIf(filter) ------- boolean  =================> remove the element by using filter
        numbers.removeIf((Integer i) -> i==33);          // We used lambda here.
        numbers.removeIf((Integer in) -> in > 5);     // We used lambda here.


// retainAll(c)------------ boolean  =================> remove all elements that is not similar.
        PriorityQueue<Integer> myList4 = new PriorityQueue<>(Arrays.asList(22, 33, 44, 55, 66));
        Integer[] newArray2 = {11, 22, 33};

        myList4.retainAll(Arrays.asList(newArray2));
        System.out.println(myList4);



        PriorityQueue<Integer> myList1 = new PriorityQueue<>(Arrays.asList(22, 33, 44, 55, 66));

        Integer[] myArray = new Integer[] {11, 22, 33, 77, 99};
        PriorityQueue<Integer> myList2 = new PriorityQueue<>(Arrays.asList(myArray));

        System.out.println(myList1);
        System.out.println(myList2);

        myList1.retainAll(myList2);

        System.out.println(myList1);
        System.out.println(myList2);


// clear()----------------- void =====================> remove all the elements from the list and make it empty.
        numbers.clear();
        System.out.println(numbers);


// equals(o)--------------- boolean ==================> check if two list is equal or not.
        PriorityQueue<Integer> myIntList4 = new PriorityQueue<>(Arrays.asList(22, 33, 44, 55, 66));
        Vector<Integer> myIntList5 = new Vector<>(Arrays.asList(22, 33, 44, 55, 66));

        boolean myBoolean4 = myIntList4.equals(myIntList5);
        System.out.println(myBoolean4);

        myIntList4.remove(2);
        System.out.println(myIntList4.equals(myIntList5));


// toString()  ------------- String ===================> return ArrayList as String.
        System.out.println(numbers.toString());

        String myStr = numbers.toString();
        System.out.println(myStr);


// hashCode()-------------- int  =====================> create a hash code
        System.out.println(numbers.hashCode());

        for(Integer x : numbers){
            System.out.println(x.hashCode());
        }


// Stream() --------------- Stream ===================> Returns a sequential Stream with this collection as its source.
        // import java.util.stream.*;
        // Go to Stream file and watch out.


// parallelStream() ------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.
        PriorityQueue<String> strings = new PriorityQueue<>(Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl"));

        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();

        System.out.println(count);


// Spliterator() ---------- Spliterator ==============> Creates a Spliterator over the elements in this collection.
        Spliterator<Integer> myNumbers = numbers.spliterator();

        System.out.println("Numbers are on the following:");

        myNumbers.forEachRemaining((n) -> System.out.println(n));


///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////  java.lang.Iterable  //////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////


// forEach(action) --------- void =====================> use for(java.util.Objects myVar : myList){}
        // First Way:
        numbers.forEach((n) -> System.out.println(n));

        // Second Way:
        PriorityQueue<Integer> number = new PriorityQueue<>(Arrays.asList(2,3,4,5,6,7));

        number.stream().map(x->x*x).forEach(y->System.out.println(y));



    }
}



