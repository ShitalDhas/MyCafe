package com.MyCafeManagement.Wrapper;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class ProductWrapper {
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "categoryId")
	private Integer categoryId;
	
	@Column(name = "categoryName")
	private String categoryName;

	

	public ProductWrapper(Integer id, String description, String name, Integer price, String status, Integer categoryId,
			String categoryName) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.price = price;
		this.status = status;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public ProductWrapper() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "ProductWrapper [id=" + id + ", description=" + description + ", name=" + name + ", price=" + price
				+ ", status=" + status + ", categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
}
