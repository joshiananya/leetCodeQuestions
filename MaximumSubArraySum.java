package com.ananya.leetcode.questions;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { -1, -5, 8, -2, 10 };
		System.out.println(bruteForceApproach(nums));
		System.out.println(KadanesAlgorithm(nums));
	}

	private static int KadanesAlgorithm(int[] nums) {

		int sum = 0, max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = Math.max(max, sum);
			if (sum < 0)
				sum = 0;
		}

		return max;
	}

	// time limit exceeded for bigger arrays
	private static int bruteForceApproach(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {

			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				max = Math.max(max, sum);
			}
		}
		return max;

	}

}
