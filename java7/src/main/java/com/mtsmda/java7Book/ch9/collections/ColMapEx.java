package com.mtsmda.java7Book.ch9.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by c-DMITMINZ on 11.01.2016.
 */
public class ColMapEx {

    /**
     Like Vector, Hashtable has existed from prehistoric Java times. For
     fun, don't forget to note the naming inconsistency: HashMap vs. Hashtable. Where's
     the capitalization of t? Oh well, you won't be expected to spell it. Anyway, just as
     Vector is a synchronized counterpart to the sleeker, more modern ArrayList,
     Hashtable is the synchronized counterpart to HashMap. Remember that you don't
     synchronize a class, so when we say that Vector and Hashtable are synchronized,
     we just mean that the key methods of the class are synchronized. Another difference,
     though, is that while HashMap lets you have null values as well as one null key, a
     Hashtable doesn't let you have anything that's null.
     *
     *
     A Map cares about unique identifiers. You map a unique key (the ID) to a specific
     value, where both the key and the value are, of course, objects. You're probably quite
     familiar with Maps since many languages support data structures that use a key/value
     or name/value pair. The Map implementations let you do things like search for a
     value based on the key, ask for a collection of just the values, or ask for a collection
     of just the keys. Like Sets, Maps rely on the equals() method to determine whether
     two keys are the same or different.
     * */
    public static void main(String[] args) {
        mapHashMap();
        mapLinkedHashMap();
        mapTreeMap();
    }

    /**
     The HashMap gives you an unsorted, unordered Map. When you need a
     Map and you don't care about the order when you iterate through it, then HashMap is
     the way to go; the other maps add a little more overhead. Where the keys land in
     the Map is based on the key's hashcode, so, like HashSet, the more efficient your
     hashCode() implementation, the better access performance you'll get. HashMap
     allows one null key and multiple null values in a collection.

     Ordered - No, Sorted - No
     * */
    private static void mapHashMap() {
        System.out.println("------------------------begin-----------------------");
        System.out.println("HashMap");
        Map<String, Double> stringDoubleMap = new HashMap<>();
        stringDoubleMap.put(null, null);
        stringDoubleMap.put(null, null);
        stringDoubleMap.put("Ivanov", null);

        for(String s : stringDoubleMap.keySet()){
            if(s == null){
                System.out.println("null");
            }else{
                System.out.println(s + " - " + stringDoubleMap.get(s));
            }
        }

    }

    /**
     Like its Set counterpart, LinkedHashSet, the LinkedHashMap
     collection maintains insertion order (or, optionally, access order). Although it will
     be somewhat slower than HashMap for adding and removing elements, you can
     expect faster iteration with a LinkedHashMap.

     Ordered - By insertion order or last access order, Sorted - No
     * */
    private static void mapLinkedHashMap() {
        System.out.println("------------------------begin-----------------------");
        System.out.println("LinkedHashMap");
        Map<String, Double> stringDoubleMap = new LinkedHashMap<>();
        stringDoubleMap.put(null, null);
        stringDoubleMap.put(null, null);
        stringDoubleMap.put("Ivanov", null);
        stringDoubleMap.put("Sidorov", 19.6);
        stringDoubleMap.put("Petrov", 1830.25);
        stringDoubleMap.put("Sergeev", 95.25);

        for(String s : stringDoubleMap.keySet()){
            if(s == null){
                System.out.println("null");
            }else{
                System.out.println(s + " - " + stringDoubleMap.get(s));
            }
        }

    }

    /**
     You can probably guess by now that a TreeMap is a sorted Map. And
     you already know that, by default, this means "sorted by the natural order of the
     elements." Like TreeSet, TreeMap lets you define a custom sort order (via a
     Comparator) when you construct a TreeMap that specifies how the elements should
     be compared to one another when they're being ordered. As of Java 6, TreeMap
     implements NavigableMap.

     Ordered - Sorted, Sorted - By natural order or custom comparison rules
     * */
    private static void mapTreeMap() {
        System.out.println("------------------------begin-----------------------");
        System.out.println("TreeMap");
        Map<String, Double> stringDoubleMap = new TreeMap<>();
        /*stringDoubleMap.put(null, null);*/
        stringDoubleMap.put("Ivanov", null);
        stringDoubleMap.put("Sidorov", 19.6);
        stringDoubleMap.put("Petrov", 1830.25);
        stringDoubleMap.put("Sergeev", 95.25);

        for(String s : stringDoubleMap.keySet()){
            if(s == null){
                System.out.println("null");
            }else{
                System.out.println(s + " - " + stringDoubleMap.get(s));
            }
        }

    }

}