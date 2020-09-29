package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinFaceTest {
    @Test
    void shouldGetChanceOfHavingTail() {
        final CoinFace tail = CoinFace.TAIL;
        float chance = tail.getChance();
        assertEquals(0.5, chance);
    }
}
