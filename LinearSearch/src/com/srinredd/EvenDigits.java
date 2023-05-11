package com.srinredd;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {

	public static void main(String[] args) {

		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(digits2(100));
//		System.out.println(findNumbers(nums));

	}

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}
		return count;
	}

//	function to check whether a number contains even number of digits or not
	private static boolean even(int num) {
		int numberOfDigits = digits(num);

		if (numberOfDigits > 0 && numberOfDigits % 2 == 0) {
			return true;
		}
		return false;
	}

	private static int digits2(int num) {
//		If the number is negative make it positive
		if (num < 0) {
			num = num * -1;
		}
		return (int) (Math.log10(num))+1;
	}

//	Count the number of digits in a number
	private static int digits(int num) {
//		If the number is negative make it positive
		if (num < 0) {
			num = num * -1;
		}

//		check if the number is zero
		if (num == 0) {
			return 1;
		}

//		for positive numbers
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10; // num /= 10;
		}
		return count;
	}

}
