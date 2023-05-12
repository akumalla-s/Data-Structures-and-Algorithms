package com.srinredd;

public class FirstandLastPosition {
//  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] ans = searchRange(nums, target);
		System.out.println(ans[0] + " " + ans[1]);
	}

	public static int[] searchRange(int[] nums, int target) {

		int[] ans = { -1, -1 };
		// check for first occurrence if tartget first
		int firstPosition = search(nums, target, true);
		ans[0] = firstPosition;
		if (firstPosition != -1) {
			int lastPosition = search(nums, target, false);
			ans[1] = lastPosition;
		}

		return ans;

	}

	// this function just retruns the index value of target
	public static int search(int[] nums, int target, boolean findStartIndex) {
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				// potential ans found
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}
