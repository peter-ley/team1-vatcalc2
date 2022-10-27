package com.lbg.coh2;

import java.util.ArrayList;

public class Runner {
	
	public Basket run(Inventory stock) {
		Basket basket = new Basket();
		MenuReader menuReader = new MenuReader();
		PCodeReader pCodeReader = new PCodeReader();
		QtyReader qtyReader = new QtyReader();
		String menuInput, pCodeInput, qtyInput;
		
		while(true) {
			//Main menu
			menuInput = menuReader.readFromKeyboard(System.in);
			if (menuInput.equals("1")) {		// View inventory
        		stock.viewInventory();
			} else if (menuInput.equals("2")) {	// Add item to basket
				pCodeInput = pCodeReader.readFromKeyboard(System.in);
				qtyInput = qtyReader.readFromKeyboard(System.in);
				Product product = findProduct(pCodeReader, stock);
				Item newItem = new Item(pCodeInput,qtyInput);
				basket.addToBasket(null);
			} else if (menuInput.equals("3")) {	// Checkout
				break;
			} else {
				System.out.println("Please choose a valid option...");
			}
			
		}
		return basket;
	}
	
	public Product findProduct(String pCode, Inventory inventory) {
		ArrayList<Product> stock = inventory.getInventory();
		stock.forEach(item ->{
			if (item.getpCode() == Integer.parseInt(pCode)) {
				Product product = item;
			}
		});
		return product;
	}
}
