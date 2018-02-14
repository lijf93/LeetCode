public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
		int len = s.length();
		char[] chars = s.toCharArray();
		for(int i = 0; i < len; i++) {
			num += (chars[len - 1 - i] - 'A' + 1) * Math.pow(26, i);
		}
		return num;
    }
}
