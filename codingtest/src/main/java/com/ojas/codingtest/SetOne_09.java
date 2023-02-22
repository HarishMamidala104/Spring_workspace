package com.ojas.codingtest;

import java.util.HashSet;

public class SetOne_09 {
	public static void kpairs(int[] arr, int k) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
				System.out.println(arr[i] + " " + arr[j]);
			}
		}
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 1, 5, 2, 2, 2, 5, 5, 4 };
	HashSet<Integer> list = new HashSet<Integer>();
	for (int sorted : arr) {
		list.add(sorted);
	}
	int temp[] = new int[arr.length];
	int i = 0;
	for (int num : list) {
		temp[i++] = num;
	}
	kpairs(temp, 3);
}
}
