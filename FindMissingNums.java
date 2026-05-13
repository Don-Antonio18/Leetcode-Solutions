// Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        Set<Integer> numSet = new HashSet<>();


        for (int num : nums) {
            numSet.add(num);
        }

        List<Integer> expected_nums = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (!numSet.contains(i))
            expected_nums.add(i);
        }

        return expected_nums;


    }
}
