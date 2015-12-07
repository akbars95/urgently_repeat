package com.mtsmda.designPatterns.creatinal.builder.option1;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        CDBuilder cdBuilder = new CDBuilder();
        CDType buildSamsungCD = cdBuilder.buildSamsungCD();
        buildSamsungCD.addItem(new Samsung());
        System.out.println(buildSamsungCD.showPacking());

    }

}