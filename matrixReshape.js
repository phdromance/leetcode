// 566. reshape matrix https://leetcode.com/problems/reshape-the-matrix/

var matrixReshape = function (mat, r, c) {
    const nums = mat.flat();
    if (nums.length != r * c || nums.length === 0) return mat;

    var newMat = [];
    while (nums.length) newMat.push(nums.splice(0, c));
    return newMat;
}
