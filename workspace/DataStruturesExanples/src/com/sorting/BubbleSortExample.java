package com.sorting;

public class BubbleSortExample {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for(int i=0;i<n-1;i++){

            boolean swapped=false;

            for(int j=0;j<n-i-1;j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped=true;
                }
            }
            System.out.println();
            System.out.println("after "+(i+1)+" Pass ");
            for(int abc:arr) {
            	System.out.print(abc+" ");
            }
            
            if(!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int arr[] = {5,1,4,2,8};
        System.out.println("Before Sort");
        for(int i:arr) {
        	System.out.print(i+" ");
        }
        bubbleSort(arr);

        System.out.println("");
        System.out.println("Sorted Array:");

        for(int i:arr)
            System.out.print(i+" ");
    }


}
