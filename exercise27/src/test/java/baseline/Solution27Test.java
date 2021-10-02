package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
Solution27 s = new Solution27();
    @Test
    void validateInput() {
        assertTrue(s.validateInput("Jah", "Bo", "BK-1234", 32825));

    }

    @Test
    void validateNameLength() {
        assertTrue(s.validateNameLength("Jah"));
    }

    @Test
    void validateNameFilledOut() {
        assertTrue(s.validateNameFilledOut("Jah"));
    }

    @Test
    void validateEmployeeID() {
        assertTrue(s.validateEmployeeID("BK-1234"));
    }

    @Test
    void validateZipCode() {
        assertTrue(s.validateZipCode(32825));
    }



}