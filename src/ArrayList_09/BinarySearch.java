package ArrayList_09;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(binarySearch(arr, 11));

		int[] arr2 = {2, 3, 5, 9, 14, 16, 18};
		System.out.println(ceiling(arr2, 4));

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
				return arr[middle];
			}
		}
		return arr[start];
	}

	// floor = greatest number <= target
	public static int floor(int[] arr, int target) {
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
				return arr[middle];
			}
		}
		return arr[end];
	}
}
