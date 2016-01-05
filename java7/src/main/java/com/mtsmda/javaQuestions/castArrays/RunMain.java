package com.mtsmda.javaQuestions.castArrays;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class RunMain {

    public static void main(String[] args) {
        int [][] intsTwoD = new int[][]{{1, 9}, {26, 963}};
        int [] intsOneD = intsTwoD[0];
        System.out.println(intsOneD[1]);
        Object o = intsTwoD;
        System.out.println(o.getClass().getCanonicalName());
        int [][] intsTwoD2 = (int[][])o;
        System.out.println(intsTwoD2[0][0]);

        int c = ((int[][])o)[0][1];
        System.out.println(c);

    }

}