package probability;

import java.util.Objects;

public class Probability {
    static private final double MAX_PROBABILITY = 1.0;
    private final double value;

    public Probability(double value) {
        this.value = value;
    }

    public Probability intersection(Probability other) {
        return new Probability(this.value * other.value);
    }

    public Probability complement() {
        return new Probability(MAX_PROBABILITY - this.value);
    }

    public Probability union(Probability other) {
        return this.complement().intersection(other.complement()).complement();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;
        Probability that = (Probability) o;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }
}
