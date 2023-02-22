package com.ojas.codingtest;

import java.util.ArrayList;

/*
 * Find the minimum index of a repeating element in an array
Input:  { 5, 6, 3, 4, 3, 6, 4 }
Output: The minimum index of the repeating element is 1
 
 
Input:  { 1, 2, 3, 4, 5, 6 }
Output: Invalid Input
 */
public class SetTwo_04 {
	public static void repeating(int arr[]) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					list.add(i);
				}
			}
			
		}
		System.out.println(list.get(0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  { 5, 6, 3, 4, 3, 6, 4 };
		repeating(arr);
	}

}
