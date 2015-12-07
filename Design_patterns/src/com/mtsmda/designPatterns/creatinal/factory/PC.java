package com.mtsmda.designPatterns.creatinal.factory;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class PC extends Computer{

    public PC() {

    }

    public PC(Integer ram, Integer vram, Integer hdd, String model, Double cpuClockFrequency){
        this.setCpuClockFrequency(cpuClockFrequency);
        this.setHdd(hdd);
        this.setModel(model);
        this.setRam(ram);
        this.setVram(vram);
    }
}