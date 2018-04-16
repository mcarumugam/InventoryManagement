package com.att.action;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

import com.att.bean.InventoryBean;
import com.opensymphony.xwork2.ActionSupport;

public class InventoryAction extends ActionSupport {
	private static final Logger logger = Logger.getLogger(InventoryAction.class);
	
	private static List<InventoryBean> inventoryList = new ArrayList<InventoryBean>();
	private static int autoGen = 0;

	public List<InventoryBean> getInventoryList() {
		return inventoryList;
	}

	public String add() {
		logger.info("Inside Add method...");
		InventoryBean inventoryBean = new InventoryBean();
		inventoryBean.setId(autoGen);
		inventoryBean.setProductId(productId);
		inventoryBean.setName(name);
		inventoryBean.setDesc(desc);
		inventoryBean.setRelatedProd(relatedProd);
		inventoryBean.setImage(image);
		if (!inventoryList.isEmpty()) {
			inventoryList.sort(Comparator.comparing(InventoryBean::getId));
		}
		inventoryList.add(inventoryBean);

		autoGen += 1;
		logger.debug("List size:::"+inventoryList.size());
		logger.info("Exit from Add method...");
		return SUCCESS;
	}

	public String delete() {
		logger.info("inside from delete method...");
		logger.debug("Index to delete ..."+id);
		inventoryList.remove(id);
		inventoryList.sort(Comparator.comparing(InventoryBean::getId));
		logger.debug("List size:::"+inventoryList.size());
		logger.info("Exit from delete method...");
		return SUCCESS;
	}

	private Integer id;
	private String productId;
	private String name;
	private String desc;
	private String relatedProd;
	private String image;

	public String getProductId() {
		return productId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
