package com.ojas.codingtest;

public class SetOne_04 {
	public static void majorityelement(int arr[]) {
		int count=1;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					temp=arr[i];
					 break;
					
				}
			}
		}
		System.out.println(count);
		if(count>arr.length/2) {
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
		majorityelement(arr);

	}
}
