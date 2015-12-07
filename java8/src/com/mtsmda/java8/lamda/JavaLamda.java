package com.mtsmda.java8.lamda;

/**
 * Created by MTSMDA on 22.11.2015.
 */
public class JavaLamda {

    public static void main(String[] args) {
        ValueAble valueAble = () -> 12345;
        System.out.println(valueAble.getValue());

        RandomAble randomAble = () -> Math.random() * 100;
        System.out.println(randomAble.getRandom());

        GreetingAble greetingAble = name -> "Hello, " + name + "!";
        System.out.println(greetingAble.greeting("Ivan"));

        GreetingAble greetingAble1 = (name) -> "Hi, " + name + "!";
        System.out.println(greetingAble1.greeting("Ion"));

        MaxAble maxAble = (first, second) -> {
            double returnValue = 0;
            if (first > second)
                return first;
            else if (first < second)
                return second;
            return 0;
        };
        System.out.println(maxAble.getMax(19.99, 20));
        System.out.println(maxAble.getMax(20, 20));
        System.out.println(maxAble.getMax(30, 20));

        GenericI<String> stringGenericI = (name) -> {
            String reverseReturn = "";
            for (int i = name.length() - 1; i >= 0; i--) {
                reverseReturn += name.charAt(i);
            }
            return "Original - " + name + ";\tReverse - " + reverseReturn;
        };
        System.out.println(stringGenericI.func("Petr"));

        GenericI<Double> doubleGenericI = (gDouble) -> {
            return gDouble - 100;
        };
        System.out.println(doubleGenericI.func(new Double(256)));

        StringAble stringAble = (text) -> {
            return text.toUpperCase();
        };
        System.out.println(stringOp(stringAble, "text"));

        String result = stringOp((text) -> {
            String resultText = "";
            for (int i = 0; i < text.length(); i++){
                String temp = new String(new Character(text.charAt(i)).toString());
                if(i % 2 == 0){
                    resultText += temp.toLowerCase();
                }else{
                    resultText += temp.toUpperCase();
                }
            }
            return resultText;
        }, "Inner");
        System.out.println(result);

    }

    private static String stringOp(StringAble stringAble, String text){
        return stringAble.stringOp(text);
    }

}


interface ValueAble {

    public double getValue();

}

interface RandomAble {

    public double getRandom();

}

interface GreetingAble {

    public String greeting(String name);

}

interface MaxAble {

    public double getMax(double first, double second);

}

interface GenericI<T> {

    public T func(T t);

}

interface StringAble{

    public String stringOp(String text);

}