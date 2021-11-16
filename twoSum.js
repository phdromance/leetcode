// 1. two sum https://leetcode.com/problems/two-sum/
// Key is to use a hash map to avoid 2nd loop. 
// Assume 2 numbers are A and B. You will always return 
// results when the loop arrives at B. All numbers before
// B will be inserted into the hash map. So the logic is to
// see if the assumed A for the current number has been inserted 
// into hash map.
 

var twoSum = function (nums, target) {
	var numObj = { };

	for (let i = 0; i < nums.length; i++) {
		var num2find = target - nums[i];
		if (numObj.hasOwnProperty(num2find) && numObj[num2find] != i) {
			return [i, numObj[num2find]];
		}
		else {
			let key2add = nums[i].toString();
			numObj[key2add] = i;
		}
	}
};
