package ly.leetcode.DynamicProgramming;

public class Q198HouseRobber {
	public static void main(String[] args) {
		int mat[] = {2,3,4,5,6,7,8,9,10};
		System.out.println(rob(mat));
	}

	public static int rob(int[] nums) {
		int[] maxValue = new int[nums.length];
		if(nums.length == 0) {
			return 0;
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (i == 0) {
					maxValue[i] = nums[i];
				} else if (i == 1) {
					maxValue[i] = Math.max(nums[i], maxValue[i - 1]);
				} else {
					maxValue[i] = Math.max(maxValue[i - 2] + nums[i], maxValue[i - 1]);
				}
			}
		}
		return maxValue[nums.length - 1];
	}
}
