package prep_2019;

public class MaximumProfitStockPrice {
	
	public static void main(String args []) {
		
		//Maximum Number of Transactions "K"
		int k = 3; 
        //int price[] = {12, 14, 17, 10, 14, 13, 12, 15};
        
        
        int price[] = {2,5,7,1,4,3,1,3};
        
        // 12- 17 = 5
        // 10-14 = 4
        //12-15 = 3
        
        int n = price.length;  
        System.out.println("Maximum profit is: " +  
                            maxProfit(price, n, k)); 
	}
	
	public static int maxProfit(int price [], int n, int k) {
		        int profit[][] = new int[k + 1][ n + 1]; 
		        for (int i = 0; i <= k; i++) 
		            profit[i][0] = 0; 
		        for (int j = 0; j <= n; j++) 
		            profit[0][j] = 0; 
		        for (int i = 1; i <= k; i++)  
		        { 
		            int prevDiff = Integer.MIN_VALUE; 
		            for (int j = 1; j < n; j++)  
		            { 
		                prevDiff = Math.max(prevDiff,  
		                           profit[i - 1][j - 1] -  
		                           price[j - 1]); 
		                profit[i][j] = Math.max(profit[i][j - 1],  
		                               price[j] + prevDiff); 
		            } 
		        } 		  
		        return profit[k][n - 1]; 
		    } 
	}
