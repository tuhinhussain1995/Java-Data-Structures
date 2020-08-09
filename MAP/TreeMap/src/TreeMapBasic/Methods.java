package TreeMapBasic;

import java.util.*;

public class Methods {
    public static void display(){
        TreeMap<Integer, String> numbers = new TreeMap<>();


// o=object, e=element, c=collection, a=array, i=index

        // java.util.TreeMap ========================================================================================>
                        // ====>  TreeMap<Integer, String> numbers = new TreeMap<>();
                        // ====>  TreeMap<Integer,Book> map=new TreeMap<Integer,Book>();

                // clone() ------------------ TreeMap =====================> .The clone() method is used to return a shallow copy of this TreeMap instance.


        // java.util.NavigableMap ========================================================================================>

                // lowerEntry(Key) ------------ Entry <K, V>================> returns an entry with the highest key among all those entries whose keys are less than the specified key
                // lowerKey(Key) -------------- Key=========================> returns the highest key among those keys that are less than the specified key
                // floorEntry(Key) ------------ Entry <K, V>================> returns an entry with the highest key among all those entries whose keys are less than or equal to the specified key
                // floorKey(Key) -------------- Key=========================> returns the highest key among those keys that are less than or equal to the specified key
                // ceilingEntry(Key) ---------- Entry <K, V>================> returns an entry with the lowest key among all those entries whose keys are greater than or equal to the specified key
                // ceilingKey(Key) ------------ Key=========================> returns the lowest key among those keys that are greater than or equal to the specified key
                // higherEntry(Key) ----------- Entry <K, V>================> returns an entry with the lowest key among all those entries whose keys are greater than the specified key
                // higherKey(Key) ------------- K===========================> returns the lowest key among those keys that are greater than the specified key
                // firstEntry() --------------- Entry <K, V>================> returns the first entry (the entry with the lowest key) of the map
                // lastEntry() ---------------- Entry <K, V>================> returns the last entry (the entry with the highest key) of the map
                // pollFirstEntry() ----------- Entry <K, V>================> returns and removes the first entry of the map
                // pollLastEntry() ------------ Entry <K, V>================> returns and removes the last entry of the map
                // descendingMap() ------------ NavigableMap <K, V> ========> reverse the order of entries in a map
                // navigableKeySet() ---------- NavigableSet <K>============> used to return a NavigableSet view of the keys which are contained in the given map.
                // descendingKeySet() --------- NavigableSet <K>============> reverses the order of keys in a map


        // java.util.SortedMap ========================================================================================>

                // comparator() --------------------- Comparator ==========> returns a comparator that can be used to order keys in a map
                // firstKey() ----------------------- Key =================> returns the first key of the sorted map
                // lastKey() ------------------------ Key =================> returns the last key of the sorted map
                // headMap(to Key) ------------------ sortedMap ===========> returns all the entries of a map whose keys are less than the specified key
                // tailMap(from Key) ---------------- sortedMap ===========> returns all the entries of a map whose keys are greater than or equal to the specified key
                // subMap(from Key, to Key) --------- sortedMap ===========> returns all the entries of a map whose keys lies in between key1 and key2 including key1


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



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////// TreeMap<Integer, String> numbers = new TreeMap<>(); /////////////////////////////
//////////////////////  TreeMap<Integer,Book> map=new TreeMap<Integer,Book>(); //////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.TreeMap ///////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////

        numbers.put(16, "Tuhin");
        numbers.put(344, "Sumon");
        numbers.put(3, "Nazrul");
        numbers.put(6, "Mhafuz");

// clone() ------------------ TreeMap =====================> .The clone() method is used to return a shallow copy of this TreeMap instance.
        TreeMap<Integer, String> newNumb = new TreeMap<>();

        newNumb = (TreeMap) numbers.clone();

        System.out.println(newNumb);


///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.NavigableMap ///////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////

        numbers.put(16, "Tuhin");
        numbers.put(344, "Sumon");
        numbers.put(3, "Nazrul");
        numbers.put(6, "Mhafuz");

// lowerEntry(Key) ------------ Entry <K, V>================> returns an entry with the highest key among all those entries whose keys are less than the specified key
        System.out.println(numbers.lowerEntry(16));

        Map.Entry myKeyValue = numbers.lowerEntry(16);
        System.out.println(myKeyValue.getKey() + " === " + myKeyValue.getValue());


// lowerKey(Key) -------------- Key=========================> returns the highest key among those keys that are less than the specified key
        System.out.println(numbers.lowerKey(16));

        int myInti = numbers.lowerKey(16);
        System.out.println(myInti);

// floorEntry(Key) ------------ Entry <K, V>================> returns an entry with the highest key among all those entries whose keys are less than or equal to the specified key
        System.out.println(numbers.floorEntry(16));

        Map.Entry myKeyValue1 = numbers.floorEntry(16);
        System.out.println(myKeyValue1.getKey() + " === " + myKeyValue1.getValue());

// floorKey(Key) -------------- Key=========================> returns the highest key among those keys that are less than or equal to the specified key
        System.out.println(numbers.floorKey(16));

        int myInti1 = numbers.lowerKey(16);
        System.out.println(myInti1);


// ceilingEntry(Key) ---------- Entry <K, V>================> returns an entry with the lowest key among all those entries whose keys are greater than or equal to the specified key
        System.out.println(numbers.ceilingEntry(16));

        Map.Entry myKeyValue2 = numbers.ceilingEntry(16);
        System.out.println(myKeyValue2.getKey() + " === " + myKeyValue2.getValue());


// ceilingKey(Key) ------------ Key=========================> returns the lowest key among those keys that are greater than or equal to the specified key
        System.out.println(numbers.ceilingKey(16));

        int myInti2 = numbers.ceilingKey(16);
        System.out.println(myInti2);


// higherEntry(Key) ----------- Entry <K, V>================> returns an entry with the lowest key among all those entries whose keys are greater than the specified key
        System.out.println(numbers.higherEntry(16));

        Map.Entry myKeyValue3 = numbers.higherEntry(16);
        System.out.println(myKeyValue3.getKey() + " === " + myKeyValue3.getValue());


// higherKey(Key) ------------- K===========================> returns the lowest key among those keys that are greater than the specified key
        System.out.println(numbers.higherKey(16));

        int myInti3 = numbers.higherKey(16);
        System.out.println(myInti3);


// firstEntry() --------------- Entry <K, V>================> returns the first entry (the entry with the lowest key) of the map
        System.out.println(numbers.firstEntry());

        Map.Entry myKeyValue4 = numbers.firstEntry();
        System.out.println(myKeyValue4.getKey() + " === " + myKeyValue4.getValue());


// lastEntry() ---------------- Entry <K, V>================> returns the last entry (the entry with the highest key) of the map
        System.out.println(numbers.lastEntry());

        Map.Entry myKeyValue5 = numbers.lastEntry();
        System.out.println(myKeyValue5.getKey() + " === " + myKeyValue5.getValue());


// pollFirstEntry() ----------- Entry <K, V>================> returns and removes the first entry of the map
        System.out.println(numbers.pollFirstEntry());

        Map.Entry myKeyValue6 = numbers.pollFirstEntry();
        System.out.println(myKeyValue6.getKey() + " === " + myKeyValue6.getValue());


// pollLastEntry() ------------ Entry <K, V>================> returns and removes the last entry of the map
        System.out.println(numbers.pollLastEntry());

        Map.Entry myKeyValue7 = numbers.pollLastEntry();
        System.out.println(myKeyValue7.getKey() + " === " + myKeyValue7.getValue());


// descendingMap() ------------ NavigableMap <K, V> ========> reverse the order of entries in a map
        System.out.println(numbers.descendingMap());

        NavigableMap<Integer, String> KV1 = numbers.descendingMap();
        System.out.println(KV1);


// navigableKeySet() ---------- NavigableSet <K>============> used to return a NavigableSet view of the keys which are contained in the given map.
        System.out.println(numbers.navigableKeySet());

        NavigableSet ab = numbers.navigableKeySet();
        System.out.println(ab);


// descendingKeySet() --------- NavigableSet <K>============> reverses the order of keys in a map
        System.out.println(numbers.descendingKeySet());

        NavigableSet abc = numbers.descendingKeySet();
        System.out.println(abc);




///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////// java.util.SortedMap ///////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////

        numbers.put(1, "Tuhin");
        numbers.put(3434, "Sumon");
        numbers.put(33, "Nazrul");
        numbers.put(64, "Mhafuz");

// comparator() --------------------- Comparator ==========> returns a comparator that can be used to order keys in a map
        // Don't know how to apply


// firstKey() ----------------------- Key =================> returns the first key of the sorted map
        System.out.println(numbers.firstKey());

        Integer myIntt = numbers.firstKey();
        System.out.println(myIntt);


// lastKey() ------------------------ Key =================> returns the last key of the sorted map
        System.out.println(numbers.lastKey());

        myIntt = numbers.lastKey();
        System.out.println(myIntt);


// headMap(to Key) ------------------ sortedMap ===========> returns all the entries of a map whose keys are less than the specified key
        System.out.println(numbers.headMap(33));

        SortedMap<Integer, String> number = new TreeMap<>();
        number = numbers.headMap(33);

        System.out.println(number);


// tailMap(from Key) ---------------- sortedMap ===========> returns all the entries of a map whose keys are greater than or equal to the specified key
        System.out.println(numbers.tailMap(33));

        number = numbers.tailMap(33);
        System.out.println(number);


// subMap(from Key, to Key) --------- sortedMap ===========> returns all the entries of a map whose keys lies in between key1 and key2 including key1
        System.out.println(number.subMap(64, 3434));

        number = numbers.subMap(64, 3434);
        System.out.println(number);


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
        NavigableMap<Integer, String> newNum = new TreeMap<>();
        newNum.putAll(numbers);

        System.out.println(newNum);


// get(key) -------------------------- Value ===========> Returns the value associated with the specified key K. If the key is not found, it returns null.
        System.out.println(numbers.get(3434));

        String myStr = numbers.get(3333333);
        System.out.println(myStr);


// containsKey(key) ------------------ boolean ===========> Checks if the specified key K is present in the map or not.
        System.out.println(numbers.containsKey(44444));

        boolean myBool = numbers.containsKey(1);
        System.out.println(myBool);


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




