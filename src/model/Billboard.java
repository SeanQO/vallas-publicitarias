package model;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Billboard implements Serializable {

	private static final long serialVersionUID = 1;

	private double height;
	private double width;
	private boolean inUse;
	private String brand;

	public Billboard(float height, float width, boolean inUse, String brand) {
		this.height = height;
		this.width = width;
		this.inUse = inUse;
		this.brand = brand;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public boolean isInUse() {
		return inUse;
	}

	public String getBrand() {
		return brand;
	}

	public double calculateArea() {
		double area = 0;

		return area;
	}

}
