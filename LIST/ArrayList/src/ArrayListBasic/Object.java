package ArrayListBasic;

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
        ArrayList<Object> arrayList=new ArrayList<Object>();

        //Creating Books
        Object b1=new Object(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Object b2=new Object(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Object b3=new Object(103,"Operating System","Galvin","Wiley",6);

        //Adding Books to list
        arrayList.add(b1);
        arrayList.add(b2);
        arrayList.add(b3);

    // For:
        for(Object b:arrayList){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    // While: (Iterator)
        Iterator<Object> myItr = arrayList.iterator();
        while (myItr.hasNext()){
            Object oi = myItr.next();

            System.out.println(oi.id + "==>" + oi.name + "==>" + oi.author + "==>" + oi.publisher + "==>" + oi.quantity);
        }

    // While: (ListIterator)
        ListIterator<Object> listItr = arrayList.listIterator();

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
