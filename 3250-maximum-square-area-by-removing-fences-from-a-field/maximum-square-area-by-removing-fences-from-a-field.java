import java.util.*;

class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {

        final long MOD = 1_000_000_007L;

        // Step 1: Add boundary fences
        int[] h = new int[hFences.length + 2];
        int[] v = new int[vFences.length + 2];

        h[0] = 1;
        h[h.length - 1] = m;
        v[0] = 1;
        v[v.length - 1] = n;

        for (int i = 0; i < hFences.length; i++) {
            h[i + 1] = hFences[i];
        }
        for (int i = 0; i < vFences.length; i++) {
            v[i + 1] = vFences[i];
        }

        // Step 2: Sort
        Arrays.sort(h);
        Arrays.sort(v);

        // Step 3: Collect all horizontal gaps
        Set<Integer> hGaps = new HashSet<>();
        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                hGaps.add(h[j] - h[i]);
            }
        }

        // Step 4: Find largest common gap
        long maxSide = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int gap = v[j] - v[i];
                if (hGaps.contains(gap)) {
                    maxSide = Math.max(maxSide, gap);
                }
            }
        }

        if (maxSide == 0) return -1;

        return (int)((maxSide * maxSide) % MOD);
    }
}
