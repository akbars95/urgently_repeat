package com.mtsmda.designPatterns.creatinal.builder.option2;

/**
 * Created by MTSMDA on 01.12.2015.
 */
public class Computer {

    private String hdd;
    private String cpu;

    private boolean graphicsCardEnabled;
    private boolean bluetoothEnabled;

    public Computer(ComputerBuilder computerBuilder) {
        this.hdd = computerBuilder.getHdd();
        this.cpu = computerBuilder.getCpu();
        this.graphicsCardEnabled = computerBuilder.isGraphicsCardEnabled();
        this.bluetoothEnabled = computerBuilder.isBluetoothEnabled();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                ", graphicsCardEnabled=" + graphicsCardEnabled +
                ", bluetoothEnabled=" + bluetoothEnabled +
                '}';
    }

    public static class ComputerBuilder{

        private String hdd;
        private String cpu;

        private boolean graphicsCardEnabled;
        private boolean bluetoothEnabled;

        public ComputerBuilder(String cpu, String hdd) {
            this.cpu = cpu;
            this.hdd = hdd;
        }

        public String getHdd() {
            return hdd;
        }

        public ComputerBuilder setHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public String getCpu() {
            return cpu;
        }

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public boolean isGraphicsCardEnabled() {
            return graphicsCardEnabled;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.graphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public boolean isBluetoothEnabled() {
            return bluetoothEnabled;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}