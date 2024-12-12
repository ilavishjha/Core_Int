package com.rays.thread;

public class ok {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		rotateRight(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void rotateRight(int[] arr) {
		int last = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}

		arr[0] = last;
	}
}
