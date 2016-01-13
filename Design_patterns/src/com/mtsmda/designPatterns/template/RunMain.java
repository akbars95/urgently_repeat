package com.mtsmda.designPatterns.template;

/**
 * Created by c-DMITMINZ on 13.01.2016.
 */
public class RunMain {

    public static void main(String[] args) {
        Game gameF = new Football();
        gameF.play();

        System.out.println("______________________");

        Game gameIH = new IceHokkey();
        gameIH.play();
    }

}