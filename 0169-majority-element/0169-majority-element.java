class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(count == 0){
                majorityElement = nums[i];
                count = 1;
            }else{
                if(nums[i] == majorityElement) count++;
                else count--;
            }
        }

        // verify majority element
        count = 0;
        for(int ele: nums){
            if(ele == majorityElement) count++;
        }

        if(count > nums.length/2) return majorityElement;

        // this should never be the case based on question gaurantee that majority always exists
        return -1;
    }
}