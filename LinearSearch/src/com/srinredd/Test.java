package com.srinredd;

public class Test {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Srinivas");
		sb.append(" Reddy");
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str.toString() == sb.toString());
	}
}
