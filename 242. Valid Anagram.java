public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        int len = s.length();
        if (s.length() != t.length()) {
            return false;
        }

        char[] flag = new char['z' + 1];
        for (int i = 0; i < len; i++) {
            flag[schar[i]]++;
        }
        for (int i = 0; i < len; i++) {
            flag[tchar[i]]--;
        }

        for (int i = 0; i < flag.length; i++) {
            if (flag[i] != 0) {
                return false;
            }
        }
        return true;
    }
}