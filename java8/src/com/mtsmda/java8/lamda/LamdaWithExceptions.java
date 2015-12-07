package com.mtsmda.java8.lamda;

/**
 * Created by MTSMDA on 23.11.2015.
 */
public class LamdaWithExceptions {

    public static void main(String[] args) {
        double ar[] = new double[]{19.25, 193.25, -35.0, 1_552.30};

        AverageAble averageAble = (n) -> {
            double sum = 0;
            if(n.length == 0){
                throw new EmptyArrayException();
            }

            for (double current : n){
                if(current < 0){
                    throw new NegativeValueException();
                }
                sum += current;
            }

            return sum / n.length;
        };

        try {
            System.out.println(averageAble.average(ar));
            System.out.println(averageAble.average(new double[0]));
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }

    }

}

interface AverageAble{

    public double average(double [] doubles) throws EmptyArrayException;

}

class EmptyArrayException extends Exception{

    public EmptyArrayException(){
        super("Array is empty!");
    }

}

class NegativeValueException extends RuntimeException{
    public NegativeValueException(){
        super("Negative value!");
    }
}