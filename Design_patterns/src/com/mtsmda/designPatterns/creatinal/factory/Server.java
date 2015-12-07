package com.mtsmda.designPatterns.creatinal.factory;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class Server extends Computer{

    public Server() {

    }

    public Server(Integer ram, Integer vram, Integer hdd, String model, Double cpuClockFrequency){
        this.setCpuClockFrequency(cpuClockFrequency);
        this.setHdd(hdd);
        this.setModel(model);
        this.setRam(ram);
        this.setVram(vram);
    }

}