package com.loveartcn.edas.hsf.itemcenter;

/**
 * 商品服务接口
 * @author win-chen
 *
 */
public interface ItemService {

	public Item getItemById( long id );
	
	public Item getItemByName( String name );
	
}
