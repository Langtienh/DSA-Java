package Array;

public class L26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) return n;
        int ans = 0, curren = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] != curren) {
                curren = nums[i];
                nums[++ans] = curren;
            }
        }
        return ++ans;
    }
}
