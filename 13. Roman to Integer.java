public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('X', 10);
		map.put('C', 100);
		map.put('M', 1000);
		map.put('V', 5);
		map.put('L', 50);
		map.put('D', 500);
		int len = s.length();
		int res = map.get(s.charAt(len - 1));
		int pre = res;
		for (int i = len - 2; i >= 0; i--) {
			int cur = map.get(s.charAt(i));
			if (cur >= pre) {
				res += cur;
			} else {
				res -= cur;
			}
			pre = cur;
		}
		return res;
    }
}
