package baseline;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
Solution28 s = new Solution28();
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void addNumbers(int num) {

        assertEquals(15, s.addNumbers(int num));
    }
}