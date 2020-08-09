package SetBasic;
import java.util.*;

public class SetWithEnumSetClass {
    enum days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }


/////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// Specific Data Type ////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////

    public static void display3(){
        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:"+set1);

        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:"+set2);
    }


    public static void display4(){
        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);

        Iterator<days> iter = set.iterator();

        while (iter.hasNext())
            System.out.println(iter.next());
    }

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



/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////  Methods //////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////


    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRALARGE
    }

    public static void display(){
        Set<Size> sizes1 = EnumSet.allOf(Size.class);
        Set<Size> sizes2 = EnumSet.noneOf(Size.class);


// o=object, e=element, c=collection, a=array, i=index

        // java.util.Set ===============================================================================================>
                        // ======> (Set<Type> mySet = new HashSet<>();)    or new HashSet/LinkedHashSet/TreeSet<>();
                        // ======> (Set mySet = new HashSet();)          or new HashSet/LinkedHashSet/TreeSet();

                // No Methods...............


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

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////// java.util.Set  //////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////


        // No Methods..............


//////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////// java.util.Collection  //////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////


// size() ----------------- int ======================> size of the list, set, queue.
        System.out.println(sizes1.size());


// isEmpty()--------------- boolean ==================> check is the list is empty or not.
        System.out.println(sizes1.isEmpty());

        boolean myBool7 = sizes2.isEmpty();
        System.out.println(myBool7);


// contains(o)------------- boolean ==================> check if the element is exist inside of the list or not.
        System.out.println(sizes1.contains(Size.valueOf("MEDIUM")));

        boolean myBool = sizes1.contains(Size.LARGE);
        System.out.println(myBool);


// iterator()-------------- iterator =================> iterate the list item
        Iterator<Size> iterate = sizes1.iterator();

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }


// toArray()--------------- array ====================> convert List to array
        java.lang.Object[] myNewList = sizes1.toArray();

        System.out.println(myNewList);


// toArray([])------------- array ====================> convert List to Array
        Size[] myStringArray = new Size[sizes1.size()];
        myStringArray = sizes1.toArray(myStringArray);

        System.out.println(Arrays.toString(myStringArray));


// add(e)------------------ boolean  =================> add single element to the list
        Set<Size> sizes4 = EnumSet.noneOf(Size.class);

        System.out.println(sizes4);

        sizes4.add(Size.MEDIUM);
        System.out.println("EnumSet Using add(): " + sizes2);


// remove(o)--------------- boolean  =================> remove element from list by following object.
        System.out.println(sizes1.remove(Size.SMALL));

        boolean value1 = sizes1.remove(Size.MEDIUM);
        System.out.println("Is MEDIUM removed? " + value1);


// containsAll(c)---------- boolean ==================> check if the item collections is exist inside the list or not.
        System.out.println(sizes1.containsAll(sizes2));

        boolean myBool2 = sizes1.containsAll(sizes4);
        System.out.println(myBool2);


// addAll(c)--------------- boolean  =================> add all element to the list
        System.out.println(sizes2);

        sizes2.addAll(sizes1);
        System.out.println("EnumSet Using addAll(): " + sizes2);


// removeAll(c) ----------- boolean  =================> remove all elements from list, that is similar.
        System.out.println(sizes1.removeAll(sizes1));

        boolean value2 = sizes1.removeAll(sizes1);
        System.out.println("Are all elements removed? " + value2);


// retainAll(c)------------ boolean  =================> remove all elements that is not similar.
        sizes1.retainAll(sizes4);

        System.out.println(sizes1);


// clear()----------------- void =====================> remove all the elements from the list and make it empty.
        sizes1.clear();
        System.out.println(sizes1);


// equals(o)--------------- boolean ==================> check if two list is equal or not.
        System.out.println(sizes1.equals(sizes2));

        boolean myBool6 = sizes1.equals(sizes4);
        System.out.println(myBool6);


// toString()  ------------- String ===================> return ArrayList as String.
        System.out.println(sizes1.toString());

        String myStr = sizes2.toString();
        System.out.println(myStr);


// hashCode()-------------- int  =====================> create a hash code
        System.out.println(sizes1.hashCode());

        for(Size x : sizes1){
            System.out.println(x.hashCode());
        }


// for():
        for (Size x : Size.values()){
            System.out.println(x);
        }


// while():
        Iterator<Size> iterate1 = sizes1.iterator();

        while(iterate1.hasNext()) {
            System.out.print(iterate1.next());
            System.out.print(", ");
        }


// removeIf(filter) -------- boolean  =================> remove the element by using filter
        sizes1.removeIf(p -> p.equals(Size.valueOf("SATARDAY")));          // We used lambda here.


// Stream() ---------------- Stream ===================> Returns a sequential Stream with this collection as its source.
        // import java.util.stream.*;
        // Go to Stream file and watch out.


// parallelStream() -------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.
        long count = sizes1.parallelStream().filter(string -> sizes1.isEmpty()).count();

        System.out.println(count);


// Spliterator() ---------- Spliterator ==============> Creates a Spliterator over the elements in this collection.
        Spliterator<Size> myNumbers = sizes1.spliterator();

        System.out.println("Numbers are on the following:");

        myNumbers.forEachRemaining((n) -> System.out.println(n));



///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////  java.lang.Iterable  //////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

// forEach(action) --------- void =====================> use for(java.util.Objects myVar : myList){}
        // First Way:
        sizes1.forEach((n) -> System.out.println(n));



    }

 }




