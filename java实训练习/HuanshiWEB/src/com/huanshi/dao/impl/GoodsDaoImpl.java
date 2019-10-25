package com.huanshi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huanshi.dao.IGoodsDao;
import com.huanshi.pojo.GoodsBean;

public class GoodsDaoImpl implements IGoodsDao {
	private Connection conn;
	
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public GoodsDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	public GoodsDaoImpl() {
		super();
	}

	@Override
	public List<GoodsBean> getGoodsAll(int min,int max) {
		List<GoodsBean> list = new ArrayList<GoodsBean>();
		String sql = "select * from (select GOODS_ID,GOODS_NAME,CATEGORY_ID,PRICE,STOCK,IMGURL,REMARK"
				+ " from GOODS"
				+ " where ROWNUM<=100)temp"
				+ " where temp.GOODS_ID>=? and temp.GOODS_ID <=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, min);
			pstmt.setInt(2, max);
			
			ResultSet rs = pstmt.executeQuery();
		
			while(rs.next()) {
				GoodsBean goodsBean = new GoodsBean();
				goodsBean.setGoods_id(rs.getInt("GOODS_ID"));
				goodsBean.setGoods_name(rs.getString("GOODS_NAME"));
				goodsBean.setCategory_id(rs.getInt("CATEGORY_ID"));
				goodsBean.setPrice(rs.getDouble("PRICE"));
				goodsBean.setStock(rs.getInt("STOCK"));
				goodsBean.setImgurl(rs.getString("IMGURL"));
				goodsBean.setRemark(rs.getString("REMARK"));
				list.add(goodsBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public GoodsBean getGoodsById(int  goods_id) {
		GoodsBean goodsBean=null;
		String sql="select GOODS_ID,GOODS_NAME,CATEGORY_ID,PRICE,STOCK,IMGURL,REMARK from GOODS where goods_id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, goods_id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				goodsBean = new GoodsBean();
				goodsBean.setGoods_id(rs.getInt("GOODS_ID"));
				goodsBean.setGoods_name(rs.getString("GOODS_NAME"));
				goodsBean.setCategory_id(rs.getInt("CATEGORY_ID"));
				goodsBean.setPrice(rs.getDouble("PRICE"));
				goodsBean.setStock(rs.getInt("STOCK"));
				goodsBean.setImgurl(rs.getString("IMGURL"));
				goodsBean.setRemark(rs.getString("REMARK"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goodsBean;
	}

	@Override
	public boolean insertGoods(GoodsBean goods) {
		boolean b= false;
		String sql ="insert into Goods values(user_idzz.nextval,?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getGoods_name());
			pstmt.setInt(2, goods.getCategory_id());
			pstmt.setDouble(3, goods.getPrice());
			pstmt.setInt(4, goods.getStock());
			pstmt.setString(5, goods.getImgurl());
			pstmt.setString(6, goods.getRemark());
			b=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean updateGoods(GoodsBean goods) {
		boolean b = false;
		String sql = "update Goods set goods_name=?,category_id=?,price=?,stock=?,imgurl=?,remark=? where goods_id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getGoods_name());
			pstmt.setInt(2, goods.getCategory_id());
			pstmt.setDouble(3, goods.getPrice());
			pstmt.setInt(4, goods.getStock());
			pstmt.setString(5, goods.getImgurl());
			pstmt.setString(6, goods.getRemark());
			pstmt.setInt(7, goods.getGoods_id());
			b=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean deleteGoods(int goods_id) {
		boolean b=false;
		String sql = "delete from Goods where goods_id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, goods_id);
			b=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

}
