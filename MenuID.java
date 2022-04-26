package com.java.jdbc;

public class MenuID {
	private int MenuID;
	private int RestaurantID;
	private String ItemName ;
	private Double Price;
	private String Rating ;
	public int getMenuID() {
		return MenuID;
	}
	public void setMenuID(int menuID) {
		MenuID = menuID;
	}
	public int getRestaurantID() {
		return RestaurantID;
	}
	public void setRestaurantID(int restaurantID) {
		RestaurantID = restaurantID;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "MenuID [MenuID=" + MenuID + ", RestaurantID=" + RestaurantID + ", ItemName=" + ItemName + ", Price="
				+ Price + ", Rating=" + Rating + "]";
	}
	
}
