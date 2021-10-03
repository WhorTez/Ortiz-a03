package baseline;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    @Test
    void multiplication() {
        Solution30 s = new Solution30();
        assertEquals(12, s.multiplication(4,3));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,10,11,12})
    void multiplicationTest(int a){
        Solution30 s = new Solution30();
        assertEquals(a*5, s.multiplication(a,5));
    }
}