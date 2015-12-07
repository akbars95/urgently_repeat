package com.mtsmda.designPatterns.creatinal.factory;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerType computerType, Integer ram, Integer vram, Integer hdd, String model, Double cpuClockFrequency) {
        switch (computerType) {
            case PC: {
                return new PC(ram, vram, hdd, model, cpuClockFrequency);
            }
            case NOTEBOOK: {
                return new Notebook(ram, vram, hdd, model, cpuClockFrequency);
            }
            case SERVER: {
                return new Server(ram, vram, hdd, model, cpuClockFrequency);
            }
        }
        return null;
    }

    public static enum ComputerType {
        PC, SERVER, NOTEBOOK;

        ComputerType() {
        }
    }

}