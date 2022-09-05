package ArrayList_09;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(binarySearch(arr, 5));

	}

	public static int binarySearch(int[] arr, int target) {
		if (arr.length == 0) return -1;

		int start = 0;
		int end = arr.length - 1;
		int middle = (start + end) / 2;

		while (target != arr[middle]) {
			if (target < arr[middle]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
			middle = (start + end) / 2;
		}
		return middle;
	}
}
