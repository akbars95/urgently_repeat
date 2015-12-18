package com.mtsmda.springCore.SpEL;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class Car {

    private Integer id;
    private ModelAuto modelAuto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ModelAuto getModelAuto() {
        return modelAuto;
    }

    public void setModelAuto(ModelAuto modelAuto) {
        this.modelAuto = modelAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelAuto=" + modelAuto +
                '}';
    }
}
