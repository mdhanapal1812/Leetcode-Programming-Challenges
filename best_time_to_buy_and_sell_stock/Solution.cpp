class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<=prices.length-1;j++){
                if((prices[j]-prices[i]) >maxProfit)
                {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        if(maxProfit < 0){
            return 0;
        }
return maxProfit;
        
    }
}