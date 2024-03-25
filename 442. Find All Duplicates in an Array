import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicateNumbers = new ArrayList<>();

        for (final int currentNumber : nums) {
            int absNum = Math.abs(currentNumber);
            int index = absNum - 1;
            nums[index] *= -1; // Negate the number at the corresponding index
            
            if (nums[index] > 0) // If the number was already negative, it's a duplicate
                duplicateNumbers.add(absNum);
        }

        return duplicateNumbers;
    }
}

