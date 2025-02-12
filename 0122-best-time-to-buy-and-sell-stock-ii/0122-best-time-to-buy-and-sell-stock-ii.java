class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        int maxSum = 0;
        for(int i=1; i<n; i++){
            result[i] = prices[i] - prices[i-1];
            if(result[i] > 0)
                maxSum += result[i];
        }

        return maxSum;
        
    }
}