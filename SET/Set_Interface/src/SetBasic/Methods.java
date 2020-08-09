package SetBasic;

import java.util.*;

public class Methods {
    public static void display() {
        Set<Integer> numbers = new HashSet<>();      // or new HashSet/LinkedHashSet/TreeSet<>();


// o=object, e=element, c=collection, a=array, i=index

        // java.util.Set ===============================================================================================>
                        // ======> Set<Type> mySet = new HashSet<>();              or new HashSet/LinkedHashSet/TreeSet<>();
                        // ======> Set mySet = new HashSet();                      or new HashSet/LinkedHashSet/TreeSet();
                        // ======> Set<Object> myList=new HashSet<Object>();    // or new HashSet/LinkedHashSet<Object>();
        
                // No Methods.............


        // java.util.Collection ===============================================================================>

                // size() ----------------- int ======================> size of the list, set, queue.
                // isEmpty()--------------- boolean ==================> check is the list is empty or not.
                // contains(o)------------- boolean ==================> check if the element is exist inside of the list or not.
                // iterator()-------------- iterator =================> iterate the list item
                // toArray()--------------- array ====================> convert List to array
                // toArray([])------------- array ====================> convert List to Array
                // add(e)------------------ boolean  =================> add single element to the list
                // remove(o)--------------- boolean  =================> remove element from list by following object.
                // containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
                // addAll(c)--------------- boolean  =================> add all element to the list
                // removeAll(c) ----------- boolean  =================> remove all elements from list, that is similar.
                // retainAll(c)------------ boolean  =================> remove all elements that is not similar.
                // clear()----------------- void =====================> remove all the elements from the list and make it empty.
                // equals(o)--------------- boolean ==================> check if two list is equal or not.
                // toString()  ------------- String ===================> return ArrayList as String.
                // hashCode()-------------- int  =====================> create a hash code
                // removeIf(filter) -------- boolean  =================> remove the element by using filter
                // Stream() ---------------- Stream ===================> Returns a sequential Stream with this collection as its source.
                // parallelStream() -------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.
                // Spliterator() ----------- Spliterator ==============> Creates a Spliterator over the elements in this collection.


        // java.lang.Iterable:
                // forEach(action) --------- void =====================> use for(java.util.Objects myVar : myList){}




///////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////

// Union Set ---> to get the union of two sets x and y, we can use ===> x.addAll(y)
// Intersection Set ---> to get the intersection of two sets x and y, we can use ===> x.retainAll(y)
// Subset Set ---> to check if x is a subset of y, we can use ===> y.containsAll(x)
// Difference Set ---> removeAll() is used to difference among two.====> x.removeAll(y)

//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.Set ///////////////////////////////////////////////////
//////// (Set<Type> mySet = new HashSet<>();)    or new HashSet/LinkedHashSet/TreeSet<>();
//////// (Set mySet = new HashSet();)          or new LinkedHashSet/TreeSet();
///////////////////////////////////////////////////////////////////////////////////////////////////

        numbers.add(34);
        numbers.add(56);
        numbers.add(6565);


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

        Set<String> myStringList = new HashSet<>();      // or new HashSet/LinkedHashSet/TreeSet<>();
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
        Set anotherList = new HashSet<>(Arrays.asList("tuhin", 230, 45.234f, true, 'M', 656.343d));      // or new HashSet/LinkedHashSet/TreeSet<>();
        java.lang.Object sdf = 230;

        numbers.remove(sdf);

        System.out.println(numbers);


// containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
        Set<Integer> myIntList1 = new HashSet<>(Arrays.asList(22, 33, 44, 55, 66));      // or new HashSet/LinkedHashSet/TreeSet<>();
        Set<Integer> myIntList2 = new HashSet<>(Arrays.asList(22, 33, 44, 55, 66));      // or new HashSet/LinkedHashSet/TreeSet<>();

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
        HashSet<Integer> vi = new HashSet<>(Arrays.asList(23, 232, 23));

        numbers.addAll(vi);
        System.out.println(numbers);


// removeAll(c) ----------- boolean  =================> remove all elements from list, that is similar.
        Integer[] newArray1 = {123, 456, 43};
        numbers.removeAll(Arrays.asList(newArray1));
        System.out.println(numbers);


        List<Integer> newList = Arrays.asList(34, 35, 36);
        numbers.removeAll(newList);
        System.out.println(numbers);



        ArrayList<Integer> newIntList1 = new ArrayList<>(Arrays.asList(22, 33, 44, 55, 66));
        numbers.removeAll(newIntList1);
        System.out.println(numbers);



        newIntList1.removeAll(newIntList1);      // with itself
        System.out.println(newIntList1);


// retainAll(c)------------ boolean  =================> remove all elements that is not similar.
        Set<Integer> myList4 = new HashSet<>(Arrays.asList(22, 33, 44, 55, 66));      // or new HashSet/LinkedHashSet/TreeSet<>();
        Integer[] newArray2 = {11, 22, 33};

        myList4.retainAll(Arrays.asList(newArray2));
        System.out.println(myList4);



        Set<Integer> myList1 = new HashSet<>(Arrays.asList(22, 33, 44, 55, 66));      // or new HashSet/LinkedHashSet/TreeSet<>();

        Integer[] myArray = new Integer[] {11, 22, 33, 77, 99};
        ArrayList<Integer> myList2 = new ArrayList<>(Arrays.asList(myArray));

        System.out.println(myList1);
        System.out.println(myList2);

        myList1.retainAll(myList2);

        System.out.println(myList1);
        System.out.println(myList2);


// clear()----------------- void =====================> remove all the elements from the list and make it empty.
        numbers.clear();
        System.out.println(numbers);


// equals(o)--------------- boolean ==================> check if two list is equal or not.
        Set<Integer> myIntList4 = new HashSet<>(Arrays.asList(22, 33, 44, 55, 66));      // or new HashSet/LinkedHashSet/TreeSet<>();
        Set<Integer> myIntList5 = new HashSet<>(Arrays.asList(22, 33, 44, 55, 66));      // or new HashSet/LinkedHashSet/TreeSet<>();

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


// removeIf(filter) ------- boolean  =================> remove the element by using filter
        Set<String> myAL = new HashSet<>(Arrays.asList("A", "B", "C", "D", "E"));      // or new HashSet/LinkedHashSet/TreeSet<>();

        myAL.removeIf((String i) -> i=="D");          // We used lambda here.
        numbers.removeIf((Integer in) -> in > 5);     // We used lambda here.


// Stream() --------------- Stream ===================> Returns a sequential Stream with this collection as its source.
        // import java.util.stream.*;
        // Go to Stream file and watch out.


// parallelStream() ------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.
        Set<String> strings = new HashSet<>(Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl"));      // or new HashSet/LinkedHashSet/TreeSet<>();

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
        Set<Integer> number = new HashSet<>(Arrays.asList(2,3,4,5,6,7));      // or new HashSet/LinkedHashSet/TreeSet<>();

        number.stream().map(x->x*x).forEach(y->System.out.println(y));



    }
}
