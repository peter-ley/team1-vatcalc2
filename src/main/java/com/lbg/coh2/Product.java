package com.lbg.coh2;

public class Product {
	
	private double cost;
	private double vatRate;
	private boolean vat;
	private int stockQty;
	private int pCode;
	private String description;
	private boolean warranty;
	
	public Product(double cost, double vatRate, boolean vat, int stockQty,  int pCode, String description, boolean warranty) {
		this.cost = cost;
		this.vatRate = vatRate;
		this.vat = vat;
		this.stockQty = stockQty;
		this.pCode = pCode;
		this.description = description;
		this.warranty = warranty;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getVatRate() {
		return vatRate;
	}

	public void setVatRate(double vatRate) {
		this.vatRate = vatRate;
	}

	public boolean isVat() {
		return vat;
	}

	public void setVat(boolean vat) {
		this.vat = vat;
	}

	public int getStockQty() {
		return stockQty;
	}

	public void setStockQty(int stockQty) {
		this.stockQty = stockQty;
	}

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}
}
