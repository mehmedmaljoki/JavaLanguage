package Generics_010;

public class CustomGenericArrayList<T> {
	private Object[] data;
	static private int DEFAULT_SIZE = 10;
	private int size = 0;

	public CustomGenericArrayList() {
		data = new Object[DEFAULT_SIZE];
	}

	public void add(T number) {
		if (isFull()) {
			resize();
		}
		data[size++] = number;
	}

	private boolean isFull() {
		return size == data.length;
	}

	private void resize() {
		Object[] temp = new Object[data.length * 2];

		// copy the current items in the new array
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public T remove() {
		T removed = (T) data[--size];
		return removed;
	}

	public T get(int index) {
		return (T) data[index];
	}

	public int size() {
		return size;
	}

	public void set(int index, int value) {
		data[index] = value;
	}
}
