package Generics_010;

import java.util.List;

// hier kann T jetzt Number oder Subklassen von Number sein
public class WildCardExample<T extends Number> {
	private Object[] data;
	static private int DEFAULT_SIZE = 10;
	private int size = 0;

	public WildCardExample() {
		data = new Object[DEFAULT_SIZE];
	}

	public void getList(List<Number> list) {
		// do something
		// here you can only pass Number type, not subklasses
	}

	public void getListOther(List<? extends Number> list) {
		// do something
		// here you can pass Number and Subklasses
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
