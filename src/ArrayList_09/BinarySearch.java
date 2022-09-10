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

	static int ans(int[] arr, int target) {
		// frst find the range
		// first start with a box of size 2
		int start = 0;
		int end = 1;

		// condition for the target ta lie in the range
		while (target > arr[end]) {
			int newStart = end + 1;

			//double the box value
			end = end + (end - start + 1) * 2;
			start = newStart;
		}
		return searchingIntoInfinateArray(arr, target, start, end);
	}

	static int searchingIntoInfinateArray(int[] arr, int target, int start, int end) {
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

	// https://leetcode.com/problems/peak-index-in-a-mountain-array/
	public static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int middle = start + (end - start) / 2; // same as (start +end) / 2

			if (arr[middle] > arr[middle + 1]) {
				// you are in the dec part of the array
				// this may be the ans, but look at left
				end = middle; // this is why end != middle - 1
			} else {
				// you are in acs part of array
				start = middle + 1; // because we know that middle + 1> middle element
			}
		}
		return start;
	}

	// https://leetcode.com/problems/find-in-mountain-array/
	int search(int[] arr, int target) {
		int peak = peakIndexInMountainArray(arr);
		int firstTry = orderAgnosticBinarySearchForFindInMountain(arr, target, 0, peak);
		if (firstTry != -1) {
			return firstTry;
		}
		return orderAgnosticBinarySearchForFindInMountain(arr, target, peak + 1, arr.length - 1);
	}

	public static int orderAgnosticBinarySearchForFindInMountain(int[] arr, int target, int start, int end) {
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


	// https://leetcode.com/problems/search-in-rotated-sorted-array/
	public static int searchInARotatedSortedArray(int[] nums, int target) {
		int pivot = findPivot(nums);

		// if you did not find a pivot, it means the array is not rotated
		if (pivot == -1) {
			// just do normal binary search
			return binarySearch(nums, target, 0, nums.length - 1);
		}

		// if pivot is found, you have found 2 asc sorted arrays
		if (nums[pivot] == target) {
			return pivot;
		}

		if (target >= nums[0]) {
			return binarySearch(nums, target, 0, pivot - 1);
		}

		return binarySearch(nums, target, pivot + 1, nums.length - 1);
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			// find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				// ans found
				return mid;
			}
		}
		return -1;
	}

	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			// 4 cases over here
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	static int findPivotDuplicatedValues(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			// 4 cases over here
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			// if elements at middle, start, are equal then just skip the duplicates
			if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
				// skip the duplicates
				// NOTE: what if these elements at start and end were the pivot?
				// check if start is the pivot
				if (arr[start] > arr[start + 1]) {
					return start;
				}
				start++;

				// check whether end is pivot
				if (arr[end] < arr[end - 1]) {
					return end - 1;
				}
				end--;
			}
			// left side is sorted, so pivot should be in right
			else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	// how many times is the Array rotated?
	public static int rotationCount(int[] arr) {
		int pivot = findPivotDuplicatedValues(arr);
		return pivot + 1;
	}


	/**
	 * arr = {7,2,5,10,8} und kann aufgeteilt werden in muss durchgehen sein
	 * {7,2,5,10} und {8}, summe {24} und {8} oder
	 * {7,2,5} und {10, 8}, summe {14} und {18} oder
	 * {7,2} und {5,10,8}, summe {9} und {23} oder
	 * {7} und {2,5,10,8}, summe {7} und {25}
	 */
	public static int splitArray(int[] nums, int m) {
		int start = 0;
		int end = 0;
		for (int i = 0; i < nums.length; i++) {
			start = Math.max(start, nums[i]); // in the end of the loop this will contain the max element of the array
			end += nums[i];
		}

		// binary Search
		while (start < end) {
			int mid = start + (end - start) / 2;

			int sum = 0;
			int pieces = 1;
			for (int num : nums) {
				if (sum + num > mid) {
					sum = num;
					pieces++;
				} else {
					sum += num;
				}
			}

			if (pieces > m) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}

		return end; // start == end
	}
}
