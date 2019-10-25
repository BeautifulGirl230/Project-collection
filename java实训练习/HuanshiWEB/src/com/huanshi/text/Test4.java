package com.huanshi.text;

import java.sql.Connection;
import java.util.List;

import com.huanshi.biz.IGoodsBiz;
import com.huanshi.biz.impl.GoodsBizImpl;
import com.huanshi.conn.HuanConnection;
import com.huanshi.dao.IGoodsDao;
import com.huanshi.dao.impl.GoodsDaoImpl;
import com.huanshi.pojo.GoodsBean;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = new HuanConnection().getConn();
		IGoodsDao dao = new GoodsDaoImpl(conn);
		IGoodsBiz biz = new GoodsBizImpl(dao);
		
		List<GoodsBean> list = biz.getAll(1,8);
		for (GoodsBean goodsBean : list) {
			System.out.println(goodsBean);
		}
	}

}
