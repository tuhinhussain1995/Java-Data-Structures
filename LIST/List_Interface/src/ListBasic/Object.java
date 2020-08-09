package ListBasic;

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
        List<Object> myList=new Stack<Object>();    // or new ArrayList/LinkedList/Vector/Stack<Object>();

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

        // While: (ListIterator)
        ListIterator<Object> listItr = myList.listIterator();

        while (listItr.hasNext()){
            Object oi = listItr.next();
            System.out.println(oi.id + "==>" + oi.name + "==>" + oi.author + "==>" + oi.publisher + "==>" + oi.quantity);
        }

        while(listItr.hasPrevious()){
            Object oi = listItr.previous();
            System.out.println(oi.id + "==>" + oi.name + "==>" + oi.author + "==>" + oi.publisher + "==>" + oi.quantity);
        }

    }
}


// Class Objects:
        // ArrayList:
                // List<Object> list=new ArrayList<Object>();

        // LinkedList:
                // List<Object> list=new LinkedList<Object>();

        // Vector:
                // List<Object> list=new Vector<Object>();

        // Stack:
                // List<Object> list=new Stack<Object>();