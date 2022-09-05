package ArrayList_09;

import java.util.Arrays;

public class SwappingValuesArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		swap(arr, 1, 3);

		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int end = 1 + i;
			if (arr[i] == arr[arr.length - end]) {
				break;
			}
			swap(arr, i, arr.length - end);
		}

	}
}
