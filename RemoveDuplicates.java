class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int id = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[id - 1] != nums[i]) {
                nums[id] = nums[i];
                id++;
            }
        }
        return id;
    }
}
