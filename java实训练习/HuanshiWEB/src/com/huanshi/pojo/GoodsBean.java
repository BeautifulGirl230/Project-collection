package com.huanshi.pojo;

public class GoodsBean {
	private int goods_id;//商品编号
	private String goods_name;//商品名称
	private int category_id;//所属类别编号
	private double price;//商品价格
	private int stock;//商品库存
	
	private String imgurl;//商品图片地址
	private String remark;//商品内容说明
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public GoodsBean(int goods_id, String goods_name, int category_id, double price, int stock, String imgurl,
			String remark) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.category_id = category_id;
		this.price = price;
		this.stock = stock;
		this.imgurl = imgurl;
		this.remark = remark;
	}
	public GoodsBean(String goods_name, double price, String imgurl) {
		super();
		this.goods_name = goods_name;
		this.price = price;
		this.imgurl = imgurl;
	}
	
	public GoodsBean(String goods_name, int category_id, double price, int stock, String imgurl, String remark) {
		super();
		this.goods_name = goods_name;
		this.category_id = category_id;
		this.price = price;
		this.stock = stock;
		this.imgurl = imgurl;
		this.remark = remark;
	}
	public GoodsBean() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + category_id;
		result = prime * result + goods_id;
		result = prime * result + ((goods_name == null) ? 0 : goods_name.hashCode());
		result = prime * result + ((imgurl == null) ? 0 : imgurl.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + stock;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoodsBean other = (GoodsBean) obj;
		if (category_id != other.category_id)
			return false;
		if (goods_id != other.goods_id)
			return false;
		if (goods_name == null) {
			if (other.goods_name != null)
				return false;
		} else if (!goods_name.equals(other.goods_name))
			return false;
		if (imgurl == null) {
			if (other.imgurl != null)
				return false;
		} else if (!imgurl.equals(other.imgurl))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GoodsBean [goods_id=" + goods_id + ", goods_name=" + goods_name + ", category_id=" + category_id
				+ ", price=" + price + ", stock=" + stock + ", imgurl=" + imgurl + ", remark=" + remark + "]";
	}
	
}
