package com.srinredd;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 5, 4, 2 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// find the maximum item in the remaining array and swap with correct index
			int last = arr.length - 1 - i;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
	}

	private static void swap(int arr[], int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	private static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;

		for (int i = start; i <= end; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}

}
