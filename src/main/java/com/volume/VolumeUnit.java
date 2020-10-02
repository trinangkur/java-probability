package com.volume;

public enum VolumeUnit {
    GALLON(3.78), LITRE(1);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double toLitres(double value) {
        return value * this.conversionFactor;
    }
}