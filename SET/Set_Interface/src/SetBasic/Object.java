package SetBasic;
import java.util.*;

public class Object {
    int id;
    String name,author,publisher;
    int quantity;

    public Object(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public static void display(){
        Set<Object> myList=new HashSet<Object>();    // or new HashSet/LinkedHashSet<Object>();
                // For Class Object TreeSet class not possible.

        //Creating Books
        Object b1=new Object(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Object b2=new Object(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Object b3=new Object(103,"Operating System","Galvin","Wiley",6);

        //Adding Books to list
        myList.add(b1);
        myList.add(b2);
        myList.add(b3);

        // For:
        for(Object b:myList){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

        // While: (Iterator)
        Iterator<Object> myItr = myList.iterator();
        while (myItr.hasNext()){
            Object oi = myItr.next();

            System.out.println(oi.id + "==>" + oi.name + "==>" + oi.author + "==>" + oi.publisher + "==>" + oi.quantity);
        }

        // Set doesn't has ListIterator.

    }
}




// Class Objects:
        // HashSet:
                // Set<Object> list = new HashSet<Object>();

        // LinkedHashSet:
                // Set<Object> list = new LinkedHashSet<Object>();

        // TreeSet:
                // The elements in TreeSet must be of a Comparable type.
                    // We can't directly use TreeSet.

