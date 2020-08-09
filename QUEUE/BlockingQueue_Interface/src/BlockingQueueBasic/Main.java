package BlockingQueueBasic;

public class Main {

// BlockingQueue extends Queue.

// Must use try and catch or InterruptedException.

// In order to use the functionalities of the Deque interface, we need to use classes that implement it:
// BlockingQueue Interface:
        // ArrayBlockingQueue class
        // LinkedBlockingQueue class

    public static void main(String[] args) throws InterruptedException {
        BasicArrayBlockingQueue.display();
        BasicLinkedBlockingQueue.display();
        Methods.display();
        Object.display();


    }



// All Data Type:
        // ArrayBlockingQueue:
                // BlockingQueue myBQ = new ArrayBlockingQueue(1024);

        // LinkedBlockingQueue:
                // BlockingQueue myBQ = new LinkedBlockingQueue(1024);



// Specific Data Type:
        // ArrayBlockingQueue:
                // BlockingQueue<Byte> byteBQ = new ArrayBlockingQueue<>(1024);
                // BlockingQueue<Boolean> booleanBQ = new ArrayBlockingQueue<>(1024);
                // BlockingQueue<Character> charBQ = new ArrayBlockingQueue<>(1024);
                // BlockingQueue<Short> shortBQ = new ArrayBlockingQueue<>(1024);
                // BlockingQueue<Long> longBQ = new ArrayBlockingQueue<>(1024);
                // BlockingQueue<String> myBQ = new ArrayBlockingQueue<>(1024);
                // BlockingQueue<Integer> integerBQ = new ArrayBlockingQueue<>(1024);
                // BlockingQueue<Float> floatBQ = new ArrayBlockingQueue<>(1024);
                // BlockingQueue<Double> doubleBQ = new ArrayBlockingQueue<>(1024);

        // LinkedBlockingQueue:
                // BlockingQueue<Byte> byteBQ = new LinkedBlockingQueue<>(1024);
                // BlockingQueue<Boolean> booleanBQ = new LinkedBlockingQueue<>(1024);
                // BlockingQueue<Character> charBQ = new LinkedBlockingQueue<>(1024);
                // BlockingQueue<Short> shortBQ = new LinkedBlockingQueue<>(1024);
                // BlockingQueue<Long> longBQ = new LinkedBlockingQueue<>(1024);
                // BlockingQueue<String> myv = new LinkedBlockingQueue<>(1024);
                // BlockingQueue<Integer> integerBQ = new LinkedBlockingQueue<>(1024);
                // BlockingQueue<Float> floatBQ = new LinkedBlockingQueue<>(1024);
                // BlockingQueue<Double> doubleBQ = new LinkedBlockingQueue<>(1024);


// Class objects:
        // ArrayBlockingQueue:
                // BlockingQueue<Object> myArrayBQ = new ArrayBlockingQueue<Object>(1024);

        // LinkedBlockingQueue:
                // BlockingQueue<Object> myLinkedBQ = new LinkedBlockingQueue<Object>(1024);




}
