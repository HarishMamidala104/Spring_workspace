package com.ojas.codingtest;

public class Reversepattern {
	public static void patten() {
	for(int i=5;i>0;i--) {
		
		for(int j=5;j>=i;j++) {
//			
			if(i==j) {
				System.out.print(i+1);
			}else {
				System.out.print("1");
			}
		}
		System.out.println(" ");
		
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
patten();
}
}
