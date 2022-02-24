package oop.stats;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class StatsTest {

    @Test
    public void itShouldExtractMinimum() throws EmptyArrayException {
        int[] nums = new int[]{3, 2, 1};
        Stats stats = new Stats(nums);
        assertEquals(stats.extractMinimum(), 1);
    }

    @Test
    public void itShouldExpectEmptyArrayExceptionIfNumberArrayIsEmpty() {
        Stats stats = new Stats(new int[0]);
        assertThrows(EmptyArrayException.class, stats::extractMinimum);
    }
}
