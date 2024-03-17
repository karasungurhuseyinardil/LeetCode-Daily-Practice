import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);
        
        int sum = 0;
        int maxLength = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum++;
            } else {
                sum--;
            }
            
            if (countMap.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - countMap.get(sum));
            } else {
                countMap.put(sum, i);
            }
        }
        
        return maxLength;
    }
}
