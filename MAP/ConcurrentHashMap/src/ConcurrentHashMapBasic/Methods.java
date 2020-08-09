package ConcurrentHashMapBasic;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Methods {
    public static void display(){
        ConcurrentHashMap<Integer, String> numbers = new ConcurrentHashMap<>();


// o=object, e=element, c=collection, a=array, i=index

        // java.util.ConcurrentHashMap ========================================================================================>
                        // ====> ConcurrentHashMap map = new ConcurrentHashMap();
                        // ====>  ConcurrentHashMap<String, String> numbers = new ConcurrentHashMap<>();
                        // ====>  ConcurrentHashMap<Integer, Book> map = new ConcurrentHashMap<>();

// contains(Value) ---------------- boolean ===============> The method returns boolean true if the mapping of the value is detected else false.
// forEachEntry(long, function) --- void ==================> executes the specified function for each entry
// forEachKey(long, function) ----- void ==================>  executes the specified function for each key
// forEachValue(long, function)---- void ==================>  executes the specified function for each value
// search() -----------------------return data type =======> search() method searches the map based on the specified function and returns the matched entry.
// searchEntries() ---------------- return data type ======> search function is applied to key/value mappings
// searchKeys() ------------------- return data type ======> search function is only applied to the keys
// searchValues() ----------------- return data type ======> search function is only applied to the values
// reduce(long, function) --------- return data type ======> reduce() method accumulates (gather together) each entry in a map. This can be used when we need all the entries to perform a common task, like adding all the values of a map.
// reduceToDouble(long, function)-- =======================> This method returns the result of accumulating the given transformation of all (key, value) pairs using the given reducer to combine values, and the given basis as an identity value.
// reduceToLong(long, function) --- =======================> This method returns the result of accumulating the given transformation of all keys using the given reducer to combine values, and the given basis as an identity value.
// reduceToInt(long, function) ---- =======================> This method returns the result of accumulating the given transformation of all (key, value) pairs using the given reducer to combine values, and the given basis as an identity value.
// reduceEntries() ---------------- =======================> returns the result of gathering all the entries using the specified reducer function
// reduceEntriesToDouble() -------- =======================> This method returns the result of accumulating the given transformation of all entries using the given reducer to combine values, and the given basis as an identity value.
// reduceEntriesToLong() ---------- =======================> This method returns the result of accumulating the given transformation of all entries using the given reducer to combine values, and the given basis as an identity value.
// reduceEntriesToInt() ----------- =======================> This method returns the result of accumulating the given transformation of all entries using the given reducer to combine values, and the given basis as an identity value.
// reduceKeys() ------------------- return data type ======> returns the result of gathering all the keys using the specified reducer function
// reduceKeysToDouble() ----------- =======================> This method returns the result of accumulating the given transformation of all keys using the given reducer to combine values, and the given basis as an identity value.
// reduceKeysToLong() ------------- =======================> This method returns the result of accumulating the given transformation of all keys using the given reducer to combine values, and the given basis as an identity value.
// reduceKeysToInt() -------------- =======================> This method returns the result of accumulating the given transformation of all keys using the given reducer to combine values, and the given basis as an identity value.
// reduceValues() ----------------- return data type ======> returns the result of gathering all the values using the specified reducer function
// reduceValuesToDouble() --------- =======================> This method returns the result of accumulating the given transformation of all values using the given reducer to combine values, and the given basis as an identity value.
// reduceValuesToLong() ----------- =======================> This method returns the result of accumulating the given transformation of all values using the given reducer to combine values, and the given basis as an identity value.
// reduceValuesToInt()------------- =======================> This method returns the result of accumulating the given transformation of all values using the given reducer to combine values, and the given basis as an identity value.


        // java.util.Map =====================================================================================================>

                // put(key, value) ------------------- Value ==============> Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
                // putAll(Map, Key, Values) ---------- void ==============>  Inserts all the entries from the specified map to this map.
                // get(key) -------------------------- Value =============> Returns the value associated with the specified key K. If the key is not found, it returns null.
                // containsKey(key) ------------------ boolean ===========> Checks if the specified key K is present in the map or not.
                // containsValue(value) -------------- boolean ===========> Checks if the specified value V is present in the map or not.
                // remove(key) ----------------------- Value =============> Removes the entry from the map represented by the key K.
                // remove(key, value) ---------------- boolean ===========> Removes the entry from the map that has key K associated with value V.
                // size() ---------------------------- int ===============> used to get the size of the map which refers to the number of the key-value pair or mappings in the Map.
                // isEmpty() ------------------------- boolean ===========>  used to check for the emptiness of the map. The method returns True if no key-value pair or mapping is present in the map else False.
                // keySet() -------------------------- set ===============> Returns a set of all the keys present in a map.
                // values() -------------------------- collection ========> Returns a set of all the values present in a map.
                // entrySet() ------------------------ set ===============> Returns a set of all the key/value mapping present in a map.
                // equals(o) ------------------------- boolean ===========> used to check for equality between two maps. It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not.
                // hashCode() ------------------------ int ===============> return the int hash code.
                // getOrDefault(key, defaultValue)---- Value =============> Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
                // replace(key, oldValue, newValue)--- boolean ===========> Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
                // replace(key, value) --------------- old Value =========> Replace the value of the key K with the new specified value V. if the key is disappear then return null.
                // replaceAll(function) -------------- void ==============>  replaces each value with the result of applying the given function(performs a certain operation) on the corresponding value.
                // putIfAbsent(key, newValue) -------- Value =============> Inserts the association if the key K is not already associated with the value V. Return null if the key is new. Return old value if we try to insert same key.
                // computeIfAbsent(key, function) ---- Value =============> used to compute value for a given key using the given mapping function, if key is not already associated with a value (or is mapped to null) and enter that computed value in Hashmap else null.
                // computeIfPresent(key, function) --- Value =============> allows you to compute value of a mapping for specified key if key is already associated with a value (or is mapped to null).
                // compute(key, function) ------------ Value =============>  The compute() method tries to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping is found).
                // merge(key, value, function) ------- Value =============> used to combine multiple mapped values for a key using the given mapping function. Bucket is actually an index of array, that array is called table in HashMap implementation.
                // toString() ------------------------ string ============> return the map to string val.
                // forEach(action) ------------------- void ==============> return the values
                // clear() --------------------------- Void ==============> clear the map.



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////// ConcurrentHashMap map = new ConcurrentHashMap(); /////////////////////////////
/////////////////////// ConcurrentHashMap<String, String> numbers = new ConcurrentHashMap<>(); /////////////////////////////
//////////////////////  ConcurrentHashMap<Integer, Book> map = new ConcurrentHashMap<>(); ///////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.Map ///////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////

        numbers.put(1, "Tuhin");
        numbers.put(3434, "Sumon");
        numbers.put(13, "hin");
        numbers.put(34, "mon");
        numbers.put(188, "Tin");

// contains(Value) ---------------- boolean ================> The method returns boolean true if the mapping of the value is detected else false.
        System.out.println(numbers.contains("Sumon"));

        Boolean myBool = numbers.contains("Tin");
        System.out.println(myBool);

// forEachEntry(long, function) ----- void ================> executes the specified function for each entry
        numbers.forEachEntry(1, keyValue -> System.out.println(keyValue.getKey() + " " + keyValue.getValue()));


// forEachKey(long, function) -------- void ===============>  executes the specified function for each key
        numbers.forEachKey(1, myKey -> System.out.println(myKey));


// forEachValue(long, function) ----- void ===============>  executes the specified function for each value
        numbers.forEachValue(1, myValue -> System.out.println(myValue));


// search() --------return data type ============> search() method searches the map based on the specified function and returns the matched entry.
        String keyy = numbers.search(4, (k, v) -> {return k == 13 ? v: null;});
        System.out.println(keyy);


// searchEntries() --------- return data type ===========> search function is applied to key/value mappings
        String kyy = numbers.searchEntries(4, keyValue -> {return keyValue.getKey() == 13 ? keyValue.getValue(): null;});
        System.out.println(kyy);


// searchKeys() ----------- return data type =========> search function is only applied to the keys
        String maf = numbers.searchKeys(1, ke -> {return ke==13 ? "Found" : "Not Found";});

        System.out.println(maf);


// searchValues() --------- return data type ============> search function is only applied to the values
        String mv = numbers.searchValues(1, v -> {return v.equals("Sumon") ? v : "Not Found";});

        System.out.println(mv);


// reduce(long, function) ---------- return data type =========> reduce() method accumulates (gather together) each entry in a map. This can be used when we need all the entries to perform a common task, like adding all the values of a map.
        System.out.println((String) numbers.reduce(4, (k, v) -> v, (v1, v2) -> v1+v2));

        String srrr = numbers.reduce(4, (k, v) -> v, (v1, v2) -> v1+ ", " + v2);
        System.out.println(srrr);


// reduceToDouble(long, function) --------- This method returns the result of accumulating the given transformation of all (key, value) pairs using the given reducer to combine values, and the given basis as an identity value.



// reduceToLong(long, function) --------- This method returns the result of accumulating the given transformation of all keys using the given reducer to combine values, and the given basis as an identity value.



// reduceToInt(long, function) --------- This method returns the result of accumulating the given transformation of all (key, value) pairs using the given reducer to combine values, and the given basis as an identity value.



// reduceEntries() - returns the result of gathering all the entries using the specified reducer function



// reduceEntriesToDouble() -------- This method returns the result of accumulating the given transformation of all entries using the given reducer to combine values, and the given basis as an identity value.



// reduceEntriesToLong() ----------- This method returns the result of accumulating the given transformation of all entries using the given reducer to combine values, and the given basis as an identity value.



// reduceEntriesToInt() ---------- This method returns the result of accumulating the given transformation of all entries using the given reducer to combine values, and the given basis as an identity value.



// reduceKeys() ----------- return data type =========> returns the result of gathering all the keys using the specified reducer function
        Integer srr = numbers.reduceKeys(1, (k1, k2) -> k1.compareTo(k2) > 100 ? k1 : k2);
        System.out.println(srr);


// reduceKeysToDouble() ------------- This method returns the result of accumulating the given transformation of all keys using the given reducer to combine values, and the given basis as an identity value.



// reduceKeysToLong() --------- This method returns the result of accumulating the given transformation of all keys using the given reducer to combine values, and the given basis as an identity value.



// reduceKeysToInt() ------- This method returns the result of accumulating the given transformation of all keys using the given reducer to combine values, and the given basis as an identity value.



// reduceValues() ----------- return data type ===========> returns the result of gathering all the values using the specified reducer function
        String strr = numbers.reduceValues(1, (v1, v2) -> v1.compareTo(v2) > 100 ? v1 : v2);
        System.out.println(strr);


// reduceValuesToDouble() --------- This method returns the result of accumulating the given transformation of all values using the given reducer to combine values, and the given basis as an identity value.



// reduceValuesToLong() --------- This method returns the result of accumulating the given transformation of all values using the given reducer to combine values, and the given basis as an identity value.



// reduceValuesToInt()---------- This method returns the result of accumulating the given transformation of all values using the given reducer to combine values, and the given basis as an identity value.



///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.Map ///////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////


// put(key, value) ------------------- Value ==============> Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
        numbers.put(1, "Tuhin");
        numbers.put(3434, "Sumon");

        System.out.println(numbers);

        String e = numbers.put(36, "Nazrul");
        System.out.println(e);


// putAll(m, K, V) ------------------- void ==============>  Inserts all the entries from the specified map to this map.
        ConcurrentHashMap<Integer, String> newNum = new ConcurrentHashMap<>();
        newNum.putAll(numbers);

        System.out.println(newNum);


// get(key) -------------------------- Value ===========> Returns the value associated with the specified key K. If the key is not found, it returns null.
        System.out.println(numbers.get(3434));

        String myStr = numbers.get(3333333);
        System.out.println(myStr);


// containsKey(key) ------------------ boolean ===========> Checks if the specified key K is present in the map or not.
        System.out.println(numbers.containsKey(44444));

        boolean myBoola = numbers.containsKey(1);
        System.out.println(myBoola);


// containsValue(value) -------------- boolean ===========> Checks if the specified value V is present in the map or not.
        System.out.println(numbers.containsValue("Tuhin"));

        myBool = numbers.containsValue("Halim");
        System.out.println(myBool);


// remove(key) ----------------------- Value =================> Removes the entry from the map represented by the key K. If not found return null.
        System.out.println(numbers.remove(1));

        String myString = numbers.remove(56);
        System.out.println(myString);


// remove(key, value) ---------------- boolean ===============> Removes the entry from the map that has key K associated with value V.
        System.out.println(numbers.remove(344, "Nazrul"));

        myBool = numbers.remove(1, "Tuhin");
        System.out.println(myBool);


// size() ---------------------------- int ===============> used to get the size of the map which refers to the number of the key-value pair or mappings in the Map.
        System.out.println(numbers.size());

        int myInt = numbers.size();
        System.out.println(myInt);


// isEmpty() ------------------------- boolean ===========>  used to check for the emptiness of the map. The method returns True if no key-value pair or mapping is present in the map else False.
        System.out.println(numbers.isEmpty());

        myBool = numbers.isEmpty();
        System.out.println(myBool);


// keySet() -------------------------- set ===============> Returns a set of all the keys present in a map.
        System.out.println(numbers.keySet());

        Set mySet = new HashSet();
        mySet.addAll(numbers.keySet());

        System.out.println(mySet);


// values() -------------------------- collection ========> Returns a set of all the values present in a map.
        System.out.println(numbers.values());

        mySet.addAll(numbers.values());
        System.out.println(mySet);


// entrySet() ------------------------ set ===============> Returns a set of all the key/value mapping present in a map.
        System.out.println(numbers.entrySet());

        mySet.addAll(numbers.entrySet());
        System.out.println(mySet);


// equals(o) ------------------------- boolean ===========> used to check for equality between two maps. It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not.
        System.out.println(numbers.equals(newNum));

        myBool = newNum.equals(numbers);
        System.out.println(myBool);


// hashCode() ------------------------ int ===============> return the int hash code.
        System.out.println(numbers.hashCode());

        for (Map.Entry<Integer,String> entry : numbers.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


// getOrDefault(key, defaultValue)---- Value ==============> Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue is returned.
        System.out.println(numbers.getOrDefault(1, "dfsafadfsafdsaf"));

        System.out.println(numbers.getOrDefault(1234567, "Tuhin"));


// replace(key, oldValue, newValue)--- boolean ===========> Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
        System.out.println(numbers.replace(1, "Halim", "Bakar"));

        myBool = numbers.replace(3434, "asdfasfdsfa", "Bakar");
        System.out.println(myBool);


// replace(key, value) --------------- old Value =========> Replace the value of the key K with the new specified value V. if the key is disappear then return null.
        System.out.println(numbers.replace(1, "Halim"));

        String name = numbers.replace(3434, "asdfasfdsfa");
        System.out.println(name);


// replaceAll(function) -------------- void ==============>  replaces each value with the result of applying the given function(performs a certain operation) on the corresponding value.
        numbers.replaceAll((key, oldValue) -> oldValue.concat(" Mediu"));

        System.out.println(numbers);


// putIfAbsent(key, newValue) -------- Value ===========> Inserts the association if the key K is not already associated with the value V. Return null if the key is new. Return old value if we try to insert same key.
        System.out.println(numbers.putIfAbsent(34, "Tuhin"));

        myStr = numbers.putIfAbsent(1, "Tuhin");
        System.out.println(myStr);


// computeIfAbsent(key, function) ---- Value =================> used to compute value for a given key using the given mapping function, if key is not already associated with a value (or is mapped to null) and enter that computed value in Hashmap else null.
        numbers.computeIfAbsent(1000, k -> "aaaaaaaaaaaa");

        String adfds = numbers.computeIfAbsent(2000, k -> "bbbbbbbbbbbb");
        System.out.println(adfds);


// computeIfPresent(key, function) --- Value =================> allows you to compute value of a mapping for specified key if key is already associated with a value (or is mapped to null).
        numbers.computeIfPresent(1000, (key, val) -> "aaaaaaaaaaaa");

        adfds = numbers.computeIfPresent(1, (key, val) -> "bbbbbbbbbbbb");
        System.out.println(adfds);


// compute(key, function) ------------ Value ==============>  The compute() method tries to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping is found).
        System.out.println(numbers.compute(1, (key, val) -> val.concat(" Mediu")));

        String sfdd = numbers.compute(3434, (key, val) -> val.concat(" UM"));
        System.out.println(sfdd);

        try {
            numbers.compute(142, (key, val) -> (val == null) ? "Null" : val + 5);
            System.out.println("New Map: " + numbers);
        }
        catch (NullPointerException ee) {

            System.out.println("Exception: " + ee);
        }


// merge(key, value, function) ------- Value ==============> used to combine multiple mapped values for a key using the given mapping function. Bucket is actually an index of array, that array is called table in HashMap implementation.
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Ram");
        map1.put(2, "Rohan");
        map1.put(3, "Shivam");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Tushar");
        map2.put(10, "Satya");
        map2.put(12, "Sundar");

        map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));

        System.out.println(map1);
        System.out.println(map2);


// toString() ------------------------ string ============> return the map to string val.
        System.out.println(numbers.toString());

        String mySr = numbers.toString();
        System.out.println(mySr);



// forEach(action) ------------------- void ==============> return the values
        numbers.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));


// clear() --------------------------- Void ==============> clear the map.
        numbers.clear();

        System.out.println(numbers);



/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////


// While Loop:
        // Keys & Values
        Set set=numbers.entrySet();

        Iterator itr=set.iterator();

        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        // Keys
        Iterator myItr = numbers.keySet().iterator();

        while ((myItr.hasNext())){
            System.out.println(myItr.next());
        }


        // Values
        Iterator myItr1 = numbers.values().iterator();

        while ((myItr1.hasNext())){
            System.out.println(myItr1.next());
        }


// For loop:
        // Keys & Values
        for(Map.Entry m:numbers.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


        // Keys
        for (Integer State : numbers.keySet()){
            System.out.println("State: " + State);
        }


        // Values
        for (String Capital : numbers.values()){
            System.out.println("Capiatl: " + Capital);
        }


    }
}




