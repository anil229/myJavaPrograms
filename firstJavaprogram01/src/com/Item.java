package com;

public class Item {
	private int ItemId;
	private String ItemName;
	private float ItemPrice;
	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return ItemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return ItemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * @return the itemPrice
	 */
	public float getItemPrice() {
		return ItemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(float itemPrice) {
		ItemPrice = itemPrice;
	}
	public Item() {
		super();
	}
	public Item(int itemId, String itemName, float itemPrice) {
		super();
		ItemId = itemId;
		ItemName = itemName;
		ItemPrice = itemPrice;
	}
}
