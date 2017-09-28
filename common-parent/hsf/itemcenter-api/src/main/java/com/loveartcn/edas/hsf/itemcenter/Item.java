package com.loveartcn.edas.hsf.itemcenter;

/**
 * 商品
 * @author win-chen
 *
 */
public class Item {

	private Long itemId;
	private String itemName;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId( Long itemId ) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName( String itemName ) {
		this.itemName = itemName;
	}
	
	@Override
	public String toString() {
		return "Item[id: " + itemId + ", name: " + itemName + "]";
	}

}
