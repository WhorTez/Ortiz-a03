package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void removeFromInitialArray() {
        Solution34 s = new Solution34();
        String[] inputArray = {"Bruce Banner", "Wonder Woman", "Tony Stark", "Dr. Strange", "Your Mom"};
        String[] test = {"Bruce Banner", "Wonder Woman", "Tony Stark", "Your Mom"};

        assertArrayEquals(test, s.removeFromInitialArray("Dr. Strange", inputArray));
    }
}