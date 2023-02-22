package com.ojas.codingtest;

import java.util.Arrays;

public class SetOne_05 {
public static void moveallzero(int arr[]) {
		
		int[] temp=new int[arr.length];
		int p=0;
		int k=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp[p]=arr[i];
				p++;
				
			}
			else {
				temp[k]=arr[i];
				k--;
			}
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
      moveallzero(arr);
	}
}
