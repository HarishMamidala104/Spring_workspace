package com.ojas.codingtest;
/*
 * Find the minimum difference between the index of two given elements present in an array

Given an integer array nums and two integers x and y present in it, 
find the minimum absolute difference between indices 
of x and y in a single traversal of the array.

Input:
 
arr = { 1, 3, 5, 4, 8, 2, 4, 3, 6, 5 }
x = 3, y = 2
 
Output: 2
 
Explanation: 
Element 3 is present at index 1 and 7, and element 2 is present at index 5. 
Their minimum absolute difference is min(abs(1-5), abs(7-5)) = 2

 */
public class SetOne_10 {
	public static void minimumdifference(int arr[],int x, int y) {
		int temp=0;
		int temp1=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==x  ) {
					//System.out.println(i);
				    temp=i;
				    //System.out.println(temp);
					break;
				}
				if(arr[i]==y  ) {
					//System.out.println(i);
					temp1=i;
					//System.out.println(temp1);
					break;
				}
				
			}
		}
		if(temp-temp1==2) {
			System.out.println("Their minimum absolute difference is :"+(temp-temp1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]={ 1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
 minimumdifference(arr, 3, 2);
	}

}
