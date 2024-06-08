package com.ananya.leetcode.questions;

import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] { 2, 0, 2, 0, 1, 1 };
		bruteForce(nums);
		nums = new int[] { 2, 0, 2, 1, 1, 0, 1, 0, 1 };
		dutchNationalFlagAlgorithm(nums);
	}

	private static void dutchNationalFlagAlgorithm(int[] nums) {
		int low = 0, mid = 0, high = nums.length - 1;
		while (mid <= high) {
			if (nums[mid] == 0) {
				swap(low, mid, nums);
				low++;
				mid++;
			} else if (nums[mid] == 1)
				mid++;
			else if (nums[mid] == 2) {
				swap(high, mid, nums);
				high--;
			}

		}

		Arrays.stream(nums).forEach(element -> System.out.print(element + " "));

	}

	private static void bruteForce(int[] nums) {

		int c1 = 0, c2 = 0, c0 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				c0++;
			else if (nums[i] == 1)
				c1++;
			else
				c2++;
		}
		for (int i = 0; i < c0; i++)
			nums[i] = 0;
		for (int i = c0; i < c0 + c1; i++)
			nums[i] = 1;
		for (int i = c0 + c1; i < nums.length; i++)
			nums[i] = 2;
		Arrays.stream(nums).forEach(element -> System.out.print(element + " "));
		System.out.println();

	}

	private static void swap(int i, int j, int nums[]) {
		// TODO Auto-generated method stub
		int a = nums[i];
		nums[i] = nums[j];
		nums[j] = a;

	}

}
