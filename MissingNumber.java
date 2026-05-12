// Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        // range should be inclusive
        List<Integer> expected_nums = IntStream.rangeClosed(0, n)
                .boxed()
                .collect(Collectors.toList());

        int expected_sum = 0;
        for (int num : expected_nums) {
            expected_sum += num;
        }

        int missing_num = expected_sum - sum;
        return missing_num;
    }
}
