package CollectionInterfaceBasic;

public class Main {

// Collection extends Iterable.


// The Collection interface is the root interface of the Java collections framework.
// And we can't direct implementation Collection interface.
// But by using it's sub-interfaces like List, set, Queue we can use it's functionality.


    public static void main(String[] args) {

    }


// o=object, e=element, c=collection, a=array, i=index

    // Collection Interface Methods:
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
            // removeIf(filter) ------- boolean  =================> remove the element by using filter
            // retainAll(c)------------ boolean  =================> remove all elements that is not similar.
            // clear()----------------- void =====================> remove all the elements from the list and make it empty.
            // equals(o)--------------- boolean ==================> check if two list is equal or not.
            // hashCode()-------------- int  =====================> create a hash code
            // Spliterator() ---------- Spliterator ==============> Creates a Spliterator over the elements in this collection.
            // Stream() --------------- Stream ===================> Returns a sequential Stream with this collection as its source.
            // parallelStream() ------- Stream ===================> Returns a possibly parallel Stream with this collection as its source.

}
