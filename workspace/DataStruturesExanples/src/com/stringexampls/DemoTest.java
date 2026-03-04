package com.stringexampls;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Welcome to Java";
		int temp=0;
		name.contains("a");
		for(int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			System.out.print(c+" ");
			if(c=='a') {
				temp++;
			}
		}
		if(temp>0) {
			System.out.println("element present");
		}else {
			System.out.println("element not present");
		}
		char data[]=name.toCharArray();		// converting string to character array
	}

}
