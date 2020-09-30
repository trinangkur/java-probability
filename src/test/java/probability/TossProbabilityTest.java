package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TossProbabilityTest {
    @Test
    void shouldGetChanceOfHavingAllTails() {
        final TossProbability tossProbability = new TossProbability(1);
        assertEquals(0.5F, tossProbability.gettingAllTails());
        final TossProbability tossProbabilityOfTwoCoin = new TossProbability(2);
        assertEquals(0.25F, tossProbabilityOfTwoCoin.gettingAllTails());
    }

    @Test
    void shouldGetChanceOfNotHavingAllTails() {
        final TossProbability tossProbability = new TossProbability(1);
        assertEquals(0.5F, tossProbability.notGettingAllTails());
    }
}
