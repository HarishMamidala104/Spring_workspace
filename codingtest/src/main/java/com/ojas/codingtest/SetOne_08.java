package com.ojas.codingtest;
/*
 * Maximum Product Subset Problem

Input:  nums[] = { -6, 4, -5, 8, -10, 0, 8 }
 
Output: The maximum product of a subset is 15360

Input:  nums[] = { -6, 4, -5, 8, -10, 0, 8 }
 
Output: The maximum product of a subset is 15360
 */
public class SetOne_08 {
	public static void maxproduct(int arr[],int max) {
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				//System.out.println("Hiii");
				if(arr[i]%2 == 0 && arr[i]!=0) {
					
					System.out.println(arr[i]);
					break;
					
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		int arr[]= { -6, 4, -5, 8, -10, 0, 8};
		maxproduct(arr, 15360);
		
	}

}
