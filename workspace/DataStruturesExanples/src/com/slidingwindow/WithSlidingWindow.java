package com.slidingwindow;

class WithSlidingWindow {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 3;

        int sum = 0;

        // first window
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        System.out.println("First Sum = " + sum);	// 6

        // slide window
        for(int i = k; i < arr.length; i++) {

            sum = sum - arr[i - k] + arr[i];		// 6-1+4 = 9 
            										// 9-2+5= 12 
            System.out.println("Sum = " + sum);
        }
    }
}

