package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void difficulty1RNG() {
        Solution32 s = new Solution32();
        assertTrue(s.difficulty1RNG() <=10 && s.difficulty1RNG() > 0);
    }

    @Test
    void difficulty2RNG() {
        Solution32 s = new Solution32();
        assertTrue(s.difficulty2RNG() <=100 && s.difficulty2RNG() > 0);
    }

    @Test
    void difficulty3RNG() {
        Solution32 s = new Solution32();
        assertTrue(s.difficulty3RNG() <=1000 && s.difficulty3RNG() > 0);
    }
}