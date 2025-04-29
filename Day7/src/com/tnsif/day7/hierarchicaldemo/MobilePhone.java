package com.tnsif.day7.hierarchicaldemo;

public class MobilePhone extends ElectronicGadgets {
	
       private String modelNo;
       private String brand;
       private int memorysize;
       
	public MobilePhone() {
		super();
	}

	public MobilePhone(String name, float price, String category, String modelNo, String brand, int memorysize) {
		super(name, price, category);
		this.modelNo = modelNo;
		this.brand = brand;
		this.memorysize = memorysize;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMemorysize() {
		return memorysize;
	}

	public void setMemorysize(int memorysize) {
		this.memorysize = memorysize;
	}

	@Override
	public String toString() {
		return "MobilePhone [modelNo=" + modelNo + ", brand=" + brand + ", memorysize=" + memorysize + ", toString()="
				+ super.toString() + "]";
	}

	
       
       
}


