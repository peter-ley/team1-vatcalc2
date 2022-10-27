package com.lbg.coh2;

import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Product> inventory;
	
	public Inventory() {
		inventory = new ArrayList<Product>();
	}
	
	public void addToInventory(Product product) {
		inventory.add(product);
	}
}
