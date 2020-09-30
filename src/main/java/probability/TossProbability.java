package probability;

public class TossProbability {
    private final int numOfCoins;
    static private final float MAX_PROBABILITY = 1.0F;
    public TossProbability(int numOfCoins) {
        this.numOfCoins = numOfCoins;
    }


    public float gettingAllTails() {
        return (float) (1/ Math.pow(2, this.numOfCoins));
    }

    public float notGettingAllTails() {
        return MAX_PROBABILITY - this.gettingAllTails();
    }
}
