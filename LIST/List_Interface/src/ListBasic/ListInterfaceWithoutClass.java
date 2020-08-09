package ListBasic;

import java.util.*;

public class ListInterfaceWithoutClass {
    public static void display() {
        List<Integer> numbers = Arrays.asList(23, 5454, 2, 3, 767, 34, 87, 12, 5, 34);


// o=object, e=element, c=collection, a=array, i=index

        // java.util.List ================================================================================================>
                        // ======>  (List<Type> list = new ArrayList<>();)    or new ArrayList/LinkedList/Vector/Stack<>();
                        // ======>  (List list = new ArrayList<>();)          or new ArrayList/LinkedList/Vector/Stack<>();

                // get(i) ------------------ item data type  ==========> get element by following index number
                // set(i, e) --------------- previous item data type ==> change element by following index number
                // listIterator() ---------- listIterator =============> iterate the list item
                // listIterator(start i) --- listIterator =============> iterate the list item by following start index number
                // indexOf(o) -------------- int  =====================> print the exact index of the object
                // lastIndexOf(o) ---------- int ======================> print the exact index number of last object(multiple object can be same).
                // subList(start i, end i) - list =====================> copy the list by following stating and ending index number.
                // toString()  ------------- String ===================> return ArrayList as String.


        // java.util.Collection ===============================================================================>

                // size() ----------------- int ======================> size of the list, set, queue.
                // isEmpty()--------------- boolean ==================> check is the list is empty or not.
                // contains(o)------------- boolean ==================> check if the element is exist inside of the list or not.
                // iterator()-------------- iterator =================> iterate the list item
                // toArray()--------------- array ====================> convert List to array
                // toArray([])------------- array ====================> convert List to Array
                // containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
                // clear()----------------- void =====================> remove all the elements from the list and make it empty.
                // equals(o)--------------- boolean ==================> check if two list is equal or not.
                // hashCode()-------------- int  =====================> create a hash code
                // Stream() --------------- Stream ===================> Returns a sequential Stream with this collection as its source.
                // parallelStream() ------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.
                // Spliterator() ---------- Spliterator ==============> Creates a Spliterator over the elements in this collection.


        // java.lang.Iterable:
                // forEach(action) --------- void =====================> use for(java.util.Objects myVar : myList){}


        // Collections:
                // sort(list) -------------- void   ===================> arrange the list following ascending order.
                // replaceAll(list, find, replace) ---- void ==========> replace all the item of the list.
                // min() ------- inserted data type ========> find the minimum value
                // max() ------ inserted data type =========> find the maximum value
                // shuffle()  ------- void ==========> used to destroy any kind of order present in the data structure. It does just the opposite of the sorting.
                // reverse() --------- void ===========> reverses the order of elements
                // copy() ----------- void ============> creates a copy of elements from the specified source to destination
                // binarySearch() ------ int =========> searches for the specified element. It returns the position of the element in the specified collections. If not found return -1.
                // frequency() ------ int =========> returns the count of the number of times an element is present in the collection
                // disjoint() -------- boolean ========> checks if two collections contain some common element
                // indexOfSubList() --------- int ==============> Returns the starting position of the first occurrence of the specified target list.
                // lastIndexOfSubList() -------- int =============> Returns the starting position of the last occurrence of the specified target list.
                // fill() --------- void ==========> replace every element in a collection with the specified value

        

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////// List<Type> list = new ArrayList<>();    or new ArrayList/LinkedList/Vector/Stack<>(); ///////////
////////////// List list = new ArrayList<>();          or new ArrayList/LinkedList/Vector/Stack<>();   /////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.List ///////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////


// get(i) ------------------ item data type  ==========> get element by following index number
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(5));

        int a = numbers.get(6);
        System.out.println(a);

        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }


// set(i, e) --------------- previous item data type ==> change element by following index number
        numbers.set(0, 1111);
        System.out.println(numbers);

        numbers.set(3, 9999);
        System.out.println(numbers);


// listIterator() ---------- listIterator =============> iterate the list item
        ListIterator<Integer> listItr = numbers.listIterator();
        System.out.println("ListIterator");

        while (listItr.hasNext()){
            System.out.println(listItr.next());
        }

        while(listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }


// listIterator(start i) --- listIterator =============> iterate the list item by following start index number
        ListIterator<Integer> listItr2 = numbers.listIterator(3);
        System.out.println("ListIterator");

        while (listItr2.hasNext()){
            System.out.println(listItr2.next());
        }

        while(listItr2.hasPrevious()){
            System.out.println(listItr2.previous());
        }


// indexOf(o) -------------- int  =====================> print the exact index of the object
        System.out.println(numbers.indexOf(9999));


        int ac = numbers.indexOf(1111);
        System.out.println(ac);


