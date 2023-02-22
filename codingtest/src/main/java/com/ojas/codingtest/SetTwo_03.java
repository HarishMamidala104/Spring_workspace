package com.ojas.codingtest;


import java.util.Arrays;

/*
 * Find two numbers with maximum sum formed by array digits
Input:  { 4, 6, 2, 7, 9, 8 }
Output: The two numbers with maximum sum are 974 and 862
 
 
Input:  { 9, 2, 5, 6, 0, 4 }
Output: The two numbers with maximum sum are 952 and 640
 */
public class SetTwo_03 {
	public static void maximumsum(int arr[]) {
		int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			}	
		}
		System.out.print(arr[i]+" ");
	}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4, 6, 2, 7, 9, 8};
		maximumsum(arr);

	}

}
