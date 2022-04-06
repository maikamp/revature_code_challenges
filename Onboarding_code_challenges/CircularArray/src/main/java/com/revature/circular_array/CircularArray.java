package com.revature.circular_array;

import java.util.Iterator;

// Implement a CircularArray class that supports an array-like data structure 
// which can be efficiently rotated. If possible, the class should use a 
// generic type (also called a template), and should support iteration via 
// the standard f or (Obj o : circularArray) notation.

public class CircularArray<T> implements Iterable<T> {
	protected Object[] array;
	protected int size;

	public CircularArray(int size) {
		this.array = new Object[size];
		this.size = array.length;
	}

	public CircularArray(T[] array) {
		this.array = array;
		this.size = array.length;
	}

	/*
	 * @param
	 * 
	 * @return Value of CircularArray at given index
	 */
	public Object get(int index) {
		return array[index];
	}

	/*
	 * @param Set the int index in the CircularArray to the T value
	 */
	public void set(int index, Object value) {
		array[index] = value;
	}

	/*
	 * @return Size of CircularArray
	 */
	public int size() {
		return size;
	}

	/*
	 * @param
	 * Shifts the indexed values left given negative value or right given positive
	 * value
	 */
	public void rotate(int steps) {
		Object[] results = new Object[size];
		if (steps > 0) {
			for (int i = 0; i < size; i++) {
				if (i + steps >= size) {
					results[i + steps - size] = array[i];
				} else {
					results[i + steps] = array[i];
				}
			}
		} else if (steps < 0) {
			for (int i = 0; i < size; i++) {
				if (i + steps < 0) {
					results[i + steps + size] = array[i];
				} else {
					results[i + steps] = array[i];
				}
			}
		}
		array = results;
	}

	@Override
	public Iterator<T> iterator() {
		Iterator<T> itr = new Iterator<T>() {
			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < size && array[currentIndex] != null;
			}

			@Override
			public T next() {
				return (T) array[currentIndex++];
			}
		};
		return itr;
	}
}
