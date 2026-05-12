// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution,
// and you may not use the same element twice.

class TwoSum
{
    public int[] Solution(int[] nums, int target){
        final int l = nums.length;

        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                    if (nums[j] + nums[i] == target){
                        int[] positions = new int[] {i,j};
                        return positions;
                }
            }
        }
        return new int[] {};
    }
}