package com.mtsmda.designPatterns.creatinal.abstractFactory;

import com.mtsmda.designPatterns.creatinal.factory.Computer;
import com.mtsmda.designPatterns.creatinal.factory.Notebook;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class NotebookFactory  implements ComputerAbstractFactory{

    private Integer ram;
    private Integer vram;
    private Integer hdd;
    private String model;
    private Double cpuClockFrequency;

    public NotebookFactory(Integer ram, Integer vram, Integer hdd, String model, Double cpuClockFrequency) {
        this.ram = ram;
        this.vram = vram;
        this.hdd = hdd;
        this.model = model;
        this.cpuClockFrequency = cpuClockFrequency;
    }

    @Override
    public Computer createComputer() {
        return new Notebook(ram, vram, hdd, model, cpuClockFrequency);
    }
}