package com.ananya.leetcode.questions;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {

	public static void main(String args[]) 
    { 
		int nums[] = {3,1,-2,-5,2,-4};
		Arrays.stream(bruteForce(nums)).forEach(System.out::print);
		System.out.println();
		Arrays.stream(optimal(nums)).forEach(System.out::print);
		
    }
	private static int[] bruteForce(int[] nums) {
		// TODO Auto-generated method stub
		int len=nums.length,ni=0,pi=0;
		int arr[] =new int[len]; 
		int posArr[] =new int[len/2],negArr[] = new int [len/2], res[] =new int[len];
		for (int i=0;i<len;i++)
		{
		  if(nums[i]<0)
		  {
			  negArr[ni++] =nums[i];
		  }
		  else 
			  posArr[pi++] = nums[i];
		}
		for(int j=0;j<len/2;j++)
		{
			res[2*j] =posArr[j];
			res[2*j+1] =negArr[j];
			
		}
		
		return res;
	}

	private static int[] optimal(int[] nums) {
		int res[]= new int[nums.length];
		int pi=0,ni=1;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>0)
			{
				res[pi]=nums[i];
				pi +=2;
			}
			else
			{
				res[ni] = nums[i];
				 ni +=2;
			}
		}
		return res;
	}

	

}
