package ArrayList_09;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(binarySearch(arr, 11));

		int[] arr2 = {2, 3, 5, 9, 14, 16, 18};
		System.out.println(ceiling(arr2, 4));

		char[] letters = {'c', 'f', 'j'};
		System.out.println(nextGreatestLetter(letters, 'g'));

		int[] nums = {5, 7, 7, 8, 8, 10};
		System.out.println(searchRange(nums, 8));

	}

	public static int binarySearch(int[] arr, int target) {
		if (arr.length == 0) return -1;

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int middle = start + (end - start) / 2; // same as (start +end) / 2

			if (target < arr[middle]) {
				end = middle - 1;
			} else if (target > arr[middle]) {
				start = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

	public static int orderAgnosticBinarySearch(int[] arr, int target) {
		if (arr.length == 0) return -1;
		int start = 0;
		int end = arr.length - 1;

		// find out is ASC or DESC
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int middle = start + (end - start) / 2;

			if (arr[middle] == target) {
				return middle;
			}

			if (isAsc) {
				if (target < arr[middle]) {
					end = middle - 1;
				} else if (target > arr[middle]) {
					start = middle + 1;
				} else {
					return middle;
				}
			} else {
				if (target > arr[middle]) {
					end = middle - 1;
				} else if (target < arr[middle]) {
					start = middle + 1;
				} else {
					return middle;
				}
			}

		}
		return -1;
	}

	// ceiling number = smallest element in array >= target
	public static int ceiling(int[] arr, int target) {
		if (arr.length == 0 || target > arr[arr.length - 1]) {
			return -1;
		}

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int middle = start + (end - start) / 2; // same as (start +end) / 2

			if (target < arr[middle]) {
				end = middle - 1;
			} else if (target > arr[middle]) {
				start = middle + 1;
			} else {
				return arr[middle];
			}
		}
		return arr[start];
	}

	// floor = greatest number <= target
	public static int floor(int[] arr, int target) {
		if (arr.length == 0 || target < arr[0]) {
			return -1;
		}

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int middle = start + (end - start) / 2; // same as (start +end) / 2

			if (target < arr[middle]) {
				end = middle - 1;
			} else if (target > arr[middle]) {
				start = middle + 1;
			} else {
				return arr[middle];
			}
		}
		return arr[end];
	}

	// leet 744
	public static char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			int middle = start + (end - start) / 2; // same as (start +end) / 2

			if (target < letters[middle]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return letters[start % letters.length];
	}

	// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

	/**
	 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
	 * <p>
	 * If target is not found in the array, return [-1, -1].
	 * <p>
	 * You must write an algorithm with O(log n) runtime complexity.
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] searchRange(int[] nums, int target) {
		int[] ans = {-1, -1};

		int start = search(nums, target, true);
		int end = search(nums, target, false);

		ans[0] = start;
		ans[1] = end;

		return ans;
	}

	// this function just returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex) {
		int potentialAns = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int middle = start + (end - start) / 2; // same as (start +end) / 2

			if (target < nums[middle]) {
				end = middle - 1;
			} else if (target > nums[middle]) {
				start = middle + 1;
			} else {
				// potential ans found
				potentialAns = middle;
				if (findStartIndex) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			}
		}
		return potentialAns;
	}

}
