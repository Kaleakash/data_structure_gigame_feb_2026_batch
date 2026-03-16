package com.sorting;

import java.util.*;

public class MergeSortExample {

    static void merge(int arr[], int l, int m, int r){

        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++)
            L[i]=arr[l+i];

        for(int j=0;j<n2;j++)
            R[j]=arr[m+1+j];

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){

            if(L[i]<=R[j])
                arr[k++]=L[i++];
            else
                arr[k++]=R[j++];
        }

        while(i<n1)
            arr[k++]=L[i++];

        while(j<n2)
            arr[k++]=R[j++];
    }

    static void mergeSort(int arr[],int start,int end){

        if(start<end){

            int middle=(start+end)/2;
            System.out.println("middle "+middle);
            mergeSort(arr,start,middle);
            mergeSort(arr,middle+1,end);

            merge(arr,start,middle,end);
        }
    }

    public static void main(String[] args){

        int arr[]={12,11,13,5,6,7};

        mergeSort(arr,0,arr.length-1);

        for(int i:arr)
            System.out.print(i+" ");
    }
}

