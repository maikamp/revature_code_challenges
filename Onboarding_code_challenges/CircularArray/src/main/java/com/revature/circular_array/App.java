package com.revature.circular_array;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int shift = -1;

		CircularArray<Character> myCircularArray1 = new CircularArray<Character>(5);

		myCircularArray1.set(0, 'A');
		myCircularArray1.set(1, 'B');
		myCircularArray1.set(2, 'C');
		myCircularArray1.set(3, 'D');
		myCircularArray1.set(4, 'E');

		System.out.println(myCircularArray1.size());
		System.out.println("Initial CircularArray: ");
		for (Object x : myCircularArray1) {
			System.out.print(x + " ");
		}
		System.out.println("\nRotated(" + shift + ") CircularArray: ");

		myCircularArray1.rotate(shift);

		for (Object x : myCircularArray1) {
			System.out.print(x + " ");
		}
	}
}
