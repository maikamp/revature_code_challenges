package com.revature.circular_array;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		final int shift = 3;

		// CircularArray<Character> myCircularArray = new CircularArray<Character>(5);

		// myCircularArray.set(0, 'A');
		// myCircularArray.set(1, 'B');
		// myCircularArray.set(2, 'C');
		// myCircularArray.set(3, 'D');
		// myCircularArray.set(4, 'E');

		String[] words = new String[]{"frog", "cow", "elephant", "bird", "squid"};
		CircularArray<String> myCircularArray = new CircularArray<String>(words);

		System.out.println("Initial CircularArray: ");
		for (Object x : myCircularArray) {
			System.out.print(x + " ");
		}
		System.out.println("\nRotated(" + shift + ") CircularArray: ");

		myCircularArray.rotate(shift);

		for (Object x : myCircularArray) {
			System.out.print(x + " ");
		}
	}
}
