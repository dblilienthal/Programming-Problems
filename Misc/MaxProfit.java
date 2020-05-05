/*
 *Because test1 and test2 want the index of the buy and sell numbers but test3 still needs an
 *integer value, i made both the buy and sell return -1 if you cannot make a profit
 */


public class MaxProfit {
    
    public static void main(String[] args) {
        
        int[] test1 = {1, 3, 5, 4, 3, 5, 10, 9, 8, 4, 9};
        System.out.println("test1 ======================================");
        printTest(test1);
        Profit x1 = maxProfit( test1 );
        System.out.println("expected answer is buy at 1, sell at 10");
        System.out.println("actual answer is buy at "+test1[x1.buy]+" sell at "+test1[x1.sell]); //Original Case
        //System.out.println("actual answer is buy at "+x1.buy+" sell at "+x1.sell);
        
        int[] test2 = { 2, 3, 1, 5, 6, 9, 10, 15, 14 };
        System.out.println("test2 ======================================");
        printTest(test2);
        System.out.println("expected answer is buy at 1, sell at 15 ");
        Profit x2 = maxProfit(test2);
        System.out.println("actual answer is buy at "+test2[x2.buy]+" sell at "+test2[x2.sell]); //Original Case
        //System.out.println("actual answer is buy at "+x2.buy+" sell at "+x2.sell);
        
        int[] test3 = {15, 12, 11, 9, 7, 5, 3, 1};
        System.out.println("test3 ======================================");
        printTest(test3);
        System.out.println("expected answer is no profit");
        Profit x3 = maxProfit(test3);
        System.out.println("actual answer is buy:"+x3.buy + " sell:" + x3.sell);
    }
    
    public static void printTest(int[] a){
        for (int i: a){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
    
    public static Profit maxProfit(int[] prices){
    	int buy = prices[0];
    	int sell = prices[0];
    	int buyIndex = 0;
    	int sellIndex = 0;
    	// This flag is to make sure that you cannot sell less than you buy
    	boolean flag = false;
    	for (int i=0; i<prices.length; i++) {
    		if (prices[i] > sell) {
    			sell = prices[i];
    			sellIndex = i;
    			flag = true;
    			continue;
    		}
    		if (prices[i] < buy) {
    			buy = prices[i];
    			buyIndex = i;
    		}
    	}
    	if (flag) {
            return new Profit(buyIndex, sellIndex);
    	}
    	return new Profit(-1, -1);
    }
    
    public static class Profit {
        int buy;
        int sell;
        
        public Profit(int buy, int sell){
            this.buy = buy;
            this.sell = sell;
        }
    }
}