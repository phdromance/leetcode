import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Tag: Array, Hash table
     * Key: Use a hash table to store numbers already iterated.
     *      Check if the current number's complement already exisits.
     * Time Complexity: O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num2find = target - nums[i];

            if (numMap.containsKey(num2find)) {
                return new int[]{i, numMap.get(num2find)};
            } else {
                numMap.put(nums[i], i);
            }
        }

        return null;
    }
    /*
    // Slower solution
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexes = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numIndexes.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num2find = target - nums[i];
            if (numIndexes.containsKey(num2find) && i != numIndexes.get(num2find)) {
                return new int[]{i, numIndexes.get(num2find)};
            }
        }
        return null;
    }
    */
}
