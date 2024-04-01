class Solution {
  public int missingNumber(int[] num) {
    int miss = num.length;

    for (int i = 0; i < num.length; ++i)
      miss ^= i ^ num[i];

    return miss;
  }
}
