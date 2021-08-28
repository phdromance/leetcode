// 1. two sum https://leetcode.com/problems/two-sum/

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
