package com.huanshi.pojo;

public class ShoppingCartBean {
	private int user_id;
	private int goods_id;
	private String goods_name;
	private double price;
	private int counts;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	public ShoppingCartBean(int user_id, int goods_id, String goods_name, double price, int counts) {
		super();
		this.user_id = user_id;
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.price = price;
		this.counts = counts;
	}
	public ShoppingCartBean() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counts;
		result = prime * result + goods_id;
		result = prime * result + ((goods_name == null) ? 0 : goods_name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + user_id;
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
		ShoppingCartBean other = (ShoppingCartBean) obj;
		if (counts != other.counts)
			return false;
		if (goods_id != other.goods_id)
			return false;
		if (goods_name == null) {
			if (other.goods_name != null)
				return false;
		} else if (!goods_name.equals(other.goods_name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ShoppingCartBean [user_id=" + user_id + ", goods_id=" + goods_id + ", goods_name=" + goods_name
				+ ", price=" + price + ", counts=" + counts + "]";
	}
	
	
	
}
