package Array;

import java.util.HashMap;

class L1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hs.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++)
            if (hs.containsKey(target - nums[i]) && i != hs.get(target - nums[i])) {
                ans[0] = i;
                ans[1] = hs.get(target - nums[i]);
                break;
            }
        return ans;
    }
}
