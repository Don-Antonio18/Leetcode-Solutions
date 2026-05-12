// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution,
// and you may not use the same element twice.

import java.util.HashMap;

class TwoSum
{
    public int[] Solution(int[] nums, int target){

        HashMap<Integer, Integer> nums_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (nums_map.containsKey(complement)) {
                return new int[] {nums_map.get(complement), i};
            }
            nums_map.put(nums[i], i);
        }
        return new int[] {};
    }
}