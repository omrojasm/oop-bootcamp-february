package oop.stats;

import java.util.Arrays;

public class Stats {

    private final int[] nums;

    public Stats(int[] nums) {
        this.nums  = nums;
    }

    public int extractMinimum() {
        return Arrays.stream(nums).min().orElseThrow(EmptyArrayException::new);
    }
}
