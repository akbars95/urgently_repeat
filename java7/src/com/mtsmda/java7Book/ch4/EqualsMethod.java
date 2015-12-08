package com.mtsmda.java7Book.ch4;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class EqualsMethod {

    public static void main(String[] args) {
        String s = "str";
        String s1 = new String("str");
        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        Object o = new Object();
        Object o2 = new Object();
        Object o3 = o;
        System.out.println(o.equals(o2));
        System.out.println(o == o2);

        System.out.println(o.equals(o3));
        System.out.println(o == o3);

        Man man = new Man("First");
        Man man1 = new Man("Second");
        System.out.println(man.hashCode());
        System.out.println(man1.hashCode());
        System.out.println(man.equals(man1));
        System.out.println(man == man1);
    }

}

class Man{
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}