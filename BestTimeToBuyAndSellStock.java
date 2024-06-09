package com.ananya.leetcode.questions;

public class BestTimeToBuyAndSellStock{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n =new int[] {7,6,4,3,1};
		int min=n[0],profit=0;
		for(int i=0;i<n.length;i++)
		{
			profit = Math.max(profit, n[i]-min);
			min= Math.min(min, n[i]);
			
		}
			
		System.out.println(profit);
	}

}
