package ArrayList_09;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {2, 4, 56, 3, 6, 3, 6, 3, 6, 2, 54, 252, 43, 2, 5};
		System.out.println("position: " + linearSearch(arr, 4));

		String name = "Mehmed";
		char target = 'h';
		System.out.println(search(name, target));

		int[] nums = {12, 345, 2, 6, 7896};
		System.out.println(findNumbers(nums));


		int[][] accounts = {
				{1, 5},
				{7, 3},
				{3, 5}
		};

		System.out.println(maximumWealth(accounts));
	}

	public static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static boolean search(String str, char target) {
		if (str.length() == 0) return false;

		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array nums of integers, return how many of them contain an even number of digits.
	 * <p>
	 * <p>
	 * <p>
	 * Example 1:
	 * <p>
	 * Input: nums = [12,345,2,6,7896]
	 * Output: 2
	 * Explanation:
	 * 12 contains 2 digits (even number of digits).
	 * 345 contains 3 digits (odd number of digits).
	 * 2 contains 1 digit (odd number of digits).
	 * 6 contains 1 digit (odd number of digits).
	 * 7896 contains 4 digits (even number of digits).
	 * Therefore only 12 and 7896 contain an even number of digits.*
	 *
	 * @param nums
	 * @return
	 */
	public static int findNumbers(int[] nums) {
		if (nums.length == 0) return 0;
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			int number = nums[i];
			int digits = 0;
			while (number > 0) {
				digits++;
				number /= 10;
			}
			if (digits % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}


	/**
	 * https://leetcode.com/problems/richest-customer-wealth/*
	 *
	 * @param accounts
	 * @return
	 */
	public static int maximumWealth(int[][] accounts) {
		if (accounts.length == 0) return 0;

		int[] sum = new int[accounts.length];

		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[i].length; j++) {
				sum[i] += accounts[i][j];

			}
		}
		return findMax(sum);
	}

	public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int j : arr) {
			if (j > max) {
				max = j;
			}
		}
		return max;
	}
}
