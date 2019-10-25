package com.huanshi.biz.impl;

import java.util.List;

import com.huanshi.biz.IGoodsBiz;
import com.huanshi.dao.IGoodsDao;
import com.huanshi.pojo.GoodsBean;

public class GoodsBizImpl implements IGoodsBiz {
	private IGoodsDao dao;
	
	public GoodsBizImpl() {
		super();
	}

	public GoodsBizImpl(IGoodsDao dao) {
		super();
		this.dao = dao;
	}

	public IGoodsDao getDao() {
		return dao;
	}

	public void setDao(IGoodsDao dao) {
		this.dao = dao;
	}

	@Override
	public List<GoodsBean> getAll(int min,int max) {

		// TODO Auto-generated method stub
		return dao.getGoodsAll(min, max);
	}

	@Override
	public GoodsBean getById(int goods_id) {
		// TODO Auto-generated method stub
		return dao.getGoodsById(goods_id);
	}

	@Override
	public boolean insert(GoodsBean goods) {
		// TODO Auto-generated method stub
		return dao.insertGoods(goods);
	}

	@Override
	public boolean update(GoodsBean goods) {
		// TODO Auto-generated method stub
		return dao.updateGoods(goods);
	}

	@Override
	public boolean delete(int goods_id) {
		// TODO Auto-generated method stub
		return dao.deleteGoods(goods_id);
	}

	

}
