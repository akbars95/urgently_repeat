package com.mtsmda.java7Book.ch9.collections;

import java.util.*;

/**
 * Created by c-DMITMINZ on 11.01.2016.
 */
public class ColSetEx {

    /**
     A Set cares about uniqueness—it doesn't allow duplicates. Your good friend the
     equals() method determines whether two objects are identical (in which case, only
     one can be in the set). The three Set implementations are described in the
     following sections.
     * */
    public static void main(String[] args) {
        setHashSet();
        setLinkedHashSet();
        setTreeSet();
    }

    /**
     * A HashSet is an unsorted, unordered Set. It uses the hashcode of the
     * object being inserted, so the more efficient your hashCode() implementation, the
     * better access performance you'll get. Use this class when you want a collection with
     * no duplicates and you don't care about order when you iterate through it.
     *
     * Ordered - No, Sorted - No
     */
    private static void setHashSet() {
        System.out.println("------------------------begin-----------------------");
        System.out.println("HashSet");
        Set<String> strings = new HashSet<>();
        strings.add(new String("Barcelona"));
        strings.add(new String("Milan"));
        strings.add(new String("Arsenal"));
        strings.add(new String("Benfica"));
        strings.add(new String("Lyon"));
        strings.add(new String("Zenit"));
        strings.add(new String("Spartak"));

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next + " hashcode is " + next.hashCode());
        }

        System.out.println("size = " + strings.size());
        Object[] objects = strings.toArray();
        String[] strings1 = strings.toArray(new String[]{});
        System.out.println(objects.length);
        System.out.println(strings1.length);

        System.out.println("without hashcode implementation");

        Set<FootballClub> footballClubs = new HashSet<>();
        footballClubs.add(new FootballClub("Barcelona", "Barcelona"));
        footballClubs.add(new FootballClub("Milan", "Milan"));
        footballClubs.add(new FootballClub("Spartak", "Moscow"));
        footballClubs.add(new FootballClub("Dinamo", "Kiev"));
        footballClubs.add(new FootballClub("Real", "Madrid"));
        footballClubs.add(new FootballClub("Milan", "Milan"));
        System.out.println(footballClubs.size());

        Iterator<FootballClub> iterator1 = footballClubs.iterator();
        while (iterator1.hasNext()) {
            FootballClub next = iterator1.next();
            System.out.println(next.toString() + " hashcode " + next.hashCode());
        }

    }

    /**
     * A LinkedHashSet is an ordered version of HashSet that
     * maintains a doubly linked List across all elements. Use this class instead of
     * HashSet when you care about the iteration order. When you iterate through a
     * HashSet, the order is unpredictable, while a LinkedHashSet lets you iterate
     * through the elements in the order in which they were inserted.
     *
     *
     * Ordered - By insertion order, Sorted - No
     */
    private static void setLinkedHashSet() {
        System.out.println("------------------------begin-----------------------");
        System.out.println("LinkedHashSet");
        Set<String> strings = new LinkedHashSet<>();
        strings.add(new String("Barcelona"));
        strings.add(new String("Milan"));
        strings.add(new String("Arsenal"));
        strings.add(new String("Benfica"));
        strings.add(new String("Lyon"));
        strings.add(new String("Zenit"));
        strings.add(new String("Spartak"));

        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            String temp = iterator.next();
            /*String tempNext = iterator.next();
            System.out.println(temp + "_____" + tempNext);*/
            System.out.println(temp + " hc - " + temp.hashCode());

        }
    }

    /**
     * The TreeSet is one of two sorted collections (the other being
     TreeMap). It uses a Red-Black tree structure (but you knew that), and guarantees
     that the elements will be in ascending order, according to natural order. Optionally,
     you can construct a TreeSet with a constructor that lets you give the collection
     your own rules for what the order should be (rather than relying on the ordering
     defined by the elements' class) by using a Comparator. As of Java 6, TreeSet
     implements NavigableSet.

     Ordered - Sorted, Sorted - By natural order or custom comparison rules
     * */
    private static void setTreeSet() {
        System.out.println("------------------------begin-----------------------");
        System.out.println("TreeSet");
        Set<String> strings = new TreeSet<>();
        strings.add(new String("Barcelona"));
        strings.add(new String("Milan"));
        strings.add(new String("Arsenal"));
        strings.add(new String("Benfica"));
        strings.add(new String("Lyon"));
        strings.add(new String("Zenit"));
        strings.add(new String("Spartak"));

        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            String temp = iterator.next();
            System.out.println(temp + " hc = " + temp.hashCode());
        }
    }

}

class FootballClub {
    private String clubName;
    private String clubCity;

    public FootballClub() {

    }

    public FootballClub(String clubName, String clubCity) {
        this.clubName = clubName;
        this.clubCity = clubCity;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubCity() {
        return clubCity;
    }

    public void setClubCity(String clubCity) {
        this.clubCity = clubCity;
    }

    @Override
    public int hashCode() {
        int hashcode = 9;
        if (this.clubCity != null) {
            hashcode += this.clubCity.hashCode();
        }
        if (this.clubName != null) {
            hashcode += this.clubName.hashCode();
        }
        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof FootballClub) {
            FootballClub footballClub = (FootballClub) obj;
            if (footballClub != null && footballClub.getClubCity() != null && footballClub.getClubCity().equals(this.clubCity) && footballClub.getClubName() != null && footballClub.getClubName().equals(this.clubName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "clubName='" + clubName + '\'' +
                ", clubCity='" + clubCity + '\'' +
                '}';
    }
}