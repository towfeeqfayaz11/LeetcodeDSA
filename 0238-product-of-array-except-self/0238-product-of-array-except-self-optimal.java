class Solution {
    public int[] productExceptSelf(int[] nums) {
        // using prefix and suffix product array
        // Approach:
        //  - prefix array for index i will store product of all elements from start till i-1
        //  - suffix array for index i will store product of all elements from end till i+1

        int n = nums.length;
        int[] prefixProd = new int[n];
        int[] suffixProd = new int[n];
        int[] result = new int[n]; // stores final result
        prefixProd[0] = 1; // because there are no elements on left size of index zero, so default product is 1
        suffixProd[n-1] = 1; // because there are no elements on right size of index n-1, so default product is 1

        for(int i=1;i<n; i++){
            prefixProd[i] = prefixProd[i-1] * nums[i-1];
        }
        
        for(int j=n-2; j>=0;j--){
            suffixProd[j] = suffixProd[j+1] * nums[j+1];
        }

        // final result array as product of prefix and suffix element
        for(int i=0; i<n; i++){
            result[i] = prefixProd[i] * suffixProd[i];
        }

        return result;
    }
}