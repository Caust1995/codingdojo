package stringsplit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.runners.JUnit4;
import java.util.Arrays;

public class StringSplitTest {

    @Test
    public void testEmptyString(){
        assertThat(StringSplit.solution("")).isEmpty();
    }

    @Test
    public void testStringWithOneCharacter(){
        assertThat(StringSplit.solution("s")).containsExactly("s_");
    }

    @Test
    public void testStringWithTwoCharacters(){
        assertThat(StringSplit.solution("xy")).containsExactly("xy");
    }

    @Test
    public void testStringWithThreeCharacters(){
        assertThat(StringSplit.solution("xyz")).containsExactly("xy","z_");
    }

    @Test
    public void testEvenString() {
       String s = "abcdef";
       String s1 = "HelloWorld";
       assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)));
       assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)));
    }
    
    @Test
    public void testOddString() {
       String s = "abcde";
       String s1 = "LovePizza";
       assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)));
       assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)));
    }
}