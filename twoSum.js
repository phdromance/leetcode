// 1. two sum https://leetcode.com/problems/two-sum/

var twoSum = function (nums, target) {
	let numObj = { };

	for (let i = 0; i < nums.length; i++) {
		numObj[nums[i]] = i;
	}

	for (let i = 0; i < nums.length; i++) {
		let num2find = target - nums[i];
		if (numObj.hasOwnProperty(num2find) && numObj[num2find] != i) {
			return [i, numObj[num2find]];
		}
	}
};
