// Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        Set<Integer> expected_nums = new HashSet<>();

        // new ordered list with no duplicates
        for (int i=0; i<=n; i++) {
            expected_nums.add(i);
        }

        int expected_sum = 0;
        for (int num : expected_nums) {
            expected_sum += num;
        }

        int missing_num = expected_sum - sum;
        return missing_num;
    }
}
