public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int num : nums) {
            map.put(num, map.get(num) != null ? map.get(num) + 1 : 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > len / 2) {
                return key;
            }
		    }

		    return 0;
    }
}
