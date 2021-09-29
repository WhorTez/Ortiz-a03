package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    Solution25 s = new Solution25();

    String password1 = "45678";
    String password2 = "qkifjt";
    String password3 = "abcde789";
    String password4 = "abcde789$";
    String password5 = "##567";

    @Test
    void passwordCheck1(){
        assertEquals(1, s.passwordValidator(password1.toCharArray()));
    }
    @Test
    void passwordCheck2(){
        assertEquals(2, s.passwordValidator(password2.toCharArray()));
    }
    @Test
    void passwordCheck3(){
        assertEquals(3, s.passwordValidator(password3.toCharArray()));
    }
    @Test
    void passwordCheck4(){
        assertEquals(4, s.passwordValidator(password4.toCharArray()));
    }
    @Test
    void passwordCheck5(){
        assertEquals(0, s.passwordValidator(password5.toCharArray()));
    }
}

