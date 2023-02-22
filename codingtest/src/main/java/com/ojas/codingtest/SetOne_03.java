package com.ojas.codingtest;

import java.util.Arrays;

public class SetOne_03 {
	public static void maximumproduct(int arr[]) {
		int result[] = new int[arr.length];
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				temp = arr[i] * arr[j];
				result[i]=temp;
				//System.out.print(temp);
				Arrays.sort(result);
				//System.out.println(Arrays.toString(result));
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]*arr[j] == result[result.length-1]) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {-10, -3, 5, 6, -2};
    maximumproduct(arr);
	}
}
