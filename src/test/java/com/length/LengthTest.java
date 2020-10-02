package com.length;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LengthTest {
    @Test
    void shouldCompareTwoEqualLengths () {
        final Length length1 = new Length(3, LengthUnit.MM);
        final Length length2 = new Length(0.12, LengthUnit.INCH);
        assertEquals(length1, length2);
    }

    @Test
    void shouldCompareTwoUnEqualLengths() {
        final Length length1 = new Length(1, LengthUnit.FEET);
        final Length length2 = new Length(11.4, LengthUnit.INCH);
        assertNotEquals(length1, length2);
    }
}
