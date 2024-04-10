import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    //convert 35.00 cash to miles
    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 35.00;
        var rewardValue = new RewardValue(cashValue);
        int expected = 10000;
        int actual = rewardValue.getMilesValue();
        assertEquals(expected, actual);
    }

    //convert 10 000 miles to cash
    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expected = 35.00;
        double actual = rewardValue.getCashValue();
        assertEquals(expected, actual);
    }
}
