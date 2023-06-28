package com.srinredd;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// int arr[] = { 5, 4, 3, 2, 1 };
		int arr[] = { 5, 3, 4, 1, 2 };
		insertion(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void insertion(int arr[]) {

//		Outer loop running n-2 times. i < length- 1 (or) i <= length -2
		for (int i = 0; i < arr.length - 1; i++) {
//			inner loop starts with i+1 and is always greater than 0
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
