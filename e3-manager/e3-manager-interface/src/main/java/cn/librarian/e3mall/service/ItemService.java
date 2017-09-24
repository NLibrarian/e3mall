package cn.librarian.e3mall.service;

import cn.librarian.e3mall.pojo.TbItem;

/**
 * 商品管理的Service接口
 * @author yacer
 *
 */
public interface ItemService {

	/**
	 *  根据商品Id查询商品信息
	 * @param id
	 * @return
	 */
	public TbItem getItemById(long id);
	
}
