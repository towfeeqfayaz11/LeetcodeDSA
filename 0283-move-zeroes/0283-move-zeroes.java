class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length==0) return;
        
        int pos = 0;
        for(int ele: nums){
            if(ele != 0){
                nums[pos] = ele;
                pos++;
            }
        }

        while(pos < nums.length){
            nums[pos] = 0;
            pos++;
        }
    }
}