class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        // reverse entire array
        reverse(nums, 0, nums.length-1);

        // reverse 0 to k-1
        reverse(nums, 0, k-1);

        // reverse k to length-1
        reverse(nums, k, nums.length-1);

    }

    public void reverse(int[] arr, int s, int e){
        int temp;
        while(s<e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}