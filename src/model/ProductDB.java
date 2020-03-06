package model;

import java.util.Scanner;

public class ProductDB {
	
	private Product mProduct;
	private LineItem mLineItem;
	
	/**
	 * input a Product
	 * 
	 * @param product
	 * @return
	 */
	public Product input() {
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input for the Information  Student ");
		
		System.out.println("Code ");
		product.setCode(sc.next());
		
		sc.nextLine();
		
		System.out.println("Description ");
		product.setDescription(sc.next());
		
		sc.nextLine();
		

		System.out.println("Price ");
		product.setPrice(sc.nextDouble());
		
		return product;
	}
	
	public Product getProduct() {
		return mProduct;
	}

	public void setProduct(Product mProduct) {
		this.mProduct = mProduct;
	}
	
	
	
	public Product getProduct(String code) {
		mProduct = input();
		mProduct.setCode(code);
		return mProduct;
	}
	
	public Product getProduct(String code, String description) {
		mProduct = input();
		mProduct.setCode(code);
		mProduct.setDescription(description);
		return mProduct;
	}
}
