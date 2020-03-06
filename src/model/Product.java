package model;

import java.text.NumberFormat;

public class Product {
	
	private String mCode;
	private String mDescription;
	private double mPrice;
	
	public Product() {	
	}

	public Product(String mCode, String mDescription, double mPrice) {
		super();
		this.mCode = mCode;
		this.mDescription = mDescription;
		this.mPrice = mPrice;
	}

	public String getCode() {
		return mCode;
	}

	public void setCode(String mCode) {
		this.mCode = mCode;
	}

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String mDescription) {
		this.mDescription = mDescription;
	}

	public double getPrice() {
		return mPrice;
	}

	public void setPrice(double mPrice) {
		this.mPrice = mPrice;
	}
	
	public String getFormattedPrice(double price) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(price);
		return moneyString;
	}
	

}
