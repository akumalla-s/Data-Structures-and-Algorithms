package com.srinredd;

import java.util.stream.IntStream;

public class SearchInRange {
//	Here we are checking our target is present in between starting index and ending index
//	instead of checking entire array
//	Only return true if the value is present in the range
//	Even if the value is present in the array and it is out of starting and ending index range return false.
	
	public static void main(String[] args) {
		int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 2;
        int startingIndex = 0;
        int endingIndex = 2;
//        System.out.println(linearSearch(arr, target, startingIndex, endingIndex));
        System.out.println(linearSearchFunctional(arr, target, startingIndex, endingIndex));
	}
	
	private static boolean linearSearchFunctional(int[] arr, int target, int startingIndex, int endingIndex) {
		return IntStream.rangeClosed(startingIndex, endingIndex)
						.map(i -> arr[i])
						.anyMatch(value -> value ==target);
	}

	
	private static boolean linearSearch(int[] arr, int target, int start, int end) {
		if(arr.length == 0) {
			return false;
		}
		for(int i=start; i<=end; i++) {
			int value = arr[i];
			if(value == target) {
				return true;
			}
		}
		return false;
	}
}
