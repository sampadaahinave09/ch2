package com.tnsif.day7.hierarchicaldemo;

public class Television  extends MobilePhone{
	private int screensize;
	private boolean isHD;
	private boolean isLED;
	
	public Television() {
		super();
	}

	public Television(String name, float price, String category, String modelNo, String brand, int memorysize, int screensize, boolean isHD, boolean isLED) {
        super(name, price, category, modelNo, brand, memorysize);
		this.screensize = screensize;
		this.isHD = isHD;
		this.isLED = isLED;
	}

	public int getScreensize() {
		return screensize;
	}

	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}

	public boolean isHD() {
		return isHD;
	}

	public void setHD(boolean isHD) {
		this.isHD = isHD;
	}

	public boolean isLED() {
		return isLED;
	}

	public void setLED(boolean isLED) {
		this.isLED = isLED;
	}

	@Override
	public String toString() {
		return "Television [Screensize=" + screensize + ", isHD=" + isHD + ", isLED=" + isLED + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
