package com.sorting;

import java.util.*;

// 3,6,1,8,9,4,5
// key 2

public class InsertionSortExample {

    public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1]=arr[j];
                j--;
            }
            System.out.println("After "+i+" Pass");
            for(int a:arr) {
            	System.out.print(a+" ");
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {

        int arr[]={8,3,5,2};
        System.out.println("Before Sort");
        for(int i:arr)
            System.out.print(i+" ");
        
        insertionSort(arr);

        System.out.println("After Sort");
        for(int i:arr)
            System.out.print(i+" ");
    }
}
