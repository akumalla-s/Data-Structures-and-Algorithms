package com.srinredd;

public class OrderAgnostics {
	public static void main(String[] args) {
//		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		int[] arr = {99, 82, 75, 22, 11, 10, 5, 2, -3};
		int target = 22;
		int ans = orderAgnosticsBinarySearch(arr, target);
		System.out.println("The value is present at index "+ans);
	}
	
	static int orderAgnosticsBinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		// find whether array is sorted in ascending or descending
		boolean isAscending = arr[start] < arr[end];
		
		while(start <= end) {
			int mid = start + (end-start)/2;  
			if(arr[mid] == target) {
				return mid;
			}
			if(isAscending) {
				if(target < arr[mid]) {
					end = mid -1;
				}else if(target >arr[mid]) {
					start = mid + 1;
				}
			}else {
				if(target < arr[mid]) {
					start = mid + 1;
				}else if(target >arr[mid]) {
					end = mid -1;
				}
			}
			
		}
//		This statement is executed if element is not found
		return -1;
		
	}
}
