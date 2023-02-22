package com.ojas.codingtest;

public class SetOne_07 {
	public static void swapping(int arr[]) {
		  for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 8, 6, 7, 5, 9};
		swapping(arr);
	    System.out.println("After Selection Sort");  
	    
      for(int i:arr){  
          System.out.print(i+" ");  
      }  

	}

}
