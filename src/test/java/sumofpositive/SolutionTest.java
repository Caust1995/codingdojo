package sumofpositive;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.runners.JUnit4;



public class SolutionTest {
    //@Ignore
    @Test
    public void testSomething() {
        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
    }

    @Test
    public void testEmptyList() {
        assertEquals(0, Positive.sum(new int[]{}));
    }

    @Test
    public void testListWithOnePositiveElement() {
        assertEquals(1, Positive.sum(new int[]{1}));
    }

    @Test
    public void testListWithOneNegativeElement() {
        assertEquals(0, Positive.sum(new int[]{-1}));
    }

    @Test
    public void testListWithAnotherPositiveElement() {
        assertEquals(2, Positive.sum(new int[]{2}));
    }

    @Test
    public void testListWithTwoPositiveElements() {
        assertEquals(3, Positive.sum(new int[]{1,2}));
    }
}