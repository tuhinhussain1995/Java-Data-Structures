package ArrayBlockingQueueBasic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

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
        ArrayBlockingQueue<Object> list=new ArrayBlockingQueue<Object>(1024);
        //Creating Books
        Object b1=new Object(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Object b2=new Object(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Object b3=new Object(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        // For:
        for(Object b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

        // While: (Iterator)
        Iterator<Object> myItr = list.iterator();
        while (myItr.hasNext()){
            Object oi = myItr.next();

            System.out.println(oi.id + "==>" + oi.name + "==>" + oi.author + "==>" + oi.publisher + "==>" + oi.quantity);
        }


        // Deque doesn't support listIterator.
    }
}




