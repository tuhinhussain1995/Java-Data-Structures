package ConcurrentMapBasic;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Main {

    public static void main(String[] args) {
        Basic.display();
        Methods.display();
        Object.display();



// All Data Type:
        // ConcurrentMap:
                // ConcurrentMap map = new ConcurrentHashMap();


// Specific Data Type:

        // NavigableMap:
            // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

                // NavigableMap<String, String> numbers = new TreeMap<>();
                // NavigableMap<String, Integer> numbers = new TreeMap<>();
                // NavigableMap<Long, String> numbers = new TreeMap<>();
                // NavigableMap<Float, String> numbers = new TreeMap<>();
                // NavigableMap<String, Double> numbers = new TreeMap<>();
                // NavigableMap<String, String> numbers = new TreeMap<>();
                // NavigableMap<Float, String> numbers = new TreeMap<>();
                // NavigableMap<Double, String> numbers = new TreeMap<>();
                // NavigableMap<Float, String> numbers = new TreeMap<>();
                // NavigableMap<String, Double> numbers = new TreeMap<>();


// Class Objects:
        // ConcurrentMap:
                // ConcurrentMap<Integer, Book> map = new ConcurrentHashMap<>();
    }
}
