package com.srinredd;
/*
 * ceiling = smallest element in array greater than or equal to target
 * ceiling(arr, target=17) = 18
 * ceiling(arr, target=15) = 15
 * ceiling(arr, target=19) = 22
 * */
public class CeilingOfNumber {

	public static void main(String[] args) {
		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		int target = 100;
		int ans = ceiling(arr, target);
		System.out.println(ans);
	}
	
	static int ceiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
//		What if the target is greater than the greatest number in the array
		if(target > arr[end]) {
			return -1;
		}
		while(start <= end) {int mid = start + (end-start)/2;  
			if(target < arr[mid]) {
				end = mid -1;
			}else if(target >arr[mid]) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return start;
	}

}
