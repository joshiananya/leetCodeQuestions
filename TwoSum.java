package com.ananya.leetcode.questions;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

	public static void main(String[] args) {
		int nums[] = { 3, 3 };
		int target = 6;
		System.out.println(Arrays.toString(bruteForce(nums, target)));
		System.out.println(Arrays.toString(optimal(nums, target)));
	}

	private static int[] bruteForce(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == diff) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	private static int[] optimal(int[] nums, int target) {

		HashMap<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (hash.containsKey(diff)) {
				return new int[] { i, hash.get(diff) };
			}
			hash.put(nums[i], i);
		}
		return new int[] { -1, -1 };
	}

}
