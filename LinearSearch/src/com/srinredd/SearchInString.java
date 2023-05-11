package com.srinredd;

public class SearchInString {

	public static void main(String[] args) {
		String name = "srinredd";
		char target = 'n';
//		System.out.println(linearSearch(name, target));
//		System.out.println(linearSearch2(name, target));
		System.out.println(linearSearch3(name, target));
	}
	
//	Functional programming
	private static boolean linearSearch3(String name, char target) {
//		return name.chars().anyMatch((c) -> {return c == target;});
		return name.chars().anyMatch(c -> c == target);
	}

	private static boolean linearSearch(String name, char target) {

		if (name.length() == 0) {
			return false;
		}

		for (int i = 0; i < name.length(); i++) {
			char value = name.charAt(i);
			if (target == value) {
				return true;
			}
		}

		return false;
	}

	private static boolean linearSearch2(String name, char target) {

		if (name.length() == 0) {
			return false;
		}

//		Enhanced for loop
		for (char ch : name.toCharArray()) {
			if (ch == target) {
				return true;
			}
		}

		return false;
	}

}
