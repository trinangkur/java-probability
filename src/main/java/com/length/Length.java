package com.length;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private boolean isEqual(Length other) {
        final double thisInInch = this.unit.toInches(this.value);
        final double otherInInch = other.unit.toInches(other.value);
        return thisInInch == otherInInch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return this.isEqual(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.unit.toInches(this.value), LengthUnit.INCH);
    }
}
