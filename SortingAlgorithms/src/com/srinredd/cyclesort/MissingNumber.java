package com.srinredd.cyclesort;

//https://leetcode.com/problems/missing-number/
//Amazon Question
public class MissingNumber {

	public static void main(String[] args) {
		int nums[] = { 4, 0, 2, 1 };
		//int nums[] = { 0, 1 };
		System.out.println(missingNumber(nums));
	}

	private static int missingNumber(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correctIndexofElement = nums[i];
			if (nums[i] < nums.length && nums[i] != nums[correctIndexofElement]) {
				swap(nums, i, correctIndexofElement);
			} else {
				i++;
			}
		}
		
		// search for first missing number
		for (int index = 0; index < nums.length; index++) {
			if (index != nums[index]) {
				return index;
			} 
		}
		//case 2
		return nums.length;
	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
