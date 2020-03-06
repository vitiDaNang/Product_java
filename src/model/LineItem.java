package model;

import java.text.NumberFormat;

public class LineItem {

	private Product mProduct;
	private int mQuantily;
	private double mTotal;
	
	public LineItem() {}

	public Product getmProduct() {
		return mProduct;
	}

	public void setmProduct(Product mProduct) {
		this.mProduct = mProduct;
	}

	public int getmQuantily() {
		return mQuantily;
	}

	public void setmQuantily(int mQuantily) {
		this.mQuantily = mQuantily;
	}

	public double getTotal() {
		return mTotal;
	}

	public void setTotal(double total) {
		this.mTotal = total;
	}
	
	public void calculateTotle() {
		
	}
	
	public String getFormattedTotal() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(this.mTotal);
		return moneyString;
	}
}
