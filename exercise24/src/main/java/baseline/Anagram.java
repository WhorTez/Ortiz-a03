package baseline;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    static boolean isAnagram(String string1, String string2){
        int n1 = string1.length();
        int n2 = string2.length();

        if(n1 != n2) {
            return false;
        }

        char[] array1 = string1.toLowerCase().toCharArray();
        char[] array2 = string2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i=0; i<n1; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
