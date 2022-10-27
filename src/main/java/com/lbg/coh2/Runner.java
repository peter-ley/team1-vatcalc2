package com.lbg.coh2;

import java.util.ArrayList;

public class Runner {
	private ArrayList<IUserInput> readers;
	
	public Runner (ArrayList<IUserInput> readers) {
		this.readers = readers;
	}
	
	public Basket run() {
		Basket basket = new Basket();
		String menuInput;
		
		IPrompt prompt = new IPrompt();
		IUserInput menuReader = new MenuReader(prompt);
		
		while(true) {
			
			//Main menu
			//View inventory
			//Add item to basket
			menuInput = menuReader.readFromKeyboard(System.in);
			if (menuInput.equals("1")) {		// View inventory
        			
			} else if (menuInput.equals("2")) {	// Add item to basket
				
			} else if (menuInput.equals("3")) {	// Checkout
				break;
			} else {
				System.out.println("Please choose a valid option...")
			}
			
		return basket;
		}
	}
}
