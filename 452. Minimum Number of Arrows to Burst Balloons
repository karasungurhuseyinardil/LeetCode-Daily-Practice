import java.util.Arrays;

class Solution {
  public int findMinArrowShots(int[][] points) {
    Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

    int arrowX = points[0][1];
    int ans = 1;

    for (int[] point : points) {
      if (point[0] > arrowX) {
        arrowX = point[1];
        ans++;
      }
    }

    return ans;
  }
}

