package com.ananya.leetcode.questions;

import java.util.Arrays;

public class PrintSubArrayWithMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{5,4,-1,7,8} ,{5}
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		Arrays.stream(printArray(nums)).forEach(i -> System.out.print(i +" "));;
	}
	
	//Used Kadane's Algorithm
	private static int[] printArray(int[] nums) {
		// TODO Auto-generated method stub
		int sum =0,max =Integer.MIN_VALUE;
		int start =0 ,arrStart=-1, arrEnd =-1;
		for(int i= 0;i<nums.length;i++)
		{//{5,4,-1,7,8}
			if (sum==0)
				start =i;
			sum += nums[i];
			if(sum>max)
			{
				max =sum;
				arrStart=start;
				arrEnd =i;
			}
			
			if(sum<0)
				sum=0;
		}
		//Equals to 0 in case of single element array or complete array length which gives max only
		if(arrStart >=0 & arrEnd>=0)
		{
		int [] res =new int[arrEnd-arrStart+1];
		int index=0;
		for(int i=arrStart;i<=arrEnd;i++)
		{
			res[index++] =nums[i];
		}
		 return res;
		}
		return new int[0];
	}
	


	


}
