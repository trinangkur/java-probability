package com.length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthUnitTest {

    @Test
    void shouldGiveCorrespondingInchesOfGivenLengthOfCM() {
        final double inches = LengthUnit.CM.toInches(3);
        assertEquals(1.2, inches, 0.001);
    }

    @Test
    void shouldGiveCorrespondingInchesOfGivenLengthOfFeet() {
        final double inches = LengthUnit.FEET.toInches(3);
        assertEquals(36, inches);
    }

    @Test
    void shouldGiveCorrespondingInchesOfGivenLengthOfMM() {
        final double inches = LengthUnit.MM.toInches(3);
        assertEquals(0.12, inches, 0.001);
    }
}