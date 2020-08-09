package LinkedBlockingQueueBasic;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Methods {
    public static void display() throws InterruptedException {
        LinkedBlockingQueue<Integer> numbers = new LinkedBlockingQueue<>();


// o=object, e=element, c=collection, a=array, i=index

        // LinkedBlockingQueue  ==========================================================================================================================================>
                        // ======> LinkedBlockingQueue<Integer> numbers = new LinkedBlockingQueue<>();
                        // ======> LinkedBlockingQueue myBQ = new LinkedBlockingQueue<>();
                        // ======> LinkedBlockingQueue<Object> list=new LinkedBlockingQueue<Object>();



        // BlockingQueue  ==========================================================================================================================================>

                // put(e) ------------------- void  ==============> Inserts an element to the blocking queue. If the queue is full, it will wait until the queue has space to insert an element.
                // take() ------------------- removed data type ==> Removes and returns an element from the blocking queue. If the queue is empty, it will wait until the queue has elements to be deleted.
                // poll() ------------------- removed data type ======> The poll() method of LinkedBlockingQueue returns the head of LinkedBlockingQueue by removing that element from queue.
                // poll(timeOut, unit) ------ removed data type ======> retrieves and removes element from head. If queue is empty, then poll() method will wait till a specified time for an element to become available.
                // remainingCapacity() ------ int =====================> returns the number of more elements that can be added to BlockingQueue without blocking.
                // drainTo(c) --------------- int =====================>  removes all available elements from this LinkedBlocking Queue and adds them to the given collection passed as a parameter.


        // Queue =========================================================================================================================================>

                // offer(e) ----------------- boolean =================> Adds an element to the tail and returns a boolean to explain if the insertion was successful.
                // remove() ----------------- removed item data type ==> remove first element of the deque.
                // poll() ------------------- removed item data type ==> Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
                // element() ---------------- get item data type ======> get the first element from the deque.
                // peek() ------------------- get item data type ======> get the last element of the Stack


        // Collection ==================================================================================================================================>

                // add(e) ------------------- added element data type==> Adds an element to the tail.
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
                // Stream() ------------- Stream =================> Returns a sequential Stream with this collection as its source.
                // parallelStream() ----- Stream =================> Returns a possibly parallel Stream with this collection as its source.
                // Spliterator() -------- Spliterator ============> Creates a Spliterator over the elements in this collection.


        // Iterable =========================================================================================================================>

                // forEach(action) ------- void ==================> use for(java.util.Objects myVar : myList){}



///////////////////////////////////////////////////////////////////////////////////////////////////////
////////////// LinkedBlockingQueue<Integer> numbers = new LinkedBlockingQueue<>();  ///////////////////
////////////// LinkedBlockingQueue myBQ = new LinkedBlockingQueue<>(); //////////////////////////////////
////////////// LinkedBlockingQueue<Object> list=new LinkedBlockingQueue<Object>();  ///////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////// java.util.BlockingQueue ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        numbers.add(110);
        numbers.add(230);
        numbers.add(1);
        numbers.add(0);
        numbers.add(120);
        numbers.add(2336);

// put(e) ------------------- void  ==============> Inserts an element to the blocking queue. If the queue is full, it will wait until the queue has space to insert an element.
        numbers.put(343);
        numbers.put(45);


// take() ------------------- removed data type ==> Removes and returns an element from the blocking queue. If the queue is empty, it will wait until the queue has elements to be deleted.
        System.out.println(numbers.take());

        int ae = numbers.take();
        System.out.println(ae);


// poll() ------------------- removed data type ======> The poll() method of LinkedBlockingQueue returns the head of LinkedBlockingQueue by removing that element from queue.
        System.out.println(numbers.poll());

        int abd = numbers.poll();
        System.out.println(abd);


// poll(timeOut, unit) ------ removed data type ======> retrieves and removes element from head. If queue is empty, then poll() method will wait till a specified time for an element to become available.
        // timeout– how long to wait, in units of unit.
        // unit– a TimeUnit for the timeout parameter.

        System.out.println(numbers.poll(5, TimeUnit.SECONDS));

        int abdd = numbers.poll(4, TimeUnit.SECONDS);
        System.out.println(abdd);

// remainingCapacity() ------ int =====================> returns the number of more elements that can be added to BlockingQueue without blocking.
        System.out.println(numbers.remainingCapacity());

        int aer = numbers.remainingCapacity();
        System.out.println(aer);


// drainTo(c) --------------- int =====================>  removes all available elements from this LinkedBlocking Queue and adds them to the given collection passed as a parameter.
        LinkedBlockingQueue<Integer> numb = new LinkedBlockingQueue<>();

        numbers.drainTo(numb);
        System.out.println(numb);


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////// java.util.Queue ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// offer(e) ----------------- boolean =================> Adds an element to the tail and returns a boolean to explain if the insertion was successful.
        numbers.offer(34);
        numbers.offer(3434);

        boolean isIt = numbers.offer(12);
        System.out.println(isIt);


// remove() ----------------- removed item data type ==> remove first element of the deque.
        numbers.remove(3);
        System.out.println(numbers);

        boolean b = numbers.remove(230);
        System.out.println(b);


        LinkedBlockingQueue<String> myAL = new LinkedBlockingQueue<>();
        myAL.addAll(Arrays.asList("A", "B", "C", "D", "E"));
        myAL.remove("B");
        myAL.remove(2);

// poll() ------------------- removed item data type ==> Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
        System.out.println(numbers.poll());

        int myIntVal = numbers.poll();
        System.out.println(myIntVal);


// element() ---------------- get item data type ======> get the first element from the deque.
        System.out.println(numbers.element());

        int ade = numbers.element();
        System.out.println(ade);


// peek() ------------------- get item data type ======> get the last element of the Stack
        System.out.println(numbers.peek());

        int myIntValr = numbers.peek();
        System.out.println(myIntValr);


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

        LinkedBlockingQueue<String> myStringList = new LinkedBlockingQueue<>();
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
        LinkedBlockingQueue anotherList = new LinkedBlockingQueue();
        anotherList.addAll(Arrays.asList("tuhin", 230, 45.234f, true, 'M', 656.343d));
        java.lang.Object sdf = anotherList.peek();

        numbers.remove(sdf);

        System.out.println(numbers);


// containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
        LinkedBlockingQueue<Integer> myIntList1 = new LinkedBlockingQueue<>();
        myIntList1.addAll(Arrays.asList(22, 33, 44, 55, 66));
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


        LinkedBlockingQueue<Integer> newIntList1 = new LinkedBlockingQueue<>();
        newIntList1.addAll(Arrays.asList(22, 33, 44, 55, 66));
        numbers.removeAll(newIntList1);
        System.out.println(numbers);


        newIntList1.removeAll(newIntList1);      // with itself
        System.out.println(newIntList1);


// removeIf(filter) ------- boolean  =================> remove the element by using filter
        numbers.removeIf((Integer i) -> i==33);          // We used lambda here.
        numbers.removeIf((Integer in) -> in > 5);     // We used lambda here.


// retainAll(c)------------ boolean  =================> remove all elements that is not similar.
        LinkedBlockingQueue<Integer> myList4 = new LinkedBlockingQueue<>();
        myList4.addAll(Arrays.asList(22, 33, 44, 55, 66));
        Integer[] newArray2 = {11, 22, 33};

        myList4.retainAll(Arrays.asList(newArray2));
        System.out.println(myList4);



        LinkedBlockingQueue<Integer> myList1 = new LinkedBlockingQueue<>();
        myList1.addAll(Arrays.asList(22, 33, 44, 55, 66));

        Integer[] myArray = new Integer[] {11, 22, 33, 77, 99};
        LinkedBlockingQueue<Integer> myList2 = new LinkedBlockingQueue<>();
        myList2.addAll(Arrays.asList(myArray));

        System.out.println(myList1);
        System.out.println(myList2);

        myList1.retainAll(myList2);

        System.out.println(myList1);
        System.out.println(myList2);


// clear()----------------- void =====================> remove all the elements from the list and make it empty.
        numbers.clear();
        System.out.println(numbers);


// equals(o)--------------- boolean ==================> check if two list is equal or not.
        LinkedBlockingQueue<Integer> myIntList4 = new LinkedBlockingQueue<>();
        myIntList4.addAll(Arrays.asList(22, 33, 44, 55, 66));
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
        LinkedBlockingQueue<String> strings = new LinkedBlockingQueue<>();
        strings.addAll(Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl"));

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
        LinkedBlockingQueue<Integer> number = new LinkedBlockingQueue<>();
        number.addAll(Arrays.asList(2,3,4,5,6,7));

        number.stream().map(x->x*x).forEach(y->System.out.println(y));



    }
}





