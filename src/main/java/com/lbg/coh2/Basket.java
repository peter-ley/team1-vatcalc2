package com.lbg.coh2;

import java.util.ArrayList;

public class Basket {
	
	private ArrayList<Item> basket;
	
	public Basket() {
		this.basket = new ArrayList<Item>();
	}
	
	public void addToBasket(Item item) {
		basket.add(item);
	}
	
	public void printBasket() {
		
	}
}
