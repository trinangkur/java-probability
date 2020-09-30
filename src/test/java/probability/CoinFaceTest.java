package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinFaceTest {
    @Test
    void shouldGetChanceOfHavingTail() {
        final CoinFace tail = CoinFace.TAIL;
        float chance = tail.getOdds();
        assertEquals(0.5, chance);
    }

    @Test
    void shouldGetChanceOfNotHavingTail() {
        final CoinFace tail = CoinFace.TAIL;
        final float oppositeOdds = tail.getOppositeOdds();
        assertEquals(0.5, oppositeOdds);
    }
}
