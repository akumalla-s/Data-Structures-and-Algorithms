package com.srinredd;

//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {

	public static void main(String[] args) {
		int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 }, };
		System.out.println(maximumWealth(accounts));
	}

	private static int maximumWealth(int[][] accounts) {
		int maxWealth = 0;
		int[] totalWealthOfIndividualCustomer  = sumOfIndividual(accounts);
		maxWealth = checkMaximumValue(totalWealthOfIndividualCustomer);
		return maxWealth;
	}

	private static int checkMaximumValue(int[] totalWealthOfIndividualCustomer) {
		int max = totalWealthOfIndividualCustomer[0];
		for(int wealth: totalWealthOfIndividualCustomer) {
			if(wealth>max) {
				max = wealth;
			}
		}
		return max;
	}

	private static int[] sumOfIndividual(int[][] accounts) {
		int[] sum = new int[accounts.length];
		for(int person=0; person<accounts.length; person++) {
			for(int account=0; account<accounts[person].length;account++) {
				sum[person] = sum[person] + accounts[person][account];
			}
		}
		return sum;
	}

}
