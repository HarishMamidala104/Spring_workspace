package com.ojas.codingtest;
/*
 * Partition an array into two subarrays with the same sum
Input:  {6, -4, -3, 2, 3}
 
Output: The two subarrays are {6, -4} and {-3, 2, 3} having equal sum of 2
 
 
Input:  {6, -5, 2, -4, 1}
 
Output: The two subarrays are {} and {6, -5, 2, -4, 1} having equal sum of 0
 */
public class SetTwo_02 {
	public static void sum(int arr[],int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]+arr[j] == sum || arr[j]+arr[i]==sum) {
					System.out.println(arr[i]+" "+arr[j]);
					//System.out.println(arr[i]+" "+arr[]);
				}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={6, -4, -3, 2, 3};
		sum(arr, 2);

	}

}
