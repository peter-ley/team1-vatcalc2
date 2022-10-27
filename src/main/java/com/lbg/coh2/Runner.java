package com.lbg.coh2;

import java.util.ArrayList;

public class Runner {
	private ArrayList<IUserInput> readers;
	
	public Runner (ArrayList<IUserInput> readers) {
		this.readers = readers;
	}
	
	public Basket run() {
		Basket basket = new Basket();
		MenuReader menuReader = new MenuReader();
		PCodeReader pCodeReader = new PCodeReader();
		QtyReader qtyReader = new QtyReader();
		String menuInput, pCodeInput, qtyInput;
		
		while(true) {
			//Main menu
			menuInput = menuReader.readFromKeyboard(System.in);
			if (menuInput.equals("1")) {		// View inventory
        			
			} else if (menuInput.equals("2")) {	// Add item to basket
				pCodeInput = pCodeReader.readFromKeyboard(System.in);
				qtyInput = qtyReader.readFromKeyboard(System.in);
				
			} else if (menuInput.equals("3")) {	// Checkout
				break;
			} else {
				System.out.println("Please choose a valid option...")
			}
			
		return basket;
		}
	}
}
