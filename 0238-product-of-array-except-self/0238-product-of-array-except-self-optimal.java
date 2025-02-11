class Solution {
    public int[] productExceptSelf(int[] nums) {
        // optimal approach
        // TC=O(n)
        // SC=O(1)

        int n = nums.length;
        int[] result = new int[n];

        // step1: compute prefix product
        result[0] = 1;
        for(int i=1; i<n; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        // step2: compute suffix product and update result
        int suffixProduct = 1;
        for(int i=n-1; i>=0; i--){
            result[i] = result[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
        }

        return result;
    }
}