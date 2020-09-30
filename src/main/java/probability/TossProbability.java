package probability;

public class TossProbability {
    private final int numOfCoins;
    
    public TossProbability(int numOfCoins) {
        this.numOfCoins = numOfCoins;
    }


    public float gettingAllTails() {
        return (float) (1/ Math.pow(2, this.numOfCoins));
    }

    public float notGettingAllTails() {
        return 1 - this.gettingAllTails();
    }
}
