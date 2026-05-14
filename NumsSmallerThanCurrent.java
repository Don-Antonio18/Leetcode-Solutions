
import java.util.HashMap;

class NumsSmallerThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] newlist = new int[n];

        for (int i = 0; i < n; i++) {
            map.put(i, nums[i]); // Key: Index, Value: Element
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (Integer value : map.values()) {
                if (nums[i] > value) {
                    count++;
                }
            }
            newlist[i] = count;
        }
        return newlist;
    }
}