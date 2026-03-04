package com.arrayexamples;

public class TwoDimensionalArrayExamples {

	public static void main(String[] args) {
		
		int num[][]= {	{1,2,3},
						{4,5,6,10},
						{7,8,9,12,60}
						};
		System.out.println(num[0][0]);
		System.out.println(num[1][1]);
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}

}


//