package com.ananya.leetcode.questions;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElementUsingHashing(nums));
		System.out.println(majorityElementOptimalApproach(nums));

	}

	//Using Moore's Voting Algorithm
	public static int majorityElementOptimalApproach(int[] nums) {
		int element = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				element = nums[i];
				count=1;
			}
			else if (nums[i]==element)
				count++;
			else 
				count--;
		}
		
		//Below step is only required if the question does not guarantee there would be atleast one majority element
		int res=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==element)
				res++;
		}
		if(res>(nums.length/2))
			return element;
	return -1;

	}

	// Better Approach than brute force O(N2)
	public static int majorityElementUsingHashing(int[] nums) {
		HashMap<Integer, Integer> a = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			a.put(nums[i], a.getOrDefault(nums[i], 0) + 1);
		}
		for (Entry<Integer, Integer> it : a.entrySet()) {
			if (it.getValue() > (nums.length / 2)) {
				return it.getKey();
			}

		}

		return -1;
	}
}
