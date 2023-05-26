package com.srinredd;

//https://leetcode.com/problems/find-in-mountain-array/

interface MountainArray {
	public int get(int index);

	public int length();
}

public class SearchInMountainArray {

	public static void main(String[] args) {
		
		int target = 2;

		MountainArray array = new MountainArray() {

			//int arr[] = { 1, 2, 3, 4, 5, 3, 1, 7 };
			int arr[] = {1,5,2};

			@Override
			public int length() {
				return arr.length;
			}

			@Override
			public int get(int index) {
				return arr[index];
			}
		};
		
		System.out.println(search(array, target));

	}

	public static int search(MountainArray mountainArray, int target) {
		
		int peakElement = findPeakElementInMountainArray(mountainArray);

		int firstTry = orderAgnosticsBinarySearch(mountainArray, target, 0, peakElement);
		if (firstTry != -1) {
			return firstTry;
		}
		//second try on the other half
		return orderAgnosticsBinarySearch(mountainArray, target, peakElement, mountainArray.length()-1);
	}

	public static int findPeakElementInMountainArray(MountainArray mountainArray) {
		int start = 0;
		int end = mountainArray.length()-1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (mountainArray.get(mid) > mountainArray.get(mid+1)) {
				end = mid;
			} else{
				start = mid + 1;
			}
		}
		return start;
	}

	public static int orderAgnosticsBinarySearch(MountainArray mountainArray, int target, int start, int end) {
		
		// find whether array is sorted in ascending or descending
		boolean isAscending = mountainArray.get(start)< mountainArray.get(end);
		
		while(start <= end) {
			int mid = start + (end-start)/2;  
			if(mountainArray.get(mid) == target) {
				return mid;
			}
			if(isAscending) {
				if(target < mountainArray.get(mid)) {
					end = mid -1;
				}else {
					start = mid + 1;
				}
			}else {
				if(target < mountainArray.get(mid)) {
					start = mid + 1;
				}else {
					end = mid -1;
				}
			}
			
		}
//		This statement is executed if element is not found
		return -1;
	}

}
