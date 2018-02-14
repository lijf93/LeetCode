public class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
		if (nums == null || len == 0) {
			return;
		}
		int pos = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] != 0) {
				nums[pos++] = nums[i];
			}
		}
		for (int i = pos; i < len; i++) {
			nums[i] = 0;
		}
    }
}
