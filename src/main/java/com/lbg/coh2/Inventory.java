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
	
	public void randomFillInventory() {
		inventory.add(new Product(100,20,true,20,10032,"32 inch TV",true));
		inventory.add(new Product(200,20,true,5,10040,"40 inch TV",true));
		inventory.add(new Product(300,20,true,2,10055,"55 inch TV",true));
		inventory.add(new Product(20,20,true,5,10101,"Blue Toaster",true));
		inventory.add(new Product(25,20,true,5,10102,"White Toaster",true));
		inventory.add(new Product(30,20,true,5,10201,"Blue Kettle",false));
		inventory.add(new Product(35,20,true,5,10202,"White Kettle",false));
	}
	
	public ArrayList<Product> getInventory() {
		return inventory;
	}
	
	public void viewInventory() {
		System.out.println("\nIN STOCK:\nCost\tVAT\tVAT Applies\tQty\tCode\tDescription\tWarranty");
		inventory.forEach(item -> {
			System.out.print(item.getCost() + "\t");
			System.out.print(item.getVatRate() + "\t");
			System.out.print(item.isVat() + "\t\t");
			System.out.print(item.getStockQty() + "\t");
			System.out.print(item.getpCode() + "\t");
			System.out.print(item.getDescription() + "\t");
			System.out.print(item.isWarranty() + "\t\n");
		});
		System.out.println();
	}
}
