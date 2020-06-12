package digitalroot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootExampleTest {

    @Test
    public void simpleTest(){
        assertEquals(  1, DRoot.digital_root(1));
    }

    @Test
    public void simpleTwoDigitsTest(){
        assertEquals(  4, DRoot.digital_root(13));
    }

    @Test
    public void simpleThreeDigitsTest(){
        assertEquals(  6, DRoot.digital_root(123));
    }

    @Test
    public void nextSimpleThreeDigitsTest(){
        assertEquals(  9, DRoot.digital_root(234));
    }

    @Test
    public void simpleFourDigitsTest(){
        assertEquals(  1, DRoot.digital_root(1000));
    }

    @Test
    public void testWithOneRecursion(){
        assertEquals(  6, DRoot.digital_root(456));
    }

    @Test
    public void Tests() {
      assertEquals( 7, DRoot.digital_root(16));
      assertEquals( 6, DRoot.digital_root(456));
    }

}