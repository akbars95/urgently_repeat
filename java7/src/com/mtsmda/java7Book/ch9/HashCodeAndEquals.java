package com.mtsmda.java7Book.ch9;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
public class HashCodeAndEquals {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "TT", 2009);
        Car car2 = new Car("Audi", "TT", 2010);
        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        car2 = car1;
        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode() == car2.hashCode());
        car2.setYear(2011);
        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode() == car2.hashCode());
        System.out.println(car1);
        System.out.println(car2);
    }

}

class Car {
    private String manufacturer;
    private String model;
    private Integer year;

    public Car() {

    }

    public Car(String manufacturer, String model, Integer year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            if (car != null && car.getManufacturer() != null && car.getModel() != null && car.getYear() != null && car.getManufacturer().equals(this.getManufacturer()) && car.getModel().equals(this.getModel()) && car.getYear().equals(this.getYear())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        hashCode += 9 * this.getYear().hashCode();
        hashCode += 9 * this.getModel().hashCode();
        hashCode += 9 * this.getManufacturer().hashCode();
        return hashCode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}