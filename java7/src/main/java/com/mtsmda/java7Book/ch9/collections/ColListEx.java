package com.mtsmda.java7Book.ch9.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by c-DMITMINZ on 11.01.2016.
 */
public class ColListEx {
/**
 Vector is a holdover from the earliest days of Java; Vector and Hashtable
 were the two original collections—the rest were added with Java 2 versions 1.2 and
 1.4. A Vector is basically the same as an ArrayList, but Vector methods are
 synchronized for thread safety. You'll normally want to use ArrayList instead of
 Vector because the synchronized methods add a performance hit you might not need.
 And if you do need thread safety, there are utility methods in class Collections
 that can help. Vector is the only class other than ArrayList to implement
 RandomAccess.


 A List cares about the index. The one thing that List has that non-lists don't is a
 set of methods related to the index. Those key methods include things like get(int
 index), indexOf(Object o), add(int index, Object obj), and so on. All
 three List implementations are ordered by index position—a position that you
 determine either by setting an object at a specific index or by adding it without
 specifying position, in which case the object is added to the end. The three List
 implementations are described in the following sections.

 * */
    public static void main(String[] args) {
        listArrayList();
        listLinkedList();
    }

/**
 Think of this as a growable array. It gives you fast iteration and fast
 random access. To state the obvious: It is an ordered collection (by index), but not
 sorted. You might want to know that as of version 1.4, ArrayList now implements
 the new RandomAccess interface—a marker interface (meaning it has no methods)
 that says, "This list supports fast (generally constant time) random access." Choose
 this over a LinkedList when you need fast iteration but aren't as likely to be doing
 a lot of insertion and deletion.

 Ordered - By index, Sorted - No
 * */
    private static void listArrayList() {
        System.out.println("------------------------begin-----------------------");
        System.out.println("ArrayList");
        List<Integer> integers = new ArrayList<>();
        integers.add(new Integer(19));
        integers.add(new Integer(-9));
        integers.add(new Integer(152));
        integers.add(new Integer(932));
        integers.add(new Integer(120));
        integers.add(new Integer(9485));
        integers.add(new Integer(-415));

        integers.add(5, 193413);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println("\n");
        System.out.println(integers.size());
        System.out.println("remove object = " + integers.remove(new Integer(120)));
        System.out.println("remove object = " + integers.remove(new Integer(125)));
    }

    /**
     A LinkedList is ordered by index position, like ArrayList, except
     that the elements are doubly linked to one another. This linkage gives you new
     methods (beyond what you get from the List interface) for adding and removing
     from the beginning or end, which makes it an easy choice for implementing a stack
     or queue. Keep in mind that a LinkedList may iterate more slowly than an
     ArrayList, but it's a good choice when you need fast insertion and deletion. As of
     Java 5, the LinkedList class has been enhanced to implement the java.util.
     Queue interface. As such, it now supports the common queue methods peek(),
     poll(), and offer().

     Ordered - By index, Sorted - No
     * */
    private static void listLinkedList(){
        System.out.println("------------------------begin-----------------------");
        System.out.println("LinkedList");
        List<String> strings = new LinkedList<>();
        strings.add(new String("France"));
        strings.add(new String("Japane"));
        strings.add(new String("Chine"));
        strings.add(new String("Italy"));
        strings.add(new String("USA"));
        strings.add(new String("Russia"));
        strings.add(new String("Moldova"));

        for (String current : strings){
            System.out.println(current);
        }



    }


}