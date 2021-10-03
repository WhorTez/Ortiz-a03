package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void karvonenHeartRateCalcTest1() {
        Solution31 s = new Solution31();
        assertEquals(142, s.karvonenHeartRateCalc(50,90,0.65));
    }

    @Test
    void karvonenHeartRateCalcTest2() {
        Solution31 s = new Solution31();
        assertEquals(209, s.karvonenHeartRateCalc(4, 80, 0.95));
    }


}