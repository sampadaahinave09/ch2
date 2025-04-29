package com.tnsif.day7.hierarchicaldemo;

public class ElectronicGadgets {
	private String name;
	private float price;
	private String category;
	public ElectronicGadgets() {
		super();
	}
	public ElectronicGadgets(String name, float price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "ElectronicGadgets [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	

}
