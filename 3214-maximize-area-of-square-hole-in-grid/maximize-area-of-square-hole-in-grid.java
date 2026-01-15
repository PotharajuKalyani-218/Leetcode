import java.util.*;

class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {

        // Sort removable bars
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        // Find longest consecutive sequence in horizontal bars
        int maxH = 1;
        int curr = 1;
        for (int i = 1; i < hBars.length; i++) {
            if (hBars[i] == hBars[i - 1] + 1) {
                curr++;
            } else {
                curr = 1;
            }
            maxH = Math.max(maxH, curr);
        }

        // Find longest consecutive sequence in vertical bars
        int maxV = 1;
        curr = 1;
        for (int i = 1; i < vBars.length; i++) {
            if (vBars[i] == vBars[i - 1] + 1) {
                curr++;
            } else {
                curr = 1;
            }
            maxV = Math.max(maxV, curr);
        }

        // Largest square side
        int side = Math.min(maxH + 1, maxV + 1);

        // Return area
        return side * side;
    }
}
