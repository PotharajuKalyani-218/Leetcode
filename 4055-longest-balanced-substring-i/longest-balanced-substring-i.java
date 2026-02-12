public class Solution {
    public int longestBalanced(String s) {
        final int n = s.length();
        int r = 0;
        for (int i = 0; i < n; ++i) {
            int[] f = new int[26];
            int k = 0;
            int m = 0;
            for (int j = i; j < n; ++j) {
                int x = s.charAt(j) - 'a';
                if (++f[x] == 1) {
                    ++k;
                }
                m = Math.max(f[x], m);
                if (m * k == j - i + 1) {
                    r = Math.max(r, j - i + 1);
                }
            }
        }
        return r;
    }
}
