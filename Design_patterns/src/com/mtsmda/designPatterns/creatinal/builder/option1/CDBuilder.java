package com.mtsmda.designPatterns.creatinal.builder.option1;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class CDBuilder {

    public CDType buildSonyCD(){
        CDType cdType = new CDType();
        cdType.addItem(new Sony());
        return cdType;
    }

    public CDType buildSamsungCD(){
        CDType cdType = new CDType();
        cdType.addItem(new Samsung());
        return cdType;
    }

}