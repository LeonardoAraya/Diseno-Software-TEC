package com.adapter.adaptee;

public class DispositivoImperial {
    private double weightLbs;
    private double heightFt;

    public DispositivoImperial(double weightLbs, double heightFt) {
        this.weightLbs = weightLbs;
        this.heightFt = heightFt;
    }

    public double getWeightLbs() {
        return weightLbs;
    }

    public double getHeightFt() {
        return heightFt;
    }
}