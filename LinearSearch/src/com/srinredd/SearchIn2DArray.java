package com.srinredd;

import java.util.Iterator;

public class SearchIn2DArray {
	public static void main(String[] args) {
		int [][] arr = {
				{23, 4, 1},
				{18, 12, 3, 9},
				{78, 99, 34, 56},
				{18, 12}
		};
		int target = 34;
		System.out.println(linearSearch(arr, target));
	}

	private static boolean linearSearch(int[][] arr, int target) {
		if(arr.length == 0) {
			return false;
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				int value = arr[i][j];
				if(value == target) {
					return true;
				}
			}
		}
		return false;
	}
}
