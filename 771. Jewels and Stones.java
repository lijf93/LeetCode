class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] charJ = J.toCharArray();
        char[] charS = S.toCharArray();
        int cnt = 0;
        for (int i = 0; i < charJ.length; i++) {
            for (int j = 0; j < charS.length; j++) {
                if (charJ[i] == charS[j]) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}