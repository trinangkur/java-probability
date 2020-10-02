package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void shouldGiveIntersectionOfTwoProbabilities() {
        final Probability probability1 = new Probability(0.5);
        final Probability probability2 = new Probability(0.3);
        final Probability actual =  probability2.intersection(probability1);
        assertEquals(new Probability(0.15), actual);
    }

    @Test
    void shouldGiveTheComplementOfProbability() {
        final Probability probability = new Probability(0.3);
        final Probability complement = probability.complement();
        assertEquals(new Probability(0.7), complement);
    }

    @Test
    void shouldGiveUnionOfTwoProbabilities() {
        final Probability probability1 = new Probability(0.5);
        final Probability probability2 = new Probability(0.5);
        assertEquals(new Probability(0.75), probability1.union(probability2));
    }
}
