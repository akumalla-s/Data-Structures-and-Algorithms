package com.srinredd;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedBinarySearch {
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 0;
		RotatedBinarySearch binarySearch = new RotatedBinarySearch();
		System.out.println(binarySearch.search(arr, target));
	}
	public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

		// if you did not find a pivot, it means the array is not rotated
		if (pivot == -1) {
			// just do normal binary search
			return binarySearch(nums, target, 0, nums.length-1);
		}
		
		// if you find the pivot you have found 2 asc arrrays
		if(nums[pivot] == target) {
			return pivot;
		}
		
		if(target >= nums[0]) {
			return binarySearch(nums, target, 0, pivot-1);
		}
		
		return binarySearch(nums, target, pivot+1 , nums.length-1);
    }
    public int findPivot(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// 4 cases
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return -1;
	}
    
    public int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

	public int binarySearch(int[] arr, int target, int start, int end) {
		
		while (start <= end) {
//			find the middle element
//			int mid = (start + end) /2; // might be possible that (start + end ) exceeds the range of int
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
//				ans found
				return mid;
			}
		}
//		This statement is executed if element is not found
		return -1;
	}
}
