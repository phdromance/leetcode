// [Array]
// 26. Remove Duplicates from Sorted Array https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Similar to 283 Move Zeroes

var removeDuplicates = function(nums) {
    // Note that no extra memory is allowed! Should only modify array in-place
    
    // defensive
    if(nums.length===0 || nums==null) return 0;
    
    // loop through the nums from the second number
    var id = 1;
    for(let i=1; i<nums.length; i++){
        if(nums[i]!=nums[id-1]) {
            nums[id]=nums[i];
            id++;
        }
    }
    return id;
}
