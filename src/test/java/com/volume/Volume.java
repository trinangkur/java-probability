package com.volume;
import java.util.Objects;

public class Volume {
    private final double value;
    private final VolumeUnit unit;

    public Volume(double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private boolean isEqualTo(Volume other) {
        final double thisInInch = this.unit.toLitres(this.value);
        final double otherInInch = other.unit.toLitres(other.value);
        return thisInInch == otherInInch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume that = (Volume) o;
        return this.isEqualTo(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.unit.toLitres(this.value), VolumeUnit.LITRE);
    }
}
