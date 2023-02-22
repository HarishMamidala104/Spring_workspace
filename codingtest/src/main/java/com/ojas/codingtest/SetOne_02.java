package com.ojas.codingtest;

import java.util.Arrays;

public class SetOne_02 {
	public static void binarysort(int arr[]) {
		int temp = 0;
		for (int value : arr) {

			if (value == 0) {
				arr[temp++] = 0;

			}
		}
		for (int j = temp; j < arr.length; j++) {

			arr[temp++] = 1;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 0, 1, 0, 1, 0, 0, 1 };
		binarysort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
