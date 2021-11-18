class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;

        int lo = 0;
        int hi = numbers.length - 1;

        while (lo < hi) {
            if (numbers[lo] + numbers[hi] < target) {
                lo++;
            } else if (numbers[lo] + numbers[hi] > target) {
                hi--;
            } else {
                return new int[] {lo + 1, hi + 1};
            }
        }

        return null;
    }
}
