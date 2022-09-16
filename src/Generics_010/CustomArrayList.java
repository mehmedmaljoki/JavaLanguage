package Generics_010;

public class CustomArrayList {
	private int[] data;
	static private int DEFAULT_SIZE = 10;
	private int size = 0;

	public CustomArrayList() {
		data = new int[DEFAULT_SIZE];
	}

	public void add(int number) {
		if (isFull()) {
			resize();
		}
		data[size++] = number;
	}

	private boolean isFull() {
		return size == data.length;
	}

	private void resize() {
		int[] temp = new int[data.length * 2];

		// copy the current items in the new array
		for (int i : data) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public int remove() {
		int removed = data[--size];
		return removed;
	}

	public int get(int index) {
		return data[index];
	}

	public int size() {
		return size;
	}

	public void set(int index, int value) {
		data[index] = value;
	}
}
