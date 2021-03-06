package com.shop.models;

/**
 * @author ankit
 *
 *Entity class for FoodItems.
 *values for vegetarian can be yes or no
 */
public class FoodItems extends Items implements Comparable<FoodItems>  {
	private String dateOfManufacture;
	private String dateOfExpiry;
	private String vegetarian;
	private int quantity;
	public FoodItems() {
		super();
		
	}
	public FoodItems(int itemCode, String itemName, int unitPrice, int quantity) {
		super(itemCode, itemName, unitPrice, quantity);

	}
	public FoodItems(int itemCode, String itemName, int unitPrice, int quantity, String dateOfManufacture,
			String dateOfExpiry, String vegetarian) {
		super(itemCode, itemName, unitPrice, quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
		
	
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfManufacture == null) ? 0 : dateOfManufacture.hashCode());
		result = prime * result + ((vegetarian == null) ? 0 : vegetarian.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
		if (dateOfExpiry == null) {
			if (other.dateOfExpiry != null)
				return false;
		} else if (!dateOfExpiry.equals(other.dateOfExpiry))
			return false;
		if (dateOfManufacture == null) {
			if (other.dateOfManufacture != null)
				return false;
		} else if (!dateOfManufacture.equals(other.dateOfManufacture))
			return false;
		if (vegetarian == null) {
			if (other.vegetarian != null)
				return false;
		} else if (!vegetarian.equals(other.vegetarian))
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + ", quantity=" + quantity + ", itemName=" + itemName + "]";
	}
	@Override
	public int compareTo(FoodItems o) {
		
		return this.getQuantity()-o.getQuantity(); // overriding the compareTo method from comaprator interface.
	}
	
	
	
	

}
