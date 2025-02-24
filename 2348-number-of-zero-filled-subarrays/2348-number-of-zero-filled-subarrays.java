class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long totalCount = 0;
        int previousZeroIndex = -1;
        int subArrLength = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                if(previousZeroIndex == -1){
                    previousZeroIndex = i;
                    subArrLength = 1;

                }else{
                    subArrLength+=1;
                }
                totalCount += subArrLength;
            }else{
                previousZeroIndex = -1;
                subArrLength = 0;
            }
        }

        return totalCount;
    }
}