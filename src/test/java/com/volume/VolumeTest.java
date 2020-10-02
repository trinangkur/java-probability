package com.volume;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {
    @Test
    void shouldCompareTwoEqualVolumes() {
        final Volume volume1 = new Volume( 1, VolumeUnit.GALLON);
        final Volume volume2 = new Volume(3.78, VolumeUnit.LITRE);
        assertEquals(volume1, volume2);
    }

    @Test
    void shouldCompareTwoNonEqualVolumes() {
        final Volume volume1 = new Volume( 1, VolumeUnit.GALLON);
        final Volume volume2 = new Volume(3.70, VolumeUnit.LITRE);
        assertNotEquals(volume1, volume2);
    }
}
