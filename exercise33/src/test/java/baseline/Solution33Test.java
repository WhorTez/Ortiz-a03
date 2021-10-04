package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void RNGTest() {
        Solution33 s= new Solution33();
        assertTrue(s.RNG() >= 0 && s.RNG() < 4);
    }

    @Test
    void giveAnswerTest() {
        Solution33 s = new Solution33();
        int rng = s.RNG();
        assertEquals(s.answers[rng], s.giveAnswer(rng));
    }
}