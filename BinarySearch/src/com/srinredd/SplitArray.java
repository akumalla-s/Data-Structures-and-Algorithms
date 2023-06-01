package com.srinredd;

import java.util.Iterator;

public class SplitArray {

	public static void main(String[] args) {

	}

	public int splitArray(int[] nums, int k) {
		int start = 0;
		int end = 0;
		
		//In the end of the loop this will contain the maximum item from the array
		for (int i = 0; i < nums.length; i++) {
			start = Math.max(start, nums[i]);
			end = end + nums[i];
		}
		
		//binary search
		while(start < end) {
			int mid = start + (end-start)/2;
			
			//Calculate how many pieces you can divide this in with this max sum
			int sum = 0;
			int pieces = 1;
			
			for(int num: nums) {
				if(sum + num > mid) {
					// you can not add this in this sub array, make new one
					// say you add this num in the new sub array, then sum = num
					sum = num;
					pieces++;
				}else {
					sum = sum + num;
				}
			}
			
			if(pieces > k) {
				start = mid + 1;
			}else {
				end = mid;
			}
			
		}
		return end; //here start == end
		
		
	}

}
