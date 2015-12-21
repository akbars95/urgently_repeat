package com.mtsmda.springCore.SpEL;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class ModelAuto {

    private Integer idModelAuto;
    private String marka;
    private String model;

    public Integer getIdModelAuto() {
        return idModelAuto;
    }

    public void setIdModelAuto(Integer idModelAuto) {
        this.idModelAuto = idModelAuto;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ModelAuto{" +
                "idModelAuto=" + idModelAuto +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}