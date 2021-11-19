import java.lang.Math;

public class JudgeSquareSum {
    /**
     * Tag: two pointers, array
     * Trick: The second pointer should start from sqrt(target) to reduce time complexity.
     * Time complexity: O(sqrt(target))
     * Space complexity: O(1)
     * */
    public static boolean judgeSquareSum(int target) {
        if (target < 0) return false;

        long iLow = 0;
        long iHigh = (long) Math.sqrt(target);

        while (iLow <= iHigh) {
            long sum = iLow * iLow + iHigh * iHigh;

            if (sum < target) {
                iLow++;
            } else if (sum > target) {
                iHigh--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        boolean ans_5 = JudgeSquareSum.judgeSquareSum(5);
        if (ans_5 == true) System.out.println("Correct for test case: 5");

        boolean ans_long = JudgeSquareSum.judgeSquareSum(2147483600);
        if (ans_long == true) System.out.println("Correct for test case: 2147483600");
    }
}
