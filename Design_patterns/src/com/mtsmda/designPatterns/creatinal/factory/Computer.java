package com.mtsmda.designPatterns.creatinal.factory;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public abstract class Computer {

    private Integer ram;
    private Integer vram;
    private Integer hdd;
    private String model;
    private Double cpuClockFrequency;

    public Computer() {

    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getVram() {
        return vram;
    }

    public void setVram(Integer vram) {
        this.vram = vram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getCpuClockFrequency() {
        return cpuClockFrequency;
    }

    public void setCpuClockFrequency(Double cpuClockFrequency) {
        this.cpuClockFrequency = cpuClockFrequency;
    }

    @Override
    public String toString() {
        return "Computer - " + this.getClass().getSimpleName() + "{" +
                "ram=" + ram +
                ", vram=" + vram +
                ", hdd=" + hdd +
                ", model='" + model + '\'' +
                ", cpuClockFrequency=" + cpuClockFrequency +
                '}';
    }
}