package probability;

public enum CoinFace {
    TAIL(0.5F);

    private final float chance;
    CoinFace(float chance) {
        this.chance = chance;
    }

    public float getOdds() {
        return this.chance;
    }

    public float getOppositeOdds() {
        return 1 - this.chance;
    }
}
