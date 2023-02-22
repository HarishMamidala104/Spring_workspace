package com.ojas.codingtest;

import java.util.HashSet;

/*
 * Given an unsorted integer array, print all pairs with a given difference k in it.
For example,

Input:
 
arr = [1, 5, 2, 2, 2, 5, 5, 4]
k = 3
 
Output:
 
(2, 5) and (1, 4)
 */
public class SetTwo_01 {
	public static void diffrence(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] - arr[j] == target || arr[j]-arr[i]==target) {
					System.out.println(arr[i]+" "+arr[j]);
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 5, 2, 2, 2, 5, 5, 4};
		HashSet<Integer> list = new HashSet<>();
		
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
			
		}
		System.out.println(list);
		int temp[]=new int[list.size()];
		int i=0;
		for(Integer val:list) {
			temp[i++]=val;
			
		}
		
  diffrence(temp, 3);
	}

}
