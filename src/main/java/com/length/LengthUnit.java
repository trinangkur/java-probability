package com.length;

public enum LengthUnit {
    FEET(12), INCH(1), CM(0.4), MM(0.04);

    private final double noOfInches;

    LengthUnit(double noOfInches) {
        this.noOfInches = noOfInches;
    }

    public double toInches(double value) {
        return value * this.noOfInches;
    }
}
