package com.srinredd;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class FindMinimumNumber {
	public static void main(String[] args) {
		int[] arr = {18,12,-7,3,14,28};
		System.out.println(minimumNumberFunctional(arr));
//		System.out.println("Minimum Number in the array is: "+minimumNumber(arr));
//		System.out.println("Maximum number in the array is: "+ maximumNumber(arr));
	}
	
	private static int minimumNumberFunctional(int[] arr) {
//		method reference
		return Arrays.stream(arr)
				 .min()
				 .orElseThrow(NoSuchElementException::new);
//		lambda expression
//		return Arrays.stream(arr)
//					 .min()
//					 .orElseThrow(() -> new NoSuchElementException());
	}

//	Assuming arr.length != 0
//	return minimum value in the array
	private static int minimumNumber(int[] arr) {
		int minimumNumber = arr[0];
		for(int i=0; i<arr.length; i++) {
			int currentValue = arr[i];
			if(currentValue < minimumNumber) {
				minimumNumber = currentValue;
			}
		}
		return minimumNumber;
	}
	
	private static int maximumNumber(int[] arr) {
		int maximumNumber = arr[0];
		for(int i=0; i<arr.length; i++) {
			int currentValue = arr[i];
			if(currentValue > maximumNumber) {
				maximumNumber = currentValue;
			}
		}
		return maximumNumber;
	}
}