// lastIndexOf(o) ---------- int ======================> print the exact index number of last object(multiple object can be same).
        System.out.println(numbers.lastIndexOf(20));


        int acc = numbers.lastIndexOf("A");
        System.out.println(acc);


// subList(start i, end i) - list =====================> copy the list by following stating and ending index number.
        ArrayList<Integer> myList3 = new ArrayList<>(numbers.subList(1, 4));
        System.out.println(myList3);


// toString()  ------------- String ===================> return ArrayList as String.
        System.out.println(numbers.toString());

        String myStr = numbers.toString();
        System.out.println(myStr);


//////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////// java.util.Collection  //////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////


// size() ----------------- int ======================> size of the list, set, queue.
        System.out.println("ArrayList size: "+ numbers.size());

        int myInt2 = numbers.size();
        System.out.println(myInt2);


// isEmpty()--------------- boolean ==================> check is the list is empty or not.
        boolean check = numbers.isEmpty();
        System.out.println(check);



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



// containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
        Vector<Integer> myIntList1 = new Vector<>(Arrays.asList(22, 33, 44, 55, 66));

        boolean myBoolean = numbers.containsAll(myIntList1);
        System.out.println(myBoolean);


// equals(o)--------------- boolean ==================> check if two list is equal or not.
        Vector<Integer> myIntList4 = new Vector<>(Arrays.asList(22, 33, 44, 55, 66));

        boolean myBoolean4 = numbers.equals(myIntList4);
        System.out.println(myBoolean4);


// hashCode()-------------- int  =====================> create a hash code
        System.out.println(numbers.hashCode());

        for(Integer x : numbers){
            System.out.println(x.hashCode());
        }


// Stream() --------------- Stream ===================> Returns a sequential Stream with this collection as its source.
        // import java.util.stream.*;
        // Go to Stream file.


// parallelStream() ------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.
        long count = numbers.parallelStream().filter(x -> x%2==0).count();

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
        List<Integer> number = Arrays.asList(2,3,4,5,6,7);
        number.stream().map(x->x*x).forEach(y->System.out.println(y));


////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////// Collections ////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////


// sort(list) -------------- void   ===================> arrange the list following ascending order.
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);


// replaceAll(list, find, replace) ---- void ==========> replace all the item of the list.
        List<String> al1 = Arrays.asList("A", "B", "A", "D");
        Collections.replaceAll(al1, "A", "Tuhin");
        System.out.println(al1);

        List<Integer> al2 = Arrays.asList(11, 22, 33, 11, 44);
        Collections.replaceAll(al2, 11, 2000);
        System.out.println(al2);


// min() ------- inserted data type ========> find the minimum value
        System.out.println(Collections.min(numbers));

        int ase = Collections.min(numbers);
        System.out.println(ase);


// max() ------ inserted data type =========> find the maximum value
        System.out.println(Collections.max(numbers));

        ase = Collections.max(numbers);
        System.out.println(ase);


// shuffle()  ------- void ==========> used to destroy any kind of order present in the data structure. It does just the opposite of the sorting.
        System.out.println(numbers);

        Collections.shuffle(numbers);

        System.out.println(numbers);


// reverse() --------- void ===========> reverses the order of elements
        Collections.reverse(numbers);


// copy() ----------- void ============> creates a copy of elements from the specified source to destination
        List<Integer> asdf = Arrays.asList();

        Collections.copy(numbers, asdf);
        System.out.println(asdf);


// binarySearch() ------ int =========> searches for the specified element. It returns the position of the element in the specified collections. If not found return -1.
        System.out.println(Collections.binarySearch(asdf, 33));

        int abc = Collections.binarySearch(asdf, 345);
        System.out.println(abc);


// frequency() ------ int =========> returns the count of the number of times an element is present in the collection
        System.out.println(Collections.frequency(numbers, 444));

        abc = Collections.binarySearch(numbers, 3434);
        System.out.println(abc);


// disjoint() -------- boolean ========> checks if two collections contain some common element
        System.out.println(Collections.disjoint(numbers, number));

        boolean myBo = Collections.disjoint(numbers, number);
        System.out.println(myBo);


// indexOfSubList() --------- int ==============> Returns the starting position of the first occurrence of the specified target list.
        System.out.println(Collections.indexOfSubList(numbers, number));

        int af = Collections.indexOfSubList(numbers, number);
        System.out.println(af);


// lastIndexOfSubList() -------- int =============> Returns the starting position of the last occurrence of the specified target list.
        System.out.println(Collections.lastIndexOfSubList(numbers, number));

        af = Collections.lastIndexOfSubList(numbers, number);
        System.out.println(af);


// fill() --------- void ==========> replace every element in a collection with the specified value
        Collections.fill(numbers, 0);


    }
}

