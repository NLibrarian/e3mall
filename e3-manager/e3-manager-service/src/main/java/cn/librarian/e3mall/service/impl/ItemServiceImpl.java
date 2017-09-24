package cn.librarian.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.librarian.e3mall.mapper.TbItemMapper;
import cn.librarian.e3mall.pojo.TbItem;
import cn.librarian.e3mall.pojo.TbItemExample;
import cn.librarian.e3mall.pojo.TbItemExample.Criteria;
import cn.librarian.e3mall.service.ItemService;

/**
 * 商品管理Service
 * 
 * @author yacer
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long id) {
		// 根据id查询商品
		// TbItem item = itemMapper.selectByPrimaryKey(id); //根据id查询商品信息
		// 根据条件查询商品信息
		// 创建一个条件对象
		TbItemExample example = new TbItemExample();
		//创建一个criteria对象
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<TbItem> listItem = itemMapper.selectByExample(example);
		if (listItem != null && listItem.size()>0 ) {
			return listItem.get(0);
		}
		return null;
	}

}
