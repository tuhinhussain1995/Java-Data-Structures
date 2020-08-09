package DequeBasic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Methods {
    public static void display() {
        Deque<Integer> numbers = new LinkedList<>();      // or new LinkedList/ArrayDeque<>();

// o=object, e=element, c=collection, a=array, i=index

        // Deque  ==========================================================================================================================================>
                        // ======> Deque<Integer> numbers = new LinkedList<>();     // or new LinkedList/ArrayDeque<>();
                        // ======> Deque myVector = new LinkedList<>();             // or new LinkedList/ArrayDeque();
                        // ======> Deque<Object> list=new LinkedList<Object>();           // or new LinkedList/ArrayDeque<>();

                // addFirst(e) -------------- void ====================> Adds the specified element at the beginning of the deque. Throws an exception if the deque is full.
                // addLast(e) --------------- void ====================> Adds the specified element at the end of the deque. Throws an exception if the deque is full.
                // offerFirst(e) ------------ boolean =================> Adds the specified element at the beginning of the deque. Returns false if the deque is full.
                // offerLast(e) ------------- boolean =================> Adds the specified element at the end of the deque. Returns false if the deque is full.
                // removeFirst() ------------ removed item data type ==> Returns and removes the first element of the deque. Throws an exception if the deque is empty.
                // removeLast() ------------- removed item data type ==> Returns and removes the last element of the deque. Throws an exception if the deque is empty.
                // pollFirst() -------------- get item data type ======> Returns and removes the first element of the deque. Returns null if the deque is empty.
                // pollLast() --------------- get item data type ======> Returns and removes the last element of the deque. Returns null if the deque is empty.
                // getFirst() --------------- get item data type ======> Returns the first element of the deque. Throws an exception if the deque is empty.
                // getLast() ---------------- get item data type ======> Returns the last element of the deque. Throws an exception if the deque is empty.
                // peekFirst() -------------- get item data type ======> Returns the first element of the deque. Returns null if the deque is empty.
                // peekLast() --------------- get item data type ======> Returns the last element of the deque. Returns null if the deque is empty.
                // removeFirstOccurrence(o)-- removed item data type ==> remove the first occurrence if item occurs multiple time.
                // removeLastOccurrence(o) -- boolean =================> remove the last occurrence if item occurs multiple time.
                // push(e) ------------------ void ====================> add new item at last position at the Stack.
                // pop() -------------------- removed item data type ==> remove and get the last element of the Stack.
                // descendingIterator() ----- iterator ================> Returns an iterator that has the reverse order for this deque.


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



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////// Deque<Integer> numbers = new LinkedList<>();     // or new LinkedList/ArrayDeque<>(); ///////////////////
////////////// Deque myVector = new LinkedList<>();             // or new LinkedList/ArrayDeque(); /////////////////////
////////////// Deque<Object> list=new LinkedList<Object>();     // or new LinkedList/ArrayDeque<>(); ///////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////// java.util.Deque ////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        numbers.add(110);
        numbers.add(230);
        numbers.add(1);
        numbers.add(0);

// addFirst(e) -------------- void ====================> Adds the specified element at the beginning of the deque. Throws an exception if the deque is full.
        numbers.addFirst(54);
        numbers.addFirst(6454);


// addLast(e) --------------- void ====================> Adds the specified element at the end of the deque. Throws an exception if the deque is full.
        numbers.addLast(674);
        numbers.addLast(23);



// offerFirst(e) ------------ boolean =================> Adds the specified element at the beginning of the deque. Returns false if the deque is full.
        numbers.offerFirst(67);

        boolean isIta = numbers.offerFirst(324);
        System.out.println(isIta);


// offerLast(e) ------------- boolean =================> Adds the specified element at the end of the deque. Returns false if the deque is full.
        numbers.offerLast(667);

        isIta = numbers.offerLast(3435);
        System.out.println(isIta);


// removeFirst() ------------ removed item data type ==> Returns and removes the first element of the deque. Throws an exception if the deque is empty.
        numbers.removeFirst();

        int aer = numbers.removeFirst();
        System.out.println(aer);


// removeLast() ------------- removed item data type ==> Returns and removes the last element of the deque. Throws an exception if the deque is empty.
        numbers.removeLast();

        aer = numbers.removeLast();
        System.out.println(aer);


// pollFirst() -------------- get item data type ======> Returns and removes the first element of the deque. Returns null if the deque is empty.
        System.out.println(numbers.pollFirst());

        int myIntValee = numbers.pollFirst();
        System.out.println(myIntValee);


// pollLast() --------------- get item data type ======> Returns and removes the last element of the deque. Returns null if the deque is empty.
        System.out.println(numbers.pollLast());

        myIntValee = numbers.pollLast();
        System.out.println(myIntValee);


// getFirst() --------------- get item data type ======> Returns the first element of the deque. Throws an exception if the deque is empty.
        System.out.println(numbers.getFirst());

        int myIntVal5 = numbers.getFirst();
        System.out.println(myIntVal5);


// getLast() ---------------- get item data type ======> Returns the last element of the deque. Throws an exception if the deque is empty.
        System.out.println(numbers.getLast());

        int myIntVala = numbers.getLast();
        System.out.println(myIntVala);


// peekFirst() -------------- get item data type ======> Returns the first element of the deque. Returns null if the deque is empty.
        System.out.println(numbers.peekFirst());

        int myIntValaa = numbers.peekFirst();
        System.out.println(myIntValaa);


// peekLast() --------------- get item data type ======> Returns the last element of the deque. Returns null if the deque is empty.
        System.out.println(numbers.peekLast());

        myIntValaa = numbers.peekLast();
        System.out.println(myIntValaa);


// removeFirstOccurrence(o)-- removed item data type ==> remove the first occurrence if item occurs multiple time.
        numbers.removeFirstOccurrence(33);

        boolean wer = numbers.removeFirstOccurrence(6);
        System.out.println(wer);


// removeLastOccurrence(o) -- boolean =================> remove the last occurrence if item occurs multiple time.
        numbers.removeLastOccurrence(56);

        wer = numbers.removeLastOccurrence(465);
        System.out.println(wer);


// push(e) ------------------ void ====================> add new item at last position at the Stack.
        numbers.push(56);
        numbers.push(68);


// pop() -------------------- removed item data type ==> remove and get the last element of the Stack.
        numbers.pop();

        int afg = numbers.pop();
        System.out.println(afg);


// descendingIterator() ----- iterator ================> Returns an iterator that has the reverse order for this deque.
        Iterator value = numbers.descendingIterator();

        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }


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


        Deque<String> myAL = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        myAL.remove("B");
        myAL.remove(2);

// poll() ------------------- removed item data type ==> Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
        System.out.println(numbers.poll());

        int myIntVal = numbers.poll();
        System.out.println(myIntVal);


// element() ---------------- get item data type ======> get the first element from the deque.
        System.out.println(numbers.element());

        int ae = numbers.element();
        System.out.println(ae);


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

        Deque<String> myStringList = new LinkedList<>();
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
        Deque anotherList = new LinkedList(Arrays.asList("tuhin", 230, 45.234f, true, 'M', 656.343d));
        java.lang.Object sdf = anotherList.peek();

        numbers.remove(sdf);

        System.out.println(numbers);


// containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
        Deque<Integer> myIntList1 = new LinkedList<>(Arrays.asList(22, 33, 44, 55, 66));
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


        Deque<Integer> newIntList1 = new LinkedList<>(Arrays.asList(22, 33, 44, 55, 66));
        numbers.removeAll(newIntList1);
        System.out.println(numbers);


        newIntList1.removeAll(newIntList1);      // with itself
        System.out.println(newIntList1);


// removeIf(filter) ------- boolean  =================> remove the element by using filter
        numbers.removeIf((Integer i) -> i==33);          // We used lambda here.
        numbers.removeIf((Integer in) -> in > 5);     // We used lambda here.


// retainAll(c)------------ boolean  =================> remove all elements that is not similar.
        Deque<Integer> myList4 = new LinkedList<>(Arrays.asList(22, 33, 44, 55, 66));
        Integer[] newArray2 = {11, 22, 33};

        myList4.retainAll(Arrays.asList(newArray2));
        System.out.println(myList4);



        Deque<Integer> myList1 = new LinkedList<>(Arrays.asList(22, 33, 44, 55, 66));

        Integer[] myArray = new Integer[] {11, 22, 33, 77, 99};
        Deque<Integer> myList2 = new LinkedList<>(Arrays.asList(myArray));

        System.out.println(myList1);
        System.out.println(myList2);

        myList1.retainAll(myList2);

        System.out.println(myList1);
        System.out.println(myList2);


// clear()----------------- void =====================> remove all the elements from the list and make it empty.
        numbers.clear();
        System.out.println(numbers);


// equals(o)--------------- boolean ==================> check if two list is equal or not.
        Deque<Integer> myIntList4 = new LinkedList<>(Arrays.asList(22, 33, 44, 55, 66));
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
        Deque<String> strings = new LinkedList<>(Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl"));

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
        Deque<Integer> number = new LinkedList<>(Arrays.asList(2,3,4,5,6,7));

        number.stream().map(x->x*x).forEach(y->System.out.println(y));



    }
}


