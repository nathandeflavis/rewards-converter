public class RewardValue {
    //RewardValue must convert from miles to cash at a rate of 0.0035.
    private static final double CASH_PER_MILE = 0.0035;
    private double cashValue;
    private int milesValue;

    //RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(this.cashValue / RewardValue.CASH_PER_MILE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = this.milesValue * RewardValue.CASH_PER_MILE;
    }

    //RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    public double getCashValue() {
        return this.cashValue;
    }

    //RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    public int getMilesValue() {
        return this.milesValue;
    }
}