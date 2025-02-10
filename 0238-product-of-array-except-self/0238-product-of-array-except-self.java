class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];


        // calculate product of all non zero elements (skipping zero elements)
        int product = 1;
        // keep track of zero count
        int countZeros = 0;

        for(int ele: nums){
            if (ele != 0) product*=ele;
            else countZeros++;
        }

        // if countZeros is greater than 1, then all elements will be zero
        if(countZeros > 1)
            return result;
        // if count zero exactly one, then only one element will be non zero in result, rest will be zero
        else if(countZeros == 1){
            for(int i=0; i<n; i++){
                if(nums[i] == 0) result[i] = product;
            }

            return result;
        }

        // incase there are no zeros, prerpare result array
        for(int i=0; i<n; i++){
            result[i] = product/nums[i];
        }

        return result;
        
    }
}