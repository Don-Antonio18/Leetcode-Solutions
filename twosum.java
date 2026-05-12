

class twosum
{
    public int[] twosum(int[] nums, int target){
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