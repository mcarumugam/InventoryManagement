package com.att.bean;

public class InventoryBean {
	
	 private int id;
	 private String productId;
	 private String name;
	 private String desc;
	 private String relatedProd;
	 private String image;
	 
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRelatedProd() {
		return relatedProd;
	}
	public void setRelatedProd(String relatedProd) {
		this.relatedProd = relatedProd;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
