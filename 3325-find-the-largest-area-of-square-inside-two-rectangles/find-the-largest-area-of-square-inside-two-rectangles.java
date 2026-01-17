class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {

        int n = bottomLeft.length;
        long maxArea = 0;

        // Compare every pair of rectangles
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // Calculate overlapping width
                int overlapWidth = Math.min(topRight[i][0], topRight[j][0])
                                 - Math.max(bottomLeft[i][0], bottomLeft[j][0]);

                // Calculate overlapping height
                int overlapHeight = Math.min(topRight[i][1], topRight[j][1])
                                  - Math.max(bottomLeft[i][1], bottomLeft[j][1]);

                // If overlap exists
                if (overlapWidth > 0 && overlapHeight > 0) {
                    int side = Math.min(overlapWidth, overlapHeight);
                    maxArea = Math.max(maxArea, (long) side * side);
                }
            }
        }

        return maxArea;
    }
}
