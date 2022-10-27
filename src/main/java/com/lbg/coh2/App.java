package com.lbg.coh2;

public class App 
{
    public static void main( String[] args )
    {
    	Inventory stock = new Inventory();
    	stock.randomFillInventory();
    	
    	Runner rnr = new Runner();
    	Basket basket = rnr.run(stock);
    	
    	
    }
}
