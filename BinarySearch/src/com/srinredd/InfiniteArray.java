package com.srinredd;

public class InfiniteArray {
	
//	https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

	public static void main(String[] args) {

		int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		int target = 140;
		
		System.out.println(answer(arr, target));
		
	}
	static int answer(int[] arr, int target) {
//		first find the range
//		start with box size of 2
		int start = 0;
		int end = 1;
		
//		Condition for the target to lie in the range		
		while(target > arr[end]) {
			int temp = end  + 1; // this is my new start
//			 double the box value
//			end = previous end + sizeOfBox * 2 
			end = end + (end - start + 1) * 2;
			start = temp;
			
			//check if the new end is out of bounds
			if(end >= arr.length) {
				end = arr.length - 1;
				break;
			}
		}
		
		return binarySearch(arr, target, start, end);
	}
	public static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(target < arr[mid]) {
				end = mid-1;
			}else if(target > arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
			
		return -1;
	}

}
