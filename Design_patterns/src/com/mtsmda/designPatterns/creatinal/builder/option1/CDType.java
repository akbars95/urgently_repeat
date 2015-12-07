package com.mtsmda.designPatterns.creatinal.builder.option1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class CDType {

    private List<Packing> packings = new ArrayList<>();

    public void addItem(Packing packing){
        this.packings.add(packing);
    }

    public int getCurrentPrice(){
        int sum = 0;
        for (Packing packing : packings){
            sum += packing.price();
        }
        return sum;
    }

    public String showPacking(){
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (Packing packing : packings){
            stringBuilder.append(packing.pack()).append(" - ").append(packing.price()).append("\n");
            sum += packing.price();
        }
        stringBuilder.append("\nTotal:\n").append("\t\tCount = ").append(packings.size()).append("\tSum = ").append(sum);
        return stringBuilder.toString();
    }


}