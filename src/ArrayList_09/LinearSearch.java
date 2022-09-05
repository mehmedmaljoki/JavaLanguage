package ArrayList_09;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {2, 4, 56, 3, 6, 3, 6, 3, 6, 2, 54, 252, 43, 2, 5};
		System.out.println("position: " + linearSearch(arr, 4));
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
}
