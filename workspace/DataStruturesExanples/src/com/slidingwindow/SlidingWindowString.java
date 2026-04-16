package com.slidingwindow;

class SlidingWindowString {
    public static void main(String[] args) {
    	// Akash
        String str = "abcdefaghibjklmnca";

        boolean[] seen = new boolean[256];

        int left = 0;
        int max = 0;

        for(int right = 0; right < str.length(); right++) {

            while(seen[str.charAt(right)]) {
                seen[str.charAt(left)] = false;
                left++;
            }

            seen[str.charAt(right)] = true;

            int length = right - left + 1;
            max = Math.max(max, length);
        }

        System.out.println("Max Length = " + max);
    }
}

