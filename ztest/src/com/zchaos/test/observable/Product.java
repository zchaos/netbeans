package com.zchaos.test.observable;

import java.util.Observable;

public class Product extends Observable {
	public static void main(String[] args) {
		Product product = new Product();
		product.addObserver(new NameObserver());
		product.addObserver(new PriceObserver());
		product.setName("aa");
		product.setPrice(1.2f);
	}

	private String name;
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers(name);
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		setChanged();
		notifyObservers(price);
	}
}
